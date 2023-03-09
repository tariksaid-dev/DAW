import bpc.daw.reproductor.*;
public class Ejercicio32 {
    public static void main(String[] args) {
//         Ejercicio 32 : En la librería ReproductorMúsica.jar se encuentran clases para reproducir
// archivos mp3 y crear listas de reproducción que pueden guardarse en el disco. Su diagrama de
// clases y documentación vienen en el pdf que acompaña la librería. Realiza un programa que
// reproduzca en segundo plano (asíncrona) un archivo mp3 que tengas en tu disco duro. Una vez
// comenzada la reproducción, se mostrará el título de la canción, su autor y su duración.
        String ruta = "C:/Users/trutr/Desktop/mp3/1.mp3";
        ArchivoMP3 f = new ArchivoMP3(ruta);
        Reproductor r = new Reproductor(f, false, true);
        System.out.println(f.getAutor());
        // f.getTitulo();
        System.out.println(f.getDuracion());
        r.play();
    }
}
