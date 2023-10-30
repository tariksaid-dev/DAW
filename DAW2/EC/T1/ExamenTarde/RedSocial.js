import examenRedSocial from "./assets/datos";

export class RedSocial {
  _usuarios = [];

  agregarUsuario(usuario) {
    this._usuarios.push(usuario);
  }

  /**
   * Método que devuelve la lista de usuarios que tiene nuestra Red Social
   * @returns {Array} El array de usuarios
   */
  obtenerUsuarios() {
    return this._usuarios;
  }

  obtenerPublicacionesUsuario(username) {
    return examenRedSocial.usuarios.map((el) => {
      if (el.username === username) {
        return new Map().set(el.username, el.publicaciones);
      }
    });
  }

  encontrarPublicacionMasLike() {
    let maxLikes = 0;
    let res = {};

    examenRedSocial.usuarios.forEach((user) => {
      user.publicaciones.forEach((el) => {
        if (el.likes > maxLikes) {
          maxLikes = el.likes;
          res = el;
        }
      });
    });

    return res;
  }

  encontrarUsuariosMasLikes() {
    let res = "";
    let maxLikes = 0;

    examenRedSocial.usuarios.forEach((user) => {
      let userLikes = 0;

      user.publicaciones.forEach((pub) => {
        userLikes += pub.likes;
      });
      if (userLikes > maxLikes) {
        maxLikes = userLikes;
        res = user.username;
      } else {
        userLikes = 0;
      }
    });

    return res;
  }

  guardarEnLocalStorage() {
    localStorage.clear();
    localStorage.setItem("ExamenRedSocial", JSON.stringify(examenRedSocial));
  }
}
