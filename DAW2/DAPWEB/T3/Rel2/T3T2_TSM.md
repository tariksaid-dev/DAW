---
title: "Tema 3: Virtualización con Docker"
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

1. **Crea un contenedor de ubuntu, accede a él con una terminal y muestra su archivo /etc/os-release:**

- Desde la terminal, haremos un `docker pull ubuntu` y a continuación un `docker run -it ubuntu` (se podría simplemente haber hecho este último):

\begin{center}
\includegraphics[width=0.7\columnwidth]{./img/1.png}
\end{center}

2. **Busca un contenedor de apache con una estructura de directorios similar a la que hemos usado hasta ahora (etc/apache2/...) Crea un archivo html completo, que incluya al menos una imagen, en local súbelo al contenedor y visualízalo desde el navegador de la máquina virtual como el navegador de tu equipo.**

- De la misma forma, podemos primero descargar la imagen o ejecutar directamente el contenedor y que se descargue automáticamente. En esta ocasión, el comando completo será:

```bash
docker run -it -p 8081:80 -v $(pwd):/usr/local/apache2/htdocs httpd
```

- La flag -p indica el puerto que queremos mapear, en este caso he usado el 8081 de mi pc ya que estoy corriendo apache2 por defecto en el 8080, y lo mapeo en el 80 del contenedor que es donde está ejecutándose su apache2.

- La flag -v monta un volúmen, para que un archivo del host sea accesible desde el contenedor. En este caso he usado `$(pwd)`, que hace referencia a la carpeta donde me encontraba con la terminal, la cuál tenía un index.html con una imagen del logo de docker, y he "clonado" su contenido en la ruta de apache por defecto.

\begin{center}
\includegraphics[width=0.7\columnwidth]{./img/2.png}
\end{center}

3. **Crea un contenedor mariadb, ejeculalo con un terminal y conéctate a el para mostrar las bases de datos de esta. Define la contraseña root para el acceso a la misma.**

- Para este ejercicio, el comando a utilizar será el siguiente:

```bash
docker run -it -e MYSQL_ROOT_PASSWORD=root -p 3307:3306 mariadb
```

- En esta situación debemos pasarle la flag -e, que engloba las variables de entorno, para indicar la contraseña (en este caso se escogió "root"). Además, se mapeó el puerto 3307 ya que el 3306 por defecto lo estoy utilizando para mi propio mariadb.

- Una vez tenemos el contenedor, para conectar a la base de datos mediante la línea de comandos debemos ejecutar:

```bash
docker exec -it sweet_kirch mariadb -uroot -proot
```

- Dónde indicamos que ejecute por terminal el comando `mariadb -u root -p root`, el por defecto para entrar con dicho usuario y contraseña. El nombre "sweet_kirch" es el nombre aleatorio que por defecto me ha asignado docker (yo podría seleccionar uno propio con la flag --name).

\begin{center}
\includegraphics[width=0.7\columnwidth]{./img/3.png}
\end{center}

\begin{center}
\includegraphics[width=0.7\columnwidth]{./img/4.png}
\end{center}

4. **Crea un contenedor de phpmyadmin y enlázalo al contenedor de mariaDB y accede a la BD desde el navegador (pista: link)**

- Para esto, con el contenedor de mariadb previamente creado ejecutándose, debemos descargar e iniciar el contenedor de phpmyadmin enlazándolo con el contenedor de mariadb con el siguiente comando:

```bash
docker run -it --name phpmyadmin -e PMA_ARBITRARY=1 -p 8081:80 --link sweet_kirch:db phpmyadmin/phpmyadmin
```

- En esta ocasión he llamado al contenedor phpmyadmin, y le he pasado una variable de entorno para asegurarme la correcta conexión a cualquier servidor SQL. Además, lo he mapeado en el puerto 8081 de mi host, y he conectado este contenedor con "sweet_kirch", el contenedor previamente creado de mariadb, y le he asignado el alias "db" para loguearme a continuación en phpmyadmin.

\begin{center}
\includegraphics[width=0.7\columnwidth]{./img/5.png}
\end{center}

5. **Para terminar haz capturas mostrando los contenedores que tienes y las imágenes que tienes.**

\begin{center}
\includegraphics[width=0.7\columnwidth]{./img/6.png}
\end{center}
