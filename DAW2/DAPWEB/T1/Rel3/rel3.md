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

7. **Instalar el servidor de aplicaciones Tomcat y comprobar que funciona (tanto en Ubuntu como en Windows). Indicar los pasos y comandos implicados (documentar el proceso de instalación).**

- Usaremos los comandos de instalación e instalaremos los paquetes de tomcat9 y tomcat9-admin:

```bash
sudo apt install tomcat9 tomcat9-admin -y
```

- Comprobaremos que el servicio está funcionando utilizando `sytemctl status tomcat9`, y de no estarlo, lo arrancaremos con `systemctl start tomcat9`.

- A continuación editaremos el archivo de configuración de los usuarios para crear un usuario con privilegios de administrador. Dicho archivo se encuentra en `/etc/tomcat9/tomcat-users.xml`.

\begin{center}
\includegraphics[width=0.7\columnwidth]{./img/1.png}
\end{center}

- Además, quitaremos todas las restricciones que pueda agregar cualquier aplicación. Para ello, editaremos `/usr/share/tomcat9-admin/manager/META-INF/context.xml` comentando la etiqueta "Valve":

\begin{center}
\includegraphics[width=0.7\columnwidth]{./img/2.png}
\end{center}

- Y haremos lo mismo con el "Host Manager", el cual se encuentra en `/usr/share/tomcat9-admin/host-manager/META-INF/context.xml`:

\begin{center}
\includegraphics[width=0.7\columnwidth]{./img/3.png}
\end{center}

- Reiniciaremos el servicio, y comprobaremos que todo funciona correctamente:

\begin{center}
\includegraphics[width=0.7\columnwidth]{./img/4.png}
\end{center}

- Y desde ahí podremos acceder a `direccion-ip:8080/manager`, donde podremos loguear con el nombre y la contraseña que añadimos previamente en `tomcat-users.xml`:

\begin{center}
\includegraphics[width=0.7\columnwidth]{./img/5.png}
\end{center}

- También podremos acceder a `direccion-ip:8080/host-manager`:

\begin{center}
\includegraphics[width=0.7\columnwidth]{./img/6.png}
\end{center}

---

8. **Instalar y configurar de manera segura el servicio SSH. Conectar al servidor de distintas formas. Indicar los pasos y comandos implicados (documentar el proceso de instalación y configuración).**

- Empezaremos instalando el paquete ssh mediante `sudo apt install ssh`, y comprobaremos que funciona con `systemctl status ssh`.

\begin{center}
\includegraphics[width=0.7\columnwidth]{./img/7.png}
\end{center}

- Con el servicio arrancado, y si no tenemos firewalls que impidan un correcto funcionamiento del mismo, ya podemos conectarnos desde cualquier punto de acceso a nuestra máquina mediante el siguiente comando:

```bash
ssh dirección-ip -l nombre-usuario-servidor
```

- En este ejemplo, me conecto desde mi host a la máquina:

:::note
Si es la primera vez que realizamos la conexión, buscará la ip del servidor en `.ssh/known_hosts`, y de no encontrarla, nos preguntará si queremos acceder y guardarla en la lista de direcciones conocidas.
:::

\begin{center}
\includegraphics[width=0.7\columnwidth]{./img/8.png}
\end{center}

- También podríamos usar este otro comando:

```bash
ssh nombre-usuario-servidor@dirección-ip-nombre
```

\begin{center}
\includegraphics[width=0.7\columnwidth]{./img/9.png}
\end{center}
