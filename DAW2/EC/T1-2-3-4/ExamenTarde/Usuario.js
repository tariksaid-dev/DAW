import { Publicacion } from "./Publicacion";

export function Usuario(
  username,
  nombreCompleto,
  amigos = [],
  publicaciones = []
) {
  this._username = username;
  this._nombreCompleto = nombreCompleto;
  this._amigos = amigos;
  this._publicaciones = publicaciones;
}

Usuario.prototype = {
  agregarAmigo(amigo) {
    this._amigos.push(amigo);
  },

  agregarPublicacion(mensaje, fecha) {
    this._publicaciones.push(new Publicacion(mensaje, fecha));
  },
};
