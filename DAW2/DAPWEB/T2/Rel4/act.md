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

8. **Realiza el despliegue del CMS Drupal como sitio seguro. Buscar información en la web sobre cómo realizar
   su despliegue.**

Para empezar, descargaremos Drupal y lo descomprimiremos, además de cambiar su usuario y grupo a www-data:

```bash
sudo wget https://ftp.drupal.org/files/projects/drupal-9.3.3.tar.gz
sudo tar xzvf drupal-9.3.3.tar.gz -C /var/www/html/drupal --strip-components=1
sudo chown -R www-data. /var/www/html/drupal
```

\begin{center}
\includegraphics[width=0.7\columnwidth]{./img/1.png}
\end{center}

A continuación, crearemos el host virtual y le añadiremos sus directivas correspondientes:

```bash
sudo nano /etc/apache2/sites-available/drupal.conf
```

\begin{center}
\includegraphics[width=0.7\columnwidth]{./img/2.png}
\end{center}

Crearemos los certificados y los firmaremos con ssl:

```bash
sudo openssl req -new -nodes -keyout tsm-drupal.key -out tsm-drupal.csr
sudo openssl x509 -in tsm-drupal.csr -out tsm-drupal.crt -req -signkey tsm-drupal.key -days 365
```

\begin{center}
\includegraphics[width=0.7\columnwidth]{./img/3.png}
\end{center}

También le crearemos una base de datos y un usuario para la instalación:

\begin{center}
\includegraphics[width=0.7\columnwidth]{./img/4.png}
\end{center}

Y a continuación, acitivaremos el sitio y reiniciaremos apache2:

```bash
sudo a2ensite drupal
sudo systemctl restart apache2
```

Y no nos olvidemos que tenemos que añadir el dominio en nuestro cliente en /etc/hosts:

\begin{center}
\includegraphics[width=0.7\columnwidth]{./img/5.png}
\end{center}

Y con esto ya podremos acceder al dominio que le hayamos asignado y seguir con la instalación:

\begin{center}
\includegraphics[width=0.7\columnwidth]{./img/6.png}
\end{center}

Y finalmente tendremos nuestro sitio operativo:

\begin{center}
\includegraphics[width=0.7\columnwidth]{./img/7.png}
\end{center}
