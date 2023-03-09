# Documentación

El objetivo es crear un programa que cumpla las siguientes funciones:

1. Preguntar a los alumnos si quieren salir o no
   1. Esta información deberemos recogerla en algún tipo de soporte como .json o .csv
   2. Debe ser fluido, es decir, no se puede escribir ni editar parámetros, así que lo mejor sería pulsar un botón.

- Crearemos un canvas con TK el cual leera una lista de nombres por un display, con tres botones en la parte inferior: Si, No y Finish.
  - Cuando se presione finish, el canvas se cerrará y se abrirá main.py.

1. Usando el azar, seleccionar, entre los alumnos que han dicho sí, a uno de ellos.
   1. ref.
2. Guardar la información sobre qué alumnos han sido seleccionados de manera acumulativa.
3. Idear un método para que los alumnos seleccionados tengan menor probabilidad de ser elegidos la siguiente vez.
4. Añadir dicho método al punto 2.1

---

# Bugs conocidos

### Alumnos.py

1. Al hacer click en siguiente al final de la lista, el programa dará error. Soluciones:
   1. Hacer un if en la función siguiente(), donde usando como parámetro un data\["alumnos"].lenght nos cierre guardando o de un aviso al llegar al final.
   2. Añadir un elemento final a data.json que indique que hemos llegado al final de la lista y que es necesario clickar en finish.

### main.py

1. Si en main.py un alumno sale seleccionado 2 veces, la probabilidad se le reduce de todas formas. Soluciones:
   1. Hacer la selección de los 4-6 alumnos de golpe, añadiendo un display donde pongamos el número de ejercicios a corregir para ese día. Añadimos esos alumnos a un array vacío y pasamos los displays de la GUI mediante dicho array.

# ToDo

1. Añadir un if() en main.py para filtrar el valor "sale" de modo que solo puedan ser seleccionados los True.
2. Arreglar bugs y hacer los cambios oportunos en la GUI
