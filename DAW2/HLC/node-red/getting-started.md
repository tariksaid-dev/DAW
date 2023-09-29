---
title: "HLC: guía básica de node-red"
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

# Guía de instalación y utilidades básicas de node-red

## Instalación en local y primer arranque

1. Instalar la versión LTS (long term support) de [node.js](https://nodejs.org/es).

2. Usando un gestor de paquetes como npm (el cuál estará por defecto incluido en el PATH gracias a la instalación de Node) instalar node-red desde la CLI:

```bash
sudo npm install -g --unsafe-perm node-red
```

:::note
En el caso de no usar Linux, omitir la primera palabra del comando (sudo).
:::

Si la instalación ha tenido éxito, se nos mostrará un mensaje similar a este:

```
+ node-red@1.1.0
added 332 packages from 341 contributors in 18.494s
found 0 vulnerabilities
```

3. Para utilizar el programa en local usaremos el comando `node-red` desde la temrminal, a lo que nos responderá con algo así:

```
Welcome to Node-RED
===================

...
30 Jun 23:43:44 - [info] Context store  : 'default' [module=localfilesystem]
30 Jun 23:43:44 - [info] User directory : /Users/nol/.node-red
30 Jun 23:43:44 - [warn] Projects disabled : set editorTheme.projects.enabled=true to enable
30 Jun 23:43:44 - [info] Creating new flows file : flows_noltop.json
30 Jun 23:43:44 - [info] Starting flows
30 Jun 23:43:44 - [info] Started flows
30 Jun 23:43:44 - [info] Server now running at http://127.0.0.1:1880/red/
```

:::info
Podemos ver en qué puerto está alojado el servicio en la información de las últimas líenas del mensaje de inicio, aunque por defecto es [http://127.0.0.1:1880/](http://127.0.0.1:1880/).
:::

## Uso básico de node-red

### Interfaz

La interfaz se divide en cuatro partes:

- Una columna izquierda con los nodos de funcionalidad que tenemos instalados, los cuales podremos incluir en las automatizaciones.

- La parte central tenemos un gran canvas donde añadiremos los nodos y sus conexiones.

- En la parte derecha encontraremos distintos tipos de paneles configurables que nos permitirán visualizar distinta información.

- En la esquina superior derecha, tenemos el botón de "deploy", el cuál hará efectivos los cambios que realicemos, y a su izquierda, las opciones de configuración de node-red.

\begin{center}
\includegraphics[width=0.6\columnwidth]{./img/1.png}
\end{center}

---

### Ejemplos de uso

#### Caso de uso 1: Hello world

Para esta primera funcionalidad, utilizaremos el nodo "inject". Este nodo envía un mensaje en el flow, manualmente o a intervalos regulares. El contenido del mensaje puede ser de distintos tipos, incluidos strings, objetos de JavaScript, o la hora actual.

Arrastraremos el nodo a nuestro canvas, y le daremos doble clic para que se nos abran las propiedades del nodo. La primera de ellas debería de ser `msg.payload`, el cual por defecto devolverá un timestamp. Lo cambiaremos a string, y escribiremos nuestro hola mundo.

\begin{center}
\includegraphics[width=0.6\columnwidth]{./img/2.png}
\end{center}

A continuación, arrastraremos el nodo "debug" y uniremos ambos. Este nodo proporciona una salida a distintos eventos del flow, así que será el encargado de las tareas de depuración.

Así que le daremos a "deploy" y pulsaremos el botón a la izquierda de nuestro inject, el mensaje será enviado, y podremos ver la salida en los paneles de la parte derecha que antes mencionamos.

\begin{center}
\includegraphics[width=0.6\columnwidth]{./img/3.png}
\end{center}

#### Caso de uso 2: Creando un endpoint en local

Para levantar un servicio con node-red, utilizaremos el nodo "http in" del apartado "network", el cual es el encargado de crear endpoints. Lo arrastraremos al canvas, y haremos doble clic en él para acceder a sus propiedades. En ella, especificaremos el método HTTP GET, el cual se usa para para solicitar y recuperar datos. En el apartado URL escribiremos la ruta de nuestra endpoint (en este caso se ha optado por "/hello").

\begin{center}
\includegraphics[width=0.6\columnwidth]{./img/4.png}
\end{center}

A continuación, cogeremos un nodo "http response", el cual es el encargado de devolver la respuesta enviada por el input node.

Para finalizar, nos hará falta el contenido del mensaje que será enviado desde el primer nodo, así que para definirlo utilizaremos el nodo de funcionalidad "template". En sus propiedades, encontraremos un cuadro de texto, y unas opciones para ayudarnos con la sintaxis del mensaje que queremos devolver. En este ejemplo simplemente se ha devuelto un "h1", pero podríamos introducir diversos tipos de lenguajes (JSON, JavaScript, Python, SQL, etc).

\begin{center}
\includegraphics[width=0.6\columnwidth]{./img/5.png}
\end{center}

Finalmente, uniremos todos los nodos, haremos deploy y nos dirigiremos a [127.0.0.1:1880/hello](http://127.0.0.1:1880/hello), donde podremos ver nuestra "web" renderizada:

\begin{center}
\includegraphics[width=0.6\columnwidth]{./img/6.png}
\end{center}
