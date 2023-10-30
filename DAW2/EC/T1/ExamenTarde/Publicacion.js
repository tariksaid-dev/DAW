export function Publicacion(mensaje, fecha, likes = 0) {
  this._mensaje = mensaje;
  this._fecha = fecha;
  this._likes = likes;
}

Publicacion.prototype = {
  darLike() {
    this._likes++;
  },
};
