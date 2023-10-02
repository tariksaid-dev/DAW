---
title: "Tema 1: Implantación de arquitecturas web"
author: [Tarik Said Manjón]
date: "2º DAW"
lang: "es"
colorlinks: true
code-block-font-size: '\large'
listings-no-page-break: true
header-includes:
  - |
    ```{=latex}
    \usepackage{awesomebox}
    \usepackage{graphicx}
    ```
pandoc-latex-environment:
  noteblock: [note]
  tipblock: [tip]
  warningblock: [warning]
  cautionblock: [caution]
  importantblock: [important]
...

5. **Investiga en la web para qué se utiliza la herramienta curl (puedes ejecutar man curl para obtener ayuda). Indica que es lo que hacen los siguientes comandos**:

- Es una herramienta de la CLI usada para transferir o recibir datos de un servidor a través de distintos protocolos de red. Su nombre significa "Client for URLs", o cURL.

- `curl www.google.es`: Realiza una solicitud HTTP GET a la web de Google, lo que nos devuelve el código fuente de la página.
- `curl --request GET www.google.es`: Es idéntico al comando anterior. Lo normal si usamos --request es utilizar un POST, PUT o DELETE.
- `curl -X GET www.google.es`: Igual a los casos anteriores, "-X" se debería utilizar cuando deseamos especificar un método HTTP distinto al pretederminado.
- `curl -X GET -I www.google.es`: En este caso, también se hace una solicitud GET a Google, pero la flag "-I" indica que solo queremos la cabecera de la solicitud.
- `curl -X GET -i www.google.es`: Este comando devuelve tanto la cabecera como la respuesta.

---

# Instalación de Apache

Empezaremos instalando apache mediante el siguiente comando:

```bash
sudo apt install apache2 apache2-utils
```

Y comprobaremos que está funcionando mediante `systemctl status apache2`. Además, podremos comprobar la versión con `apache2 -v`

\begin{center}
\includegraphics[width=0.7\columnwidth]{./img/1.png}
\end{center}

Una vez confirmemos que está instalado correctamente, si en el navegador de nuestro host escribimos la dirección ip de nuestra máquina virtual podremos entrar a la página por defecto de Apache.

\begin{center}
\includegraphics[width=0.7\columnwidth]{./img/2.png}
\end{center}

Para finalizar la instalación cambiaremos el usuario y el grupo de "var/www/html" a "www-data":

\begin{center}
\includegraphics[width=0.7\columnwidth]{./img/3.png}
\end{center}

# Instalación de MariaDB

Para instalar MariaDB en nuestro servidor utilizaremos este comando:

```bash
sudo apt install mariadb-server mariadb-client -y
```

Y de nuevo, revisaremos su correcto funcionamiento mediante `systemctl status mariadb`, y su versión mediante `mariadb --version`.

\begin{center}
\includegraphics[width=0.7\columnwidth]{./img/4.png}
\end{center}

# Instalación de PHP

Para instalar PHP y sus diferentes dependencias, usaremos el siguiente comando:

```bash
sudo apt install php7.4 libapache2-mod-php7.4 php7.4-mysql php7.4-cli php7.4-common php7.4-json php7.4-opache php7.4-readline -y
```

Y, de nuevo, comprobamos que se ha instalado correctamente con `php --version`:

\begin{center}
\includegraphics[width=0.7\columnwidth]{./img/5.png}
\end{center}

Además, si añadimos un archivo php en `/var/www/html` con el siguiente código:

```php
<?php phpinfo(); ?>
```

Desde nuestro cliente podremos acceder a ella:

\begin{center}
\includegraphics[width=0.7\columnwidth]{./img/6.png}
\end{center}

# Instalación de phpMyAdmin

En esta ocasión, el comando será:

```bash
sudo apt install phpmyadmin -y
```

Y debemos seleccionar la configuración del servidor web a utilizar, el cual será apache2, y responderemos sí a la pregunta de configurar la base de datos para phpMyAdmin con "dbconfig-common".

Para comprobar su funcionamiento, desde el cliente iremos a "dirección-ip/phpmyadmin", y podremos loguear con nuestro usuario y clave.

\begin{center}
\includegraphics[width=0.7\columnwidth]{./img/7.png}
\end{center}
