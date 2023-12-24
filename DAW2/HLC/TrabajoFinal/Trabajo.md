---
title: "Configuración Home Assistant y Node Red"
author: [Tarik Said Manjón]
date: "2º DAW"
lang: "es"
colorlinks: true
code-block-font-size: '\small'
listings-no-page-break: false
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

# Tutorial de instalación de Home Assistant y Node Red

\begin{center}
\includegraphics[width=0.7\columnwidth]{./img/1.png}
\end{center}

Requerimientos previos:

- Raspberry Pi 4
- ESP32
- Tarjeta micro SD
- Cables de alimentación micro USB B y C
- Cable de red Ethernet
- Sensores + cables

## Configurando nuestra Raspberry Pi 4

En primer lugar, descargaremos el software Imager de [aquí](https://www.raspberrypi.com/software/), necesario para formatear nuestra tarjeta SD e instalar el sistema operativo de home assistant.

\begin{center}
\includegraphics[width=0.7\columnwidth]{./img/2.png}
\end{center}

Una vez instalado, lo ejecutaremos, eligiremos el modelo de nuestra Raspberry (en este caso, Raspberry Pi 4) y, en sistema operativo, **Other specific-purpose OS > Home assistants and home automation > Home Assistant**. Por último, le daremos a elegir almacenamiento y seleccionaremos la tarjeta SD (que debe estar de alguna manera siendo leída por nuestro pc).

\begin{center}
\includegraphics[width=0.7\columnwidth]{./img/3.png}
\end{center}

Para finalizar la instalación de Home Assistant SO, introduciremos la SD en la Raspberry, la conectaremos a la red mediante un cable Ethernet, y la encenderemos enchufando un cable micro USB C directamente a la luz.

Después de unos minutos de configuración, Home Assistant debería ser accesible desde la misma red en la dirección `http://homeassistant.local:8123/`, aunque si necesitáramos hacer alguna configuración o gestión de la misma podríamos conectar un cable micro HDMI desde la Raspberry a un monitor para entrar en la consola del SO.

\begin{center}
\includegraphics[width=0.7\columnwidth]{./img/4.png}
\end{center}

## Configurando Home Assistant: addons

Como se ha mencionado previamente, accederemos a Home Assistant desde `http://homeassistant.local:8123/`, siempre que el equipo desde el que queramos acceder se encuentre en la misma red que la Raspberry Pi. Crearemos un nuevo usuario y le daremos una contraseña, y accederemos al panel principal de Home Assistant.

Lo primero que haremos será entrar en **Ajustes > Complementos**. Aquí tendremos los "addons", que son funcionalidades extra para aumentar las capacidades de nuestro Home Assistant. Clicando en el botón azul de abajo a la derecha "Tienda de complementos" podremos ver los disponibles, y debería verse algo así:

\begin{center}
\includegraphics[width=0.7\columnwidth]{./img/5.png}
\end{center}

\begin{warningblock}
Es posible que esta vista se nos muestre vacía o mucho más reducida. De forma interna, Home Assistant utiliza un sistema de repositorios, y podremos asegurarnos que tenemos añadidos los repositorios oficiales clicando en los tres puntos de arriba a la derecha > Repositorios y añadiendo la siguiente url: `https://github.com/hassio-addons/repository`. Si al añadir la url nos dice que ya está existe, pero sigue sin mostrarse nada, se recomienda borrar la caché del navegador (por defecto, ctrl + r), recargar la página y/o reiniciar la Raspberry las veces que sea necesario.

Estos problemas de sincronización con la vista son frecuentes en muchos apartados distintos, y la solución siempre será la misma.
\end{warningblock}

De aquí, será imprescindible la instalación de **Node-RED y ESPHome**, aunque también se recomienda **Advanced SSH & Web Terminal** para acceder a la Raspberry desde aquí en caso de que sea necesario para realizar cualquier configuración sobre la misma.

Una vez instalados los addons, se recomienda ir a su configuración en el panel de Addons y añadirlos al panel lateral para tener un fácil acceso. Además, necesitaremos configurar Node-RED: para ello, clicaremos en la ventana de "Configuración" desde su panel de control:

\begin{center}
\includegraphics[width=0.7\columnwidth]{./img/6.png}
\end{center}

Y añadiremos una configuración similar a esta, donde los nombres y la contraseña deben ser similares a los del inicio de sesión, y el protocolo SSL estará apagado. Para más información sobre la configuración, podremos ver la documentación oficial.

Una vez hecho esto, ya tendremos configurado tanto Home Assistant como Node-RED para su uso de forma conjunta (con los nuevos nodos ya añadidos e integrados):

\begin{center}
\includegraphics[width=0.7\columnwidth]{./img/7.png}
\end{center}

## Uso de ESP32 e integración de sensores

Al realizar los pasos anteriores, nuestra Raspberry Pi 4 ha pasado a ser un pequeño sistema operativo de Home Assistant, de modo que podríamos decir que funciona como controlador sobre el conjunto de sensores que queramos conectar. Sin embargo, la mayoría de los sensores estándares del mercado no tienen un firmware, ya no digamos capacidad de conectarse a una red o interactuar con dicha Raspberry.

Para solucionar este problema tenemos las ESP32, pequeñas placas con un procesador y una tarjeta de red y que son bastante económicas en precio. Además, gracias a el addon ESPHome que hemos instalado previamente, podremos crear un conjunto de instrucciones en formato yaml que sirvan como firmware para dichos sensores. De modo que nuestra arquitectura será parecida a la siguiente:

\begin{center}
\includegraphics[width=0.7\columnwidth]{./img/8.png}
\end{center}

Como podemos ver, la Raspberry es la encargada de gestionar los datos que recibe de las ESP32, las cuales a su vez contendrán el software capaz de interpertar los datos proporcionados por los distintos sensores (podremos conectar varios a cada tarjeta, dependerá de los pines disponibles).

Para ello, pulsaremos en la barra lateral sobre el addon "ESPHome", y le daremos al botón verde la esquina inferior derecha "New Device". Elegiremos un nombre y seleccionaremos el tipo de controlador que deseamos emplear, en este ejemplo se ha usado una ESP32 aunque se aceptan otro tipo de placas también:

\begin{center}
\includegraphics[width=0.7\columnwidth]{./img/9.png}
\end{center}

Se creará el nuevo "dispositivo", el cuál es una representación de nuestra placa y/o sensor, con una configuración básica por defecto. Sin embargo, aún no hemos hecho nada con la ESP32, por lo que debemos instalar el firmware compilado en nuestra placa.

Sin embargo, ESPHome nos lo pone realmente sencillo. Si clicamos en los 3 puntos de la esquina inferior derecha del dispositivo que acabamos de crear, veremos la opción de "Install". Al pulsarla, nos preguntará que cómo queremos instalar el firmware en la placa; y como la placa no tiene aún ningún tipo de configuración, en este momento solo podremos pulsar **Plug into this computer** (después de una primera instalación, ya podremos hacer todo a través de wifi).

Así que enchufaremos la ESP32 a nuestro ordenador (ojo, no a la Raspberry, si no al ordenador que estamos usando como cliente) y pulsaremos la opción 2 **Open ESPHome Web**.

Una vez aquí, le daremos a **Connect**, y nos saldrá un mensaje en el navegador diciendo que espHome intenta conectarse a un puerto serie.

\begin{noteblock}
Desde Linux, será necesario dar permisos de lectura edición y ejecución a /dev/ttyUSB0, y para que dicho puerto aparezca habrá que ejecutar el comando `sudo apt remove brltty`, ya que este binario hace que no podamos acceder a dicho puerto.

Desde Windows, será necesario instalar el driver que permita la comunicación con dicho puerto serie. [Aquí](https://docs.espressif.com/projects/esp-idf/en/latest/esp32/get-started/establish-serial-connection.html) hay más detalles.
\end{noteblock}

Seleccionaremos el puerto dónde se encuentra la ESP32 (en Linux, por defecto será **ttyUSB0**) y se establecerá la conexión entre la web y el dispositivo. Desde aquí, podremos pulsar en **PREPARE FOR FIRST USE**, y se nos preguntará la SSID y el password de la red para su configuración en la placa, además de instalarse el firmware base para su posterior uso. Una vez hecho esto, podremos cerrar tanto la ventana como desenchufar la ESP32 de nuestro pc, ya que estará correctamente configurada con la red, y ESPHome será capaz de detectarla.

\begin{noteblock}
En la ventana principal de ESPHome, arriba a la derecha, tendremos la ventana **SECRETS**, dónde estará la configuración de nuestra red Wifi, o cualquier otra variable que no queramos que se muestre en las configuraciones.
\end{noteblock}

Una vez esté conectado nuestro dispositivo, podremos darle al botón de **EDIT** y cambiar la configuración del archivo yaml desde aquí. Para este ejemplo, se ha utilizado un sensor de ruido, el cuál mide los decibelios. El código es el siguiente:

```yaml
esphome:
  name: esphome-web-48ea18
  friendly_name: Test1

esp32:
  board: esp32dev
  # framework:
  #   type: arduino

# Enable logging
logger:

# Enable Home Assistant API
api:
  encryption:
    key: "p6NsbFTiECAS3hQkhTzPHS+QvVqHgIgXT+HWIqlW7+k="

ota:

wifi:
  ssid: !secret wifi_ssid
  password: !secret wifi_password

  # Enable fallback hotspot (captive portal) in case wifi connection fails
  ap:
    ssid: "Esphome-Web-48Ea18"
    password: "Jzpf8i1tiS7z"

captive_portal:
# Example configuration entry
web_server:
  port: 80

globals:
  - id: esphome_sensitivity
    type: float
    initial_value: "36.5"
    restore_value: yes

  - id: esphome_volume
    type: int

sensor:
  - platform: adc
    pin: GPIO36
    id: esphome_db
    device_class: signal_strength
    name: "Db SoundEsp"
    icon: "mdi:volume-vibrate"
    unit_of_measurement: "db"
    update_interval: 2s
    raw: true
    filters:
      - lambda: |-
          unsigned int sample;
          unsigned long startMillis= millis(); 
          float peakToPeak = 0; 
          unsigned int signalMax = 0;
          unsigned int signalMin = 1024;
          while (millis() - startMillis < 500) {
            sample = analogRead(A0);
            if (sample < 1024){
                if (sample > signalMax){
                    signalMax = sample;
                }
                else if (sample < signalMin){
                    signalMin = sample;
                }
              }
          }
          peakToPeak = map((signalMax - signalMin),1,1024,1.5,1024);
          id(esphome_volume) = peakToPeak;
          float state = id(esphome_sensitivity)*log10(peakToPeak)+15;  
          return(state);
  - platform: template
    name: "Volume SoundEsp"
    icon: "mdi:volume-high"
    unit_of_measurement: "%"
    update_interval: 2s
    lambda: return(map((id(esphome_db).state),15,150,0,100));

  - platform: template
    name: "RAW SoundEsp"
    icon: "mdi:volume-source"
    unit_of_measurement: "%"
    update_interval: 2s
    lambda: return(map(id(esphome_volume),1,1024,0,100));

number:
  - platform: template
    id: sensitivity_slider
    name: "Sensitivity SoundEsp"
    icon: "mdi:knob"
    update_interval: 5s
    initial_value: "36.5"
    step: 0.1
    min_value: 20
    max_value: 40
    mode: slider
    set_action:
      then:
        - lambda: id(esphome_sensitivity) = x;
```

Para saber qué hace cada uno de estos campos deberemos de leer la [documentación oficial de ESPHome](https://esphome.io/), dónde además encontraremos un montón de ejemplos ya creados para copiar y pegar. Hay que recordar que estas configuraciones funcionan a modo de firmware de nuestro sensor, lo que es bastante impresionante con unas pocas líneas de yaml.

Una vez hayamos copiado la configuración, pulsaremos en el botón de la esquina superior derecha **INSTALL** y seleccionaremos "Wiressly", y automáticamente actualizará el firmware de la ESP32 con los nuevos cambios.

Y con esto nuestro sensor ya debería estar funcionando. Para verlo en acción, en un primer momento podemos ir a la ventana principal de ESPHome y, en nuestro dispositivo, pinchar en **VISIT**, para que nos envíe a una web dónde podremos ver diferentes datos y un log en tiempo real:

\begin{center}
\includegraphics[width=0.7\columnwidth]{./img/10.png}
\end{center}

Finalmente queda hacer el display en la ventana principal "Resumen" de Home Assistant. Lo primero será confirmar que nuestro sensor está recogido en **Ajustes > Dispositivos y Servicios > Entidades** (debería estar automáticamente), y a continuación iremos a "Resumen", pulsaremos en los tres puntos de la esquina superior derecha, clicaremos en "Editar panel de control" y en el botón de abajo a la derecha "Añadir tarjeta".

Aquí podremos añadirla por tarjeta o por entidad, aunque será indiferente. En mi caso he escogido un indicador en forma de medialuna, y le he indicado que tiene que ser la entidad que había nombrado como "Test1". Le damos a añadir y ya podremos ver nuestro indicador de decibelios:

\begin{center}
\includegraphics[width=0.7\columnwidth]{./img/11.png}
\end{center}
