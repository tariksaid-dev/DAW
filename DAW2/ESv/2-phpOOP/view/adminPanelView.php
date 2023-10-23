<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <style>
    <?php include "styles.css" ?>
  </style>
  <title>TSM - ADMINPANEL</title>
</head>
<header>
  <div class="user-header-settings">
    <a class='btn' href='index.php'>Volver a publicaciones</a>
  </div>
  <div class="user-header-settings">
    <?php
    echo "<span>" . $_SESSION["user"]->getName() . "</span>";
    echo "<img src='public/img/default-user.jpg' class='user-img'/>";
    echo "<a class='btn' href='index.php?main=auth&salir' >SALIR</a>";
    ?>
  </div>
</header>
<?php
$users = UserRepository::getAllUsers();
?>

<body>
  <div class="admin-panel-layout">
    <?php
    foreach ($users as $user) {
      if ($user->getId() != $_SESSION["user"]->getId()) {
        echo "<article class='admin-panel-user'>";
        echo "<div>";
        echo "<img src='public/img/" . $user->getImg() . "' class='user-img'>";
        echo "<span>" . $user->getName() . "</span>";
        echo "<span>#" . $user->getId() . "</span>";
        echo "</div>";
        echo "<div>";
        echo "<select id='rolSelect' dataId='" . $user->getId() . "'>";

        foreach ($user->userRoleState() as $key => $value) {
          echo "<option value='" . $key . "'";
          if ($user->isAdmin() && $key === 1) {
            echo " selected";
          }
          echo " >$value</option>";
        }
        echo "</select>";
        echo "<a class='btn commit-btn' dataId='" . $user->getId() . "'>Commit</a>";
        echo "<a class='btn' href='index.php?main=user&deleteUser=" . $user->getId() . "'>Delete</a>";
        echo "</div>";
        echo "</article>";
      }
    }
    ?>
  </div>

  <script type="text/javascript">
    const commitBtn = document.querySelectorAll('.commit-btn');

    commitBtn.forEach(button => {
      button.addEventListener('click', () => {
        const userId = button.getAttribute('dataId');
        const selectedElement = button.previousElementSibling;
        const selectedValue = selectedElement.value;

        const href = 'index.php?main=user&updateRol=' + userId + '&rol=' + selectedValue;

        window.location.href = href;
      });
    });
  </script>
</body>

</html>