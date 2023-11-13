---
title: "Tema 2: Configuración y administración de servidores Web"
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

6. **Desplegar las aplicaciones vistas en los puntos 8.2 y 8.3 (añadir acceso mediante HTTPS).**

# OpenCart

Para empezar, cambiaremos la versión de php a la deseada (en este caso, la 8.1) mediante el comando `sudo update-alternatives --config php`:

\begin{center}
\includegraphics[width=0.7\columnwidth]{./img/1.png}
\end{center}

Y también añadiremos una entrada en /etc/hosts en nuestro cliente con la dirección ip del servidor y el nombre del dominio:

\begin{center}
\includegraphics[width=0.7\columnwidth]{./img/2.png}
\end{center}

A continuación, clonaremos el repositorio dónde se encuentra la web que queremos desplegar:

\begin{center}
\includegraphics[width=0.7\columnwidth]{./img/3.png}
\end{center}

El siguiente paso será crear el archivo .conf del host virtual de la web en /etc/apache2/sites-available:

\begin{center}
\includegraphics[width=0.7\columnwidth]{./img/4.png}
\end{center}

Y añadiremos el contenido de la carpeta `upload` que acabamos de clonar desde github (donde se encuentra el index.php) en la ruta que hemos especificado en nuestro archivo de configuración:

\begin{center}
\includegraphics[width=0.7\columnwidth]{./img/5.png}
\end{center}

Una vez con los archivos en su sitio, le daremos permisos y configuraremos su grupo al usuario y grupo www-data, y activaremos el sitio y reiniciaremos apache con los siguientes comandos:

```bash
sudo chown -R www-data:www-data /var/www/html/tienda-virtual
sudo chmod -R 755 /var/www/html/tienda-virtual
sudo a2ensite tienda-virtual.local
sudo systemctl reload apache2
```

Si todo ha ido bien, al reiniciar apache no aparecerá ningún mensaje de error:

\begin{center}
\includegraphics[width=0.7\columnwidth]{./img/6.png}
\end{center}

A continuación, crearemos la base de datos y el usuario con permisos:

\begin{center}
\includegraphics[width=0.7\columnwidth]{./img/7.png}
\end{center}

Y activaremos los privilegios con:

```bash
sudo mariadb -p -e "FLUSH PRIVILEGES;"
```

Además, como nos indica la documentación del repositorio que hemos clonado, deberemos cambiar el nombre de los archivos de configuración, de "config-dist.php" a "config.php".

Si hemos hecho todo bien, al entrar en nuestra página www.tienda-virtual.local veremos lo siguiente:

\begin{center}
\includegraphics[width=0.7\columnwidth]{./img/8.png}
\end{center}

Seguiremos las indicaciones que se nos muestra en pantalla, introduciendo el nombre del usuario y de la base de datos que hicimos previamente, y al finalizar nos encontraremos con la siguiente página:

\begin{center}
\includegraphics[width=0.7\columnwidth]{./img/9.png}
\end{center}

Como nos indica el mensaje, ya simplemente nos quedaría eliminar la carpeta install mediante el comando `sudo rm -R /var/www/html/tiendavirtual/public_html/install/`, y si volvemos a ir al root de la web la veremos desplegada:

\begin{center}
\includegraphics[width=0.7\columnwidth]{./img/10.png}
\end{center}

Si queremos ir al panel de administrador, iremos a <url>/admin, y nos registraremos con el nombre y contraseña que elegimos previamente:

\begin{center}
\includegraphics[width=0.7\columnwidth]{./img/11.png}
\end{center}

Para añadir acceso con SSL, primero crearemos los certificados con openssl:

\begin{center}
\includegraphics[width=0.7\columnwidth]{./img/12.png}
\end{center}

Después, lo firmaremos:

\begin{center}
\includegraphics[width=0.7\columnwidth]{./img/13.png}
\end{center}

Y añadiremos en nuestro archivo de configuraciónd del virtual host el puerto 443 y las directivas correspondientes:

\begin{center}
\includegraphics[width=0.7\columnwidth]{./img/14.png}
\end{center}

---

# Moodle

Primero usaremos el comando correspondiente para descargarnos la aplicación, y a continuación la descomprimiremos:

\begin{center}
\includegraphics[width=0.7\columnwidth]{./img/15.png}
\end{center}

A continuación editaremos el archivo hosts del cliente y añadiremos la entrada de moodle:

