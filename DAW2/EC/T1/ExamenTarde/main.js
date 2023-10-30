import { Publicacion } from "./Publicacion";
import { RedSocial } from "./RedSocial";
import { Usuario } from "./Usuario";
import examenRedSocial from "./assets/datos";

const red = new RedSocial();

const user1 = new Usuario("Tharak", "Tarik Said");
const user2 = new Usuario("PP", "Pepe Pepito");
const user3 = new Usuario("Patricio", "Patrick");

red.agregarUsuario(user1);
red.agregarUsuario(user2);
red.agregarUsuario(user3);

user1.agregarAmigo(user2);
user1.agregarAmigo(user3);

user1.agregarPublicacion("Ding Ding el 10 está aquí", "2023-10-27");

console.log(user1._amigos);
console.log(red.obtenerUsuarios());

console.log(red.encontrarPublicacionMasLike());
console.log(red.encontrarUsuariosMasLikes());

console.log(red);

red.guardarEnLocalStorage();
