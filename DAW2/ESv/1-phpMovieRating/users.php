<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <link rel="stylesheet" href="styles.css">
  <title>TSM - Users</title>
</head>

<body>
  <main>
    <?php
    session_start();
    error_reporting(E_ALL);
    ini_set('display_errors', 1);
    require_once("db.php");
    $bd = Conectar::conexion();

    function fetchUsuarios($bd)
    {
      $q = "SELECT * from users WHERE id <> '" . $_SESSION["user_id"] . "'";
      $result = $bd->query($q);
      while ($row = $result->fetch_assoc()) {
        $usuarios[] = $row;
      }
      return $usuarios;
    }

    function banUsuario($bd)
    {
      $q = "UPDATE users SET deleted = CASE WHEN deleted = 0 THEN 1 WHEN deleted = 1 THEN 0 END WHERE id = '" . $_GET["ban_id"] . "'";
      $bd->query($q);
      header("Location: /users.php");
      return true;
    }

    function fetchFollows($bd)
    {
      $q = "SELECT * from follows";
      $result = $bd->query($q);
      while ($row = $result->fetch_assoc())
        $follows[] = $row;
      return $follows;
    }

    function checkFollowingState($bd, $followed_user_id)
    {
      $current_user_id = $_SESSION["user_id"];

      $q = "SELECT following FROM follows WHERE user_id = $current_user_id AND followed_user_id = $followed_user_id AND following = 1";
      $result = $bd->query($q);
      return $result->num_rows === 0;
    }

    function isFollowing($bd, $followed_user_id)
    {
      $user_id = $_SESSION["user_id"];
      $checkQuery = "SELECT * FROM follows WHERE user_id = $user_id AND followed_user_id = $followed_user_id";
      $checkResult = $bd->query($checkQuery);
      return $checkResult->num_rows === 0;
    }

    function insertFollow($bd)
    {
      $user_id = $_SESSION["user_id"];
      $followed_user_id = $_GET["follow_id"];

      if (isFollowing($bd, $_GET["follow_id"])) {
        $q = "INSERT INTO follows (user_id, followed_user_id, following) VALUES ($user_id, $followed_user_id, 1)";
        $bd->query($q);
      } else {
        $q = "UPDATE follows SET following = CASE WHEN following = 0 THEN 1 WHEN following = 1 THEN 0 END WHERE user_id = $user_id AND followed_user_id = $followed_user_id";
        $bd->query($q);
      }
      header("Location: /users.php");
      return true;
    }

    if (!empty($_GET)) {
      isset($_GET["ban_id"]) && banUsuario($bd);
      isset($_GET["follow_id"]) && insertFollow($bd);
    }

    echo "<ul class='film-layout'>";
    foreach (fetchUsuarios($bd) as $users) {
      if ($_SESSION) {
        if ($users["deleted"] != 1 && $_SESSION["rol"] != 2) {
          echo "<li>Username: <b>" . $users["name"] . "</b><br>";
          // falta condicional para brokenHearth si estoy siguiendo y voy a dejar de seguir
    
          echo "<a href='users.php/follow?follow_id=" . $users['id'] . "'>❤️</a>";
          if ($_SESSION["rol"] == 2) {
            if ($users["deleted"] == 1) {
              echo "<span>Banned, unban here &rarr;</span>";
            }
            echo "<a href='users.php/ban?ban_id=" . $users['id'] . "'>❌</a>";
          }
          echo "</li>";
        } else {
          echo "<li>Username: <b>" . $users["name"] . "</b><br>";
          if ($_SESSION["loged"]) {
            echo "<a href='users.php/follow?follow_id=" . $users['id'];

            //TODO
            // Check later, i dont like this data structure 
            // 1. Follow is in the db and with step 3 it equals 0 (currently unfollowed)
            if (isFollowing($bd, $users["id"])) {
              echo "'>❤️</a>";
              // 2. In the db but following equals 0
            } elseif (!isFollowing($bd, $users["id"]) && checkFollowingState($bd, $users["id"])) {
              echo "'>❤️</a>";
              //3. Follow in the db, and following equals 1 (currently following)
            } elseif (!isFollowing($bd, $users["id"]) && !checkFollowingState($bd, $users["id"])) {
              echo "'>💔</a>";
            }
            if ($_SESSION["rol"] == 2) {
              if ($users["deleted"] == 1) {
                echo "<span>Banned, unban here &rarr;</span>";
              }
              echo "<a href='users.php/ban?ban_id=" . $users['id'] . "'>❌</a>";
            }
          }
          echo "</li>";
        }
      } else {
        header("Location: /login.php");
      }
    }
    echo "</ul>";
    ?>
  </main>
</body>

</html>