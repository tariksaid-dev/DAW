# Juego de Navidad 2: The Typix 

## Intención

El juego tendrá un estilo didáctico y su objetivo será enseñar y mejorar las distintas técnicas de mecanografía del usuario. Para ello, se introducirán una serie de niveles basados en la estructura básica de enseñanza mecanógrafa. El diseño de niveles será estático: tanto la interfaz como los distintos fondos no cambiarán, permitiéndonos reutilizar los menús y los distintos elementos como número de vidas, nivel, etc. El juego debe permitir guardar partida (en un princpio, mediante la lectura/escritura de archivos JSON) 

Además de esto, el juego tendrá una pequeña mini-historia inspirada tanto en Matrix como en Afro-Samurai, dónde el usuario deberá enfrentarse a un enemigo para "salvar" el mundo mediante la mecanografía.

## Diseño de clases

0. Creación de sprites basados tanto en las letras como en los símbolos del teclado. 
1. Diseño de la estructura básica de el nivel. Aquí crearemos la interfaz, las vidas, pondremos los fondos, y usaremos los sprites previamente creados.
2. Diseño de la dificultad. En un princpio, haremos 3 niveles de dificultad: Junior, Senior, "dios".
3. Diseño de los menús de inicio.
4. Diseño de los menús de pausa.
5. Diseño de las escenas entre niveles.
6. Diseño de las funciones de guardado y cargado.

## Historia

El jugador, representando a una mezcla de Neo y Afro, y mediante un compañero a modo de guía que servirá para explicar las distintas técnicas de mecanografía, será el elegido para salvar al mundo, y para ello deberá completar una serie de niveles hasta enfrentarse al enemigo final. Una vez superado, se nos revelerá que el verdadero final era dicho compañero, que resultaré ser yo, y habrá un último nivel final con una dificultad muy exagerada donde se "enfrenten" a uno de mis mejores parses.

## Temática

Al ser un juego basado en estas 2 franquicias, usaremos un estilo neo-tradicional, fomentando los verdes de Matrix y el estilo japonés.

## Diseño de niveles

La mecánica principal durante los primeros niveles será el descenso de "teclas" desde la parte alta de la pantalla. El jugador deberá presionar dicha tecla antes de que llegue al límite inferior del eje Y, y dicha tecla desaparecerá. Si no lo consigue, se le restará una vida.

En fases posteriores del juego, la mecánica cambiará a bloques de texto completos, con distintos niveles de complejidad.

Ejemplo de secuencia de niveles:

1. Nivel 1: Únicamente teclas principales, en minúsculas, caída lenta.
2. Nivel 2: Teclas principales en mayúsculas.
3. Nivel 3: Combinación nivel 1 + 2. 
4. etc...

La idea es reutilizar mucho el diseño de niveles, haciendo que los únicos valores cambiantes entre ellos sean:

- El número de sprites en función de las letras usadas. 
- Velocidad de caída de las letras.
- Imagen de fondo/efectos varios.

## TODO : 

1. Creación de los sprites de las letras y los fondos para generar un MVP mínimo.
2. Diseño del primer nivel, MVP cumplido.
3. Diseño de los menús de inicio y pausa.
4. Diseño de algún nivel más.
5. Escenas entre niveles, diálogos, efectos, música, etc. (OPCIONAL)