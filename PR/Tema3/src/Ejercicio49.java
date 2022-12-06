import java.util.*;

public class Ejercicio49 {
    public static void main(String[] args) {
        // Haz un ArrayList<String> llamado palabras en el que guardarás la lista de palabras disponibes en el juego, y una variable llamada vidas con el valor 4.
        List<String> palabras = new ArrayList<>(Arrays.asList("sota", "caballo", "rey", "bien", "mal", "peor", "mejor"));
        int vidas = 4;
        // System.out.println(palabras.toString());
        

        Collections.shuffle(palabras);
        // System.out.println(palabras.toString());


        while(palabras.size() > 0) {

            
            String palabraElegida = palabras.get(0);
            palabras.remove(0);
            // System.out.println(palabras.toString());
            // System.out.println(palabraElegida);

            boolean[] aciertos = new boolean[palabraElegida.length()];

            String vistaUsuario = "";
            for(int i=0; i<aciertos.length; i++) {
                if(aciertos[i] == false) {
                    vistaUsuario += "-";
                }
            }

            while(vidas > 0 && vistaUsuario.contains("-")) {
                System.out.println(vistaUsuario);
                System.out.println(vidas);

                System.out.println("Escribe una letra: ");
                String inputUsuario = new Scanner(System.in).nextLine();


                if (palabraElegida.contains(inputUsuario)) {
                    for(int i=0; i<palabraElegida.length(); i++) {
                        if(palabraElegida.toCharArray()[i] == inputUsuario.toCharArray()[0]) {
                            aciertos[i] = true;
                        }
                    }
                } else {
                    vidas --;
                }
                vistaUsuario = "";
                for(int i=0; i<aciertos.length; i++) {
                    if(aciertos[i] == false) {
                        vistaUsuario += "-";
                    } else {
                        vistaUsuario += palabraElegida.toCharArray()[i];
                    }
                }
            }
            if (!vistaUsuario.contains("-")) {
                System.out.println(vistaUsuario);
                System.out.println("Has ganado!");
            }
        }
        System.out.println("No quedan más palabras! Has completado el juego.");
    }
}    