package EjercicioElCine;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cartelera {
    public static List<Sala> cargarCartelera(String ruta) throws IOException {
        File f = new File(ruta);
        Scanner sc = new Scanner(f);
        List<Sala> l = new ArrayList<>();
        int n = 0;
        
        while (sc.hasNextLine()) {
            n++;
            String linea = sc.nextLine();
            int c = Integer.parseInt(linea.substring(0, 2));
            Pelicula pelicula = new Pelicula(linea.substring(3));
            l.add(new Sala(n, c, pelicula));
        }
        
        return l;
    }
}
