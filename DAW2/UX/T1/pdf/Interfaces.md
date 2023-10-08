---
title: "Tema 1: Planificación de interfaces Web"
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

# Ejercicios tema 1

1. **¿Cuáles son los modelos típicos de círculos cromáticos?**

- Los modelos más frecuentes son el clásico, el aditivo, y el sustractivo. Aquí podemos verlos:

\begin{center}
\includegraphics[width=0.7\columnwidth]{./img/1.jpg}
\end{center}

• **En alguno de ellos: buscar los colores cálidos, fríos.**

- Por regla general, si dividimos el círculo de manera diagonal, la mitad inferior izquierda suele representar los colores fríos, y la otra mitad los cálidos. Aquí podemos verlo representado:

\begin{center}
\includegraphics[width=0.6\columnwidth]{./img/2.jpg}
\end{center}

• **Comprender cómo se distribuyen los colores primarios, secundarios y terciarios.**

- Los colores primarios son los que no se pueden conseguir mediante la mezcla de otros colores (en el caso del círculo clásico, estos son el rojo, el amarillo y el azul).

- Poniendo estos tres colores como base, y mezclándolos a partes iguales entre si, conseguimos los conocidos como secundarios, que son el verde, el naranja y el violeta.

- Si mezclamos los colores primarios con sus secundarios, conseguimos unas nuevas tonalidades, las llamadas colores terciarios.

- En cada modelo de círculo cromático, los colores cambian, pero el fundamento es el mismo.

• **Localizar los colores complementarios.**

- Los complementarios son los colores que se sitúan enfrente de otro en el círculo cromático. En el caso del clásico, los opuestos al rojo, amarillo y azul son el naranja, el verde y el violeta, respectivamente.

\begin{center}
\includegraphics[width=0.9\columnwidth]{./img/3.jpg}
\end{center}

2. **Intenta buscar asociaciones entre colores y sensaciones, sentimientos o significados en la web. ¿Encuentras patrones?**

- Pese a ser una cuestión subjetiva (puede cambiar dependiendo de la época y de la cultura) y encontrar algunas diferencias, esta tabla es una buena referencia sobre qué colores expresan qué sentimientos:

\begin{center}
\includegraphics[width=0.7\columnwidth]{./img/4.jpg}
\end{center}

3. **¿Qué pasa si ponemos letras rojas sobre fondo azul?**

- Dependerá de la tonalidad tanto del rojo como del azul. En caso de que exista un buen contraste, tendremos una buena visibilidad (son colores complementarios). Otros factores como el tamaño de las letras o la intensidad del color nos garantizarán una buena legibilidad.

\begin{center}

- Como podemos observar, este texto es dificíl de leer dado su poco contraste

\includegraphics[width=0.4\columnwidth]{./img/5.png}

- Sin embargo, aquí la gama de azules y rojos es más correcta y se ve perfectamente.

\includegraphics[width=0.4\columnwidth]{./img/6.jpg}
\end{center}

4. **Busca algunas herramientas de color en la web. ¿Qué tipo de cosas se puede hacer con ellas?**

- Un tipo de herramientas de color son las de generación automática de paletas de colores. Por ejemplo, en [coolors.co/](https://coolors.co/), cada vez que pulsamos la barra espaciadora, se genera una paleta nueva con un estilo determinado. A partir de ahí, podemos modificar colores, guardar alguno y que genere nuevas a partir del color elegido, etc.

- Otro tipo de herramientas son los selectores de color online. Webs como [imagecolorpicker.com/](https://imagecolorpicker.com/) nos permiten subir una imágen, ver su paleta, y elegir cualquier tonalidad directamente en formato RGB, listo para usar en nuestros estilos.

---

1. **Identifica webs con iconos propios y webs con iconos estándar**.

- Son pocas las webs que hoy en día se aventuran a crear sus propios iconos, y son difícilmente reconocibles. El motivo es que, pese a que algunos tengan licencia de uso, nada impide hacer un icono casi idéntico, por lo que al final, los típicos botones de "Home", "Settings", etc, son comunes en toda la red.

- Teniendo esto en cuenta, los únicos iconos propios que se me ocurren son los que utilizan el logo de la empresa: el botón para volver a la landing de facebook, twitter, etc.

2. **Busca algunas webs de iconos para descargar.**

- Personalmente me gusta [react icons](https://react-icons.github.io/react-icons/icons?name=ai) por su simpleza y su gran catálogo. También he usado en ocasiones [font awesome](https://fontawesome.com/icons), otra galería enorme de iconos, aunque algunas características son de pago (como iconos con ciertos tamaños).

**• ¿Qué licencias son las más frecuentes?**

- La licencia más frecuente es la MIT (Massachusetts Institute of Technology License), es decir, libre de uso, modificación y distribución. También tenemos la MPL (Mozilla Public License), también gratuita (aunque con ciertas condiciones si queremos modificar el código fuente). Finalmente, están los distintos tipos de licencias propietarias, las cuales suelen ser de pago.

**• ¿En qué formatos se suelen descargar?**

- Se suelen "descargar" en formato svg, aunque en la actualidad se ha generalizado el uso de gestores de paquetes de javascript como npm para su implementación en proyectos que utilizen una arquitectura de componetización (aunque el formato sigue siendo svg).

&nbsp;

3. **Buscar cómo se puede aplicar la divina proporción en el diseño web.**

- La manera más frecuente de usar esta proporción es en el "layout" o plantilla general de la web, organizando los contenidos visibles para el usuario con una gran zona que ocupe aproximadamente 2/3 de la pantalla y un "aside" en uno de los lados con un menú de navegación o algún otro tipo de detalle.

Aquí tenemos un ejemplo de la web de National Geographic:

\begin{center}
\includegraphics[width=0.7\columnwidth]{./img/7.jpg}
\end{center}

- Otro caso de uso muy frecuente es con los logos. Aquí vemos algunos ejemplos de marcas reconocidas:

\begin{center}
\includegraphics[width=0.5\columnwidth]{./img/8.jpg}
\end{center}

&nbsp;

4. **Buscar cómo se puede aplicar la regla de los tercios.**

- Esta regla se utiliza para estructurar la landing page en tres columnas verticales.

- La podemos encontrar en landings de marcas tan famosas como Nike, Amazon, etc:

\begin{center}
\includegraphics[width=0.7\columnwidth]{./img/9.jpg}

Si nos fijamos, el input del buscador, el logo o el carrito, están en puntos prácticamente idénticos.

\includegraphics[width=0.7\columnwidth]{./img/10.jpg}
\end{center}

---

1. **Busca páginas que ofrezcan patrones de diseño online**.
   https://www.liderlogo.es/diseno-web/patrones-de-diseno-web-populares/
