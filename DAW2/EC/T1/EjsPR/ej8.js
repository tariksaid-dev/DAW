// EJERCICIO 8 RELACIÓN 3 OBJETOS
// EJERCICIO 4 RELACIÓN 4 PROTOTIPOS

/**
 * Escribe una función que tome un objeto como argumento. Dicho objeto tienen como argumento o valor dentro de la clave 'a' el valor 'b' que puede o no tener otras subclaves. Se pide obtener la propiedad 'b' del objeto 'a' en caso de que exista. Si no existe devolverá undefined
 * @author {Tarik Said}
 */

const myObj = {
  a: {
    b: 7,
  },
};

function foo(bar) {
  if (
    Object.entries(bar.a).length !== 0 ||
    Object.entries(bar.a.b).length !== 0
  ) {
    return bar.a.b;
  }
  return undefined;
}

console.log(foo(myObj));
