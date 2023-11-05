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

2. **Crear el subdirectorio todo-daw02/delimitado teniendo en cuenta que:**

- **El directorio todo-daw02 permite el acceso a cualquier usuario**.
- **El subdirectorio todo-daw02/delimitado permite el acceso solamente al usuario admin**.

En este caso hemos usado la autentificación basic de Ubuntu. Como queremos restringir una carpeta en concreto, lo ideal será utilizar un archivo .htaccess que sobreescriba la configuración por defecto del dominio de apache.

Lo primero es crear la contraseña con el siguiente comando, la cual generará un usuario y una contraseña reconocibles por apache:

```bash
sudo htpasswd -c /etc/apache2/.htpasswd <nombre-usuario>
```

\begin{center}
\includegraphics[width=0.7\columnwidth]{./img/1.png}
\end{center}

A continuación editaremos apache2.conf y le cambiaremos la directiva AllowOverride de None a All, para permitir modificar las configuraciones con archivos .htaccess:

\begin{center}
\includegraphics[width=0.7\columnwidth]{./img/2.png}
\end{center}

Finalmente nos vamos al directorio que queremos restringir (en este caso, /var/www/html/todo-daw02/delimitado) y creamos un archivo .htaccess referenciando nuestro arhico .htpasswd:

\begin{center}
\includegraphics[width=0.7\columnwidth]{./img/3.png}
\end{center}

Ahora, si desde nuestro cliente intentamos entrar a daw02.local/delimitado/index.html, nos aparecerá el siguiente pop-up:

\begin{center}
\includegraphics[width=0.7\columnwidth]{./img/4.png}
\end{center}

Si introducimos el usuario y la contraseña que le hemos proporcionado antes con el comando htpasswd, podremos ver el contenido.

---

4. **Configurar los archivos de registro como sigue**:

- **Identificación log de acceso: daw02-access.log**.
- **Identificación log de error: daw02-error.log**.
- **Alias logformat: combined**.

Haremos un nano a /etc/apache2/sites-enabled/<nuestro-sitio> y añadiremos Las directivas ErrorLog, CustomLog y LogFormat, apuntando en las 2 primeras al directorio donde queremos que se guarden nuestros logs (en este caso yo he creado una carpeta para mi web en /var/log/apache2/ por si decidiera tener más dominios):

\begin{center}
\includegraphics[width=0.7\columnwidth]{./img/5.png}
\end{center}

Y si hacemos un cat podemos ver los logs:

\begin{center}
\includegraphics[width=0.7\columnwidth]{./img/6.png}
\end{center}

---

5. **Rotar logs por intervalo temporal: cada 48 horas.**

Después de asegurarnos de la ruta de nuestro binario con `which rotatelogs`, editaremos de nuestro archivo de configuración en /etc/apache2/sites-enabled/<nuestra-web> y le añadiremos lo siguiente:

\begin{center}
\includegraphics[width=0.7\columnwidth]{./img/7.png}
\end{center}

La cifra al final de la directiva será el intervalo de tiempo en segundos que queremos que rote, en este caso, cada 48 horas.
