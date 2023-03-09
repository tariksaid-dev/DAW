import bpc.daw.musica.*;
public class Ejercicio31 {
    public static void main(String[] args) {
//         jercicio 31 : En la librería Música se encuentran clases para reproducir una sencilla partitura
// en un instrumento musical. Haz un programa que reproduzca en un piano la siguiente
// canción. Modifica el programa para que al finalizar, se vuelva a reproducir con una guitarra.
        Instrumento p = new Piano();
        Instrumento g = new Guitarra();
        Cancion c = new Cancion("Twinkle Twinkle"); 
        NotaMusical doNegra = new NotaMusical(0, 2); 
        NotaMusical solNegra = new NotaMusical(4, 2); 
        NotaMusical laNegra = new NotaMusical(5, 2); 
        NotaMusical solBlanca = new NotaMusical(4, 1); 
        NotaMusical faCorchea = new NotaMusical(3, 3); 
        NotaMusical miCorchea = new NotaMusical(2, 3); 
        NotaMusical reSemiCorchea = new NotaMusical(1, 4); 
        NotaMusical miSemiCorchea = new NotaMusical(2, 4); 
        NotaMusical faSemiCorchea = new NotaMusical(3, 4);  
        c.añadir(doNegra);
        c.añadir(doNegra);
        c.añadir(solNegra);
        c.añadir(solNegra);
        c.añadir(laNegra);
        c.añadir(laNegra);
        c.añadir(solBlanca);
        c.añadir(faCorchea);
        c.añadir(faCorchea);
        c.añadir(miCorchea);
        c.añadir(miCorchea);
        c.añadir(reSemiCorchea);
        c.añadir(miSemiCorchea);
        c.añadir(faSemiCorchea);
        c.añadir(reSemiCorchea);
        c.añadir(doNegra);
        p.reproducir(c);
        g.reproducir(c);
    }
}
