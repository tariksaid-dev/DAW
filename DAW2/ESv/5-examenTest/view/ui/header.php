<header>
  <div class="user-header-settings">
    <?php
    if ($_SESSION["user"]->isAdmin()) {
      echo "<a class='btn' href='index.php?main=user&adminPanel'>Administrar usuarios</a>";
      echo "<a class='btn'>Eres ADMIN</a>";
    }

    if ($_SESSION["user"]->isClient()) {
      echo "<a class='btn' href='index.php?main=ticket&crearTicket'>Crear ticket</a>";
      echo "<a class='btn'>Eres CLIENTE</a>";
    }
    if ($_SESSION["user"]->isEmployee()) {
      echo "<a class='btn' href='index.php?main=ticket&addProduct'>Responder ticket</a>";
      echo "<a class='btn'>Eres EMPLOYEE</a>";
    }
    ?>

  </div>
  <div class="user-header-settings">
    <?php
    echo "<span>" . $_SESSION["user"]->getName() . "</span>";
    echo "<img src='public/img/default-user.jpg' class='user-img'/>";
    echo "<a class='btn' href='index.php'>Volver a main</a>";
    echo "<a class='btn' href='index.php?main=user&salir' >SALIR</a>";
    ?>
  </div>
</header>