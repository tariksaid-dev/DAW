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

7. **Desplegar Symfony tanto en Windows como en Ubuntu.**

8. **Realiza el despliegue del CMS Drupal como sitio seguro. Buscar información en la web sobre cómo realizar su despliegue.**
