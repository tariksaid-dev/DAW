import bpc.daw.objetos.MarcadorMejorado;

public class Ejercicio48 {
    public static void main(String[] args) {
//         Ejercicio 48 : En la librería “Objetos Sencillos” está la clase MarcadorMejorado. Haz un
// programa en el que se cree un partido de baloncesto para el partido que van a jugar el
// Estudiantes y el CB Granada. Registra las siguientes canastas y muestra el nombre de los
// equipos, los puntos que tiene cada uno, el nombre del equipo que va ganando y el que va
// perdiendo. Compara el código con el del ejercicio 12. ¿Cuál crees que es mejor?
// E ->2, CB -> 3, E->2, CB->2, CB->3, E->1, E->1, CB->2
        MarcadorMejorado mm = new MarcadorMejorado("Estudiantes", "CB Granada");
        // var canasta_loc = MarcadorMejorado.CANASTA_LOCAL;
        
        mm.anotarCanasta(MarcadorMejorado.CANASTA_VISITANTE, MarcadorMejorado.TRIPLE);
        System.out.println(mm.toString());
        mm.anotarCanasta(MarcadorMejorado.CANASTA_LOCAL, MarcadorMejorado.NORMAL);
        System.out.println(mm.toString());
        mm.anotarCanasta(MarcadorMejorado.CANASTA_VISITANTE, MarcadorMejorado.NORMAL);
        System.out.println(mm.toString());
        mm.anotarCanasta(MarcadorMejorado.CANASTA_VISITANTE, MarcadorMejorado.TRIPLE);
        System.out.println(mm.toString());
        mm.anotarCanasta(MarcadorMejorado.CANASTA_LOCAL, MarcadorMejorado.TIRO_LIBRE);
        System.out.println(mm.toString());
        mm.anotarCanasta(MarcadorMejorado.CANASTA_LOCAL, MarcadorMejorado.TIRO_LIBRE);
        System.out.println(mm.toString());
        mm.anotarCanasta(MarcadorMejorado.CANASTA_VISITANTE, MarcadorMejorado.NORMAL);
        System.out.println(mm.toString());
        mm.anotarCanasta(MarcadorMejorado.CANASTA_LOCAL, MarcadorMejorado.NORMAL);
        System.out.println(mm.toString());
        
        System.out.println("El equipo local " + mm.getNombreLocal() + " tiene " + mm.getPuntosLocal() + " puntos.");
        System.out.println("El equipo visitante " + mm.getNombreVisitante() + " tiene " + mm.getPuntosVisitante() + " puntos.");
        System.out.println("Va ganando: " + mm.getNombreEquipoGanador() + "\n" + "Va perdiendo: " + mm.getNombreEquipoPerdedor());
    }
}
