# Información sobre mi proyecto

1. Se han usado todas las etiquetas semánticas posibles, sin embargo quedan divs. A parte de los normales, usados dentro de las distintas etiquetas para agrupar elementos para poder tener unos estilos correctos, React obliga a tener un punto de entrada de la aplicación el cuál es un div (el único elemento en index.html, el cuál tiene un id llamado "root"). Esto hace que no podamos hacer un layout directamente en el body, lo que nos obliga a tener otro div con su correspondiente plantilla grid.

2. Se ha usado Tailwind para dar estilos. Esto hace que en la hoja de estilos solo esté la importación de las fuentes de Google, el propio tailwind, y algunos estilos para ciertos elementos sueltos (los cuáles estarán siempre presentes).

3. Las imágenes de los distintos artículos no las he elegido yo, si no que vienen fetcheadas de la siguiente api: [https://fakestoreapi.com/products] para imitar al máximo una aplicación real.

4. Respecto a las fuentes, su importación se encuentra en la primera línea del archivo index.css, y se integran a tailwind en su correspondiente archivo de configuración. Para realizar las orientaciones de la práctica, he cambiado la fuente del nav a Lato y el header a Montserrat.

5. Dado que es una aplicación componetizada, no hay comentarios en los archivos, ya que son muchos y diversos. Se considerará este readme como dichos comentarios.

6. Respecto al estilo de la página, es la que diseñé en el tema 1 y apenas ha sufrido cambios. He intentado hacer una landing "similar" a la de Zara, donde el producto y las modelos sean el motivo principal, de modo que intento hacerlas resaltar con imágenes grandes y claras. Respecto a la parte de los productos, considero que el display de los productos es suficiente pero mejorable, pero poco más puedo hacer con una api de muestra. En mi opinión, no debería haber navbar (o que esta fuera desplegable y su estado natural fuera cerrado) ni header ni footer, ya que considero que los diseños minimalistas dan una sensación de lujo y exclusividad (como podemos ver en la ya nombrada Zara, o Nike, o Tesla, etc), mientras que una interfaz sobrecargada da la sensación contraria (como Amazon o AliExpress).

7. Los colores fueron elegidos con la intención de hacer un modo oscuro/claro que finalmente no ha sido realizado. Por regla general, las webs de productos "de lujo" mantienen estilos claros.
