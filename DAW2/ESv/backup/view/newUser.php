<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <style>
    <?php include "styles.css" ?>
  </style>
  <title>TSM - New user</title>
</head>

<body>
  <div class="login-layout">
    <form action='index.php' method='POST'>
      <h1>New user</h1>
      <input type='text' id='user' name='user' placeholder='Username'>
      <input type='password' id='password' name='password' placeholder='Password'>
      <input type='submit' name='register' class="btn">
    </form>
    <span>Ya estás <a href="index.php?salir">registrado?</a></span>
  </div>
</body>

</html>