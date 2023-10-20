---
title: "Tema 3: Usabilidad"
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

1. **Selecciona una web de las que vienen al final de esta tarea y analiza su grado de usabilidad utilizando para ello las directrices propuestas por Nielsen. Puedes encontrar información y ejemplos sobre estas directrices en los siguientes enlaces:**

Para esta actividad he elegido la web de la [Universidad de granada](https://www.ugr.es/)

| Aspecto de Usabilidad                | Comentarios                                                                                   |
| ------------------------------------ | --------------------------------------------------------------------------------------------- |
| Visibilidad del sistema              | El header proporciona un menú de navegación el cuál nos permite movernos fácilmente a través de la web, y debajo del mismo tenemos otro encabezado que nos indica el punto en el que nos encontramos. |
| Relación sistema / mundo real        | Los encabezados y menús son fáciles de entender y usan iconografía apropiada. El lenguaje es formal, apropiado para una universidad. Tal vez se hecha en falta más imágenes en los artículos. |
| Libertad y control del usuario       | El usuario en cualquier momento puede volver a un punto anterior mediante el historial, y todo parece funcionar de forma fluida y correcta.|
| Consistencia y estándares            | Los botones siguen un estilo corporativo en toda la página, igual que los dropdowns. Todo tiene consistencia y concuerda con los estándares actuales.|
| Prevención de errores                | En ningún momento se aprecia ningún tipo de error, ni siquiera por consola. Los formularios te exigen que rellenes los campos para ser enviados. |
| Reconocer antes que recordar         | Toda la información y botones son fácilmente reconocibles, haciendo la navegación bastante intuitiva. |
| Flexibilidad y eficiencia de uso     | Pese a ser una página informativa, demuestra flexibilidad al tener diversos enlaces hacia otras áreas relacionadas de la universidad (como la sede) o al ofrecer el contacto con profesores o equipo informático.   |
| Diseño minimalista y estética        | El diseño de la web es limpio y no está sobrecargado con elementos innecesarios, además de seguir un pratón de diseño y colores bastante claro.|
| Ayudar con los errores               | En el caso de error 404, la explicación es escueta pero suficiente. Además, disponemos de un chatbot que nos ayuda con los posibles problemas. |
| Ayuda y documentación                | La web dispone de mapa web, aunque no de un FAQ ni de ayudas visuales al hacer hover. Pese a ello, el chatbot se podría encargar de solucionar o contestar los problemas y preguntas más frecuentes. |

2. **Evalúa la usabilidad de diferentes sitios web. Deberás encontrar al menos 10 fallos de usabilidad distintos en, al menos dos sitios de los sitios web diferentes, aunque puedes analizar más de dos sitios distintos. El resultado se ha de volcar en una tabla, tal y como se indica a continuación:**

- Las URL de las páginas principales de cada uno de los sitios Webs analizados se escriben en la primera columna.

- En la segunda columna se escriben los textos de las preguntas para las que has respondido que NO al analizar si era usable. Puedes usar como documento de base la Guía de Evaluación Heurística de la web de nosolousabilidad.

- En la tercera columna debes explicar el por qué consideras que no cumple ese requisito de usabilidad y que habría que cambiar para que si lo hiciera.

| URL| PREGUNTAS| ANÁLISIS  |
|-------|-----------------------------|---------------------------------------------------------|
| https://www.softonic.com/ | ¿Son concretos y bien definidos los contenidos y servicios que ofrece? | Los objetivos son confusos, ya que en su cabecera podemos ver tanto noticias, como programas, apk, juegos, extensiones de chrome, e incluso IA. |
|       | ¿Tiene una URL correcta, clara y fácil de recordar? ¿Y las URL de sus páginas internas? ¿Son claras y permanentes?  | Mientras que la landing page tiene un buen dominio, a la mínima que entras en los distintos contenidos esta cambia añadiendo un subdominio, y además, este no es consistente (en algunas secciones no existe). |
|       | La estructura de organización y navegación, ¿Es la más adecuada?   | La estructura de navegación es muy confusa, con muchos apartados repetidos y una barra lateral desplegable que por algún motivo simplemente muestra categorías de videojuegos, cuando nos encontramos en la landing que nada tiene que ver. |
|       | ¿Los enlaces son fácilmente reconocibles como tales? ¿su caracterización indica su estado (visitados, activos,...)?    | No hay nada  que nos indique si hemos visitado un enlace o no, además de haber demasiada cantidad de ellos con estilos distintos. |
|  |  ¿Se ha evitado la redundancia de enlaces?   | No se ha evitado la redundancia, habiendo muchos enlaces en la misma landing que llevan al mismo sitio.  |
|       | ¿Se ha evitado la sobrecarga informativa?  | No, en la página principal hay tanto animaciones, como menús desplegables extremadamente grandes, como agrupaciones de botones, noticias, etcétera. |
|https://www.juegos.com/|¿Se ha evitado la sobrecarga informativa?| La página está evidentemente sobrecargada con demasiados juegos, aproximadamente hay uno cada 100px con un pequeño márgen entre ellos, lo que hace que ninguno llame la atención. |
|       | ¿Se utiliza correctamente la jerarquía visual para expresar las relaciones del tipo "parte de" entre los elementos de la página?|No, ya que todo el contenido se muestra en un grid idéntico y demasiado junto, haciéndo que sea confuso. |
|  | ¿Permite la búsqueda avanzada?    | No se puede hacer una búsqueda avanzada ni acepta ningún parámetro además de una palabra, lo que hace muy complicado buscar nada. |
|       | ¿La caja de texto es lo suficientemente ancha?  | La caja del texto es demasiado pequeña; cualquier palabra o conjunto de ellas que sea mínimamente extensa hará que no podamos ver lo que hemos escrito. |
