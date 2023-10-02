<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <title>TSM - Películas</title>
  <link rel="stylesheet" href="styles.css">
</head>

<body>
  <div class="app-layout">
    <?php
    session_start();
    error_reporting(E_ALL);
    ini_set('display_errors', 1);
    require_once("db.php");
    $bd = Conectar::conexion();

    function fetchFilms($bd)
    {
      $q = "SELECT * FROM pelis";
      $result = $bd->query($q);
      while ($row = $result->fetch_assoc())
        $films[] = $row;
      return $films;
    }

    function insertFilm($bd)
    {
      $title = $_POST["fname"];
      $year = $_POST["año"];
      $poster = $_POST["poster"];

      $q = "INSERT INTO pelis (titulo, año, poster) VALUES ('" . $title . "', " . $year . ", '" . $poster . "')";

      $result = $bd->query($q);
      return $result;
    }

    function deleteFilm($bd)
    {
      $q = "DELETE FROM pelis WHERE id =" . $_GET["deleted_id"];
      // var_dump($q);
      $result = $bd->query($q);
      header("Location: /1-phpMovieRating/main.php");
      return $result;
    }

    function hasVoted($bd, $pelicula_id)
    {
      $user_id = $_SESSION["user_id"];

      $q = "SELECT * FROM votos WHERE user_id = $user_id AND pelicula_id = $pelicula_id";
      $result = $bd->query($q);
      return $result->num_rows;
    }

    function insertVote($bd)
    {
      $user_id = $_SESSION["user_id"];
      $film_id = $_GET["votar_id"];

      if (!hasVoted($bd, $film_id)) {
        $q = "INSERT INTO votos (user_id, pelicula_id) VALUES ($user_id, $film_id)";
        $result = $bd->query($q);
        header("Location: /1-phpMovieRating/main.php");
        return $result;
      } else {
        header("Location: /1-phpMovieRating/main.php");
        return false;
      }
    }

    function isLoged()
    {
      return !empty($_SESSION) && $_SESSION["loged"] == true;
    }

    // GET
    if (!empty($_GET)) {
      isset($_GET["deleted_id"]) && deleteFilm($bd);
      isset($_GET["votar_id"]) && insertVote($bd); // TODO
    }

    // POST
    if (!empty($_POST)) {
      isset($_POST["fname"]) && insertFilm($bd);
    }
    ?>

    <!-- ASIDE -->
    <aside>
      <?php
      if (isLoged()) {
        echo "<h1>Bienvenido de nuevo " . $_SESSION["username"] . " 🎉</h1>";
        echo "<h2>Si quieres salir, pulsa <a href='/1-phpMovieRating/login.php'>AQUÍ</a> </h2>";
        echo "<form action='main.php' class='flex-box sm-gap' method='POST'>
        <input type='text' id='fname' name='fname' placeholder='Título'><br>
        <input type='text' id='año' name='año' placeholder='Año'><br>
        <input type='text' id='poster' name='poster' placeholder='Url del poster'><br>
        <input type='submit' class='btn' value='Añadir película'>
        </form>";
      } else {
        echo "<h1>Si quieres añadir películas y votar por tus favoritas, regístrate <a href='/1-phpMovieRating/login.php'>AQUÍ</a></h1>";
      }
      ?>
    </aside>

    <!-- MAIN -->
    <main>
      <?php
      echo "<ul class='film-layout'>";
      if (isLoged()) {
        foreach (fetchFilms($bd) as $data) {
          echo "<li><span><b>" . $data["titulo"] . "</b><a href='main.php/delete?deleted_id=" . $data['id'] . "'> ❌</a><br>" . $data["año"] . "<br>
          " . $data["likes"] . "<a href='/1-phpMovieRating/main.php/votar?votar_id=" . $data['id'] . "'> ❤️</a></span><br>
          <img src='" . $data["poster"] . "'/> </li>";
        }
      } else {
        foreach (fetchFilms($bd) as $data) {
          echo "<li><span><b>" . $data["titulo"] . "</b><br>" . $data["año"] . "<br>" . $data["likes"] . " ❤️</span><br>
          <img src='" . $data["poster"] . "'/> </li>";
        }
      }
      echo "</ul>";
      ?>
    </main>
</body>

</html>