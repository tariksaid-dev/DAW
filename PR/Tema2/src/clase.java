import bpc.daw.ascensor.*;
public class clase {
    public static void main(String[] args) {
        Persona p = new Persona("Tarik", 77);
        Ascensor a = new Ascensor(-1, 5, 40);

        try {
            a.añadir(p);
        } catch (PesoMaximoException e) {
            System.out.println("No se pudo meter en el ascensor");
        }
        System.out.println("Fin");
    }
}