\begin{center}
\includegraphics[width=0.7\columnwidth]{./img/16.png}
\end{center}

Y crearemos el host virtual para nuestra web:

\begin{center}
\includegraphics[width=0.7\columnwidth]{./img/17.png}
\end{center}

También crearemos los certificados y los firmaremos para activar el acceso con SSL:

\begin{center}
\includegraphics[width=0.7\columnwidth]{./img/18.png}
\end{center}

Y creamor la carpeta "moodledata" en "/var/www/", necesaria para la instalación. Además, le cambiaremos a dicha carpeta y a nuestra carpeta con el root los propietarios a "www-data":

\begin{center}
\includegraphics[width=0.7\columnwidth]{./img/19.png}
\end{center}

Confirmaremos que todo ha ido bien ejecutando los comandos para acitvar el sitio y haciendo un reinicio del servicio de apache:

\begin{center}
\includegraphics[width=0.7\columnwidth]{./img/20.png}
\end{center}

Para continuar, crearemos la base de datos y el usuario para Moodle:

\begin{center}
\includegraphics[width=0.7\columnwidth]{./img/21.png}
\end{center}

También instalaremos php-intl y alguna otra dependencia de php:

```bash
sudo apt install php-intl php8.1-xml php8.1-xmlrpc php8.1-soap
```

Y editaremos php.ini para cambiar un par de parámetros:

\begin{center}
\includegraphics[width=0.7\columnwidth]{./img/22.png}
\end{center}

Reiniciaremos el servicio de apache, y si todo ha ido bien no nos debería de dar ningún mensaje de error. Ya podemos visitar nuestra página mooodle.local y seguir las instrucciones para su instalación:

\begin{center}
\includegraphics[width=0.7\columnwidth]{./img/23.png}
\end{center}

\begin{center}
\includegraphics[width=0.7\columnwidth]{./img/24.png}
\end{center}

Finalmente, al acabar la instalación, podremos ver nuestra página:

\begin{center}
\includegraphics[width=0.7\columnwidth]{./img/25.png}
\end{center}

Y como también configuramos el ssl, podemos entrar en nuestra página mediante https:

\begin{center}
\includegraphics[width=0.7\columnwidth]{./img/26.png}
\end{center}

**Cabe destacar, que para que los estilos funcionen en el https, debemos modificar el archivo config.php dentro de la carpeta "moodle", y cambiar la línea que se muestra en la imagen, añadiendole una 's' para que la url sea 'https://...':**

\begin{center}
\includegraphics[width=0.7\columnwidth]{./img/extra.png}
\end{center}

---

7. **Desplegar Symfony tanto en Windows como en Ubuntu.**

Lo primero que haremos será actualizar las siguientes directivas de php.ini:

```
file_uploads = On
allow_url_fopen = On
short_open_tag = On
memory_limit = 256M
upload_max_filesize = 100M
max_execution_time = 360
date.timezone = Europe/Madrid
```

A continuación descargaremos e instalaremos composer con los siguientes comandos:

```bash
curl -sS https://getcomposer.org/installer -o composer-setup.php
sudo php composer-setup.php --install-dir=/usr/local/bin --filename=composer
rm composer-setup.php
```

\begin{center}
\includegraphics[width=0.7\columnwidth]{./img/27.png}
\end{center}

El siguiente paso será, con ayuda del binario que nos acabmos de descargar, descargar los paquetes de Symfony en una carpeta llamada web. Para ello utilizaremos el siguiente comando:

```bash
cd /var/www/html/
/home/<nombre-usuario>/composer create-project symfony/website-skeleton web
```

\begin{center}
\includegraphics[width=0.7\columnwidth]{./img/28.png}
\end{center}

Y cambiaremos los los permisos a 755 y el propietario y grupo a www-data:

```bash
sudo chown -R www-data:www-data /var/www/html/web/
sudo chmod -R 755 /var/www/html/web/
```

También deberemos crear el host virtual, y activarlo con 'a2ensite':

\begin{center}
\includegraphics[width=0.7\columnwidth]{./img/29.png}
\end{center}

Y, como siempre, añadimos la referencia en '/etc/hosts' en nuestro cliente:

\begin{center}
\includegraphics[width=0.7\columnwidth]{./img/30.png}
\end{center}

Y ya podremos ver nuestra página inicial de symfony entrando en la url que hemos establecido:

\begin{center}
\includegraphics[width=0.7\columnwidth]{./img/31.png}
\end{center}
