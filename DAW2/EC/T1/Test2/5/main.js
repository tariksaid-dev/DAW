/**
 * 5
 * Crea una aplicación que obtenga y muestre los comentarios de una publicación de un usuario específico utilizando JSONPlaceholder. Debes modelar un objeto Usuario que tenga un método para obtener los comentarios de una publicación. Como aún no sabemos el acceso a APIs, copiar el objeto JSON de Json PlaceHolder a una variable en assets y tratarla desde ahí.
 */

import { Usuario } from "./Usuario";
import { users, comments } from "./constants";

const user1 = new Usuario(1, "John", "Doe", "johndoe@example.com");

const com = user1.getComments(comments);

console.log(com);
