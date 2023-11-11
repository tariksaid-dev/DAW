1. Crear un módulo llamado errores.js al que le pase como primer parámetro el texto que quiero mostrar y como segundo parámetro el elemnto del dom donde lo quiero colocar de tal forma que cuando inserte una tarea cuyo nombre/title ya exista, automáticamente me mostrará un error de color rojo debajo indicando el texto que queremos con una duración de 3s ✔️

2. Doble click sobre el texto de una tarea (span) me lanzará un prompt con el contenido de esa tarea, pudiendo modificar solo el texto. ✔️

3. Crear un nuevo botón imprimir tarea, con un icono de font-awesome, que me imprima en un pdf los siguientes datos:

- El id
- el texto de la tarea
- Si está completada o no
- Fecha actual en que se imprime la tarea

4. Utilizando Bob descargar el pdf a nuestro ordenador con el nombre que sea: Las cuatro primeras letras del texto de la tarea_día_mes_año.pdf

5. Pulsando el botón de la lupa, e introduciendo cualquier texto, al lanzar el evento del enter me filtrará todas aquellas tareas que contengan en su texto/title el texto introducido.

6. Crear un botón a la izquierda de mostrar gráfico llamado generar evento calendario de tipo "ics" que al pulsarlo me genere un evento del calendario cuya fecha sea la actual y cuya fecha de finalización sea exactamente treinta días después, y cuyo contenido sea el número de tareas que tengo sin realizar.
