<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <style>
    <?php include "styles.css" ?>
  </style>
  <title>TSM - Login</title>
</head>

<body>
  <div class="login-layout">
    <form action='index.php?main=auth' method='POST'>
      <h1>Login</h1>
      <input type='text' id='user' name='user' placeholder='Username'>
      <input type='password' id='password' name='password' placeholder='Password'>
      <input type='submit' name='login' class="btn">
    </form>
    <span>No estás <a href="index.php?main=auth&newUser">registrado?</a></span>
  </div>
</body>

</html>