import bpc.daw.objetos.*;
public class Ejercicio12 {
    public static void main(String[] args) {
        MarcadorBaloncesto m = new MarcadorBaloncesto("Estudiantes", "CB Granada");
        m.anotarCanasta('L', 2);
        m.anotarCanasta('V', 3);
        m.anotarCanasta('L', 2);
        m.anotarCanasta('V', 2);
        m.anotarCanasta('V', 3);
        m.anotarCanasta('L', 1);
        m.anotarCanasta('L', 1);
        m.anotarCanasta('V', 2);
        System.out.println("El equipo local " + m.getNombreLocal() + " tiene " + m.getPuntosLocal() + " puntos.");
        System.out.println("El equipo visitante " + m.getNombreVisitante() + " tiene " + m.getPuntosVisitante() + " puntos.");
        System.out.println("Va ganando: " + m.getNombreEquipoGanador());
        System.out.println("Va perdiendo: " + m.getNombreEquipoPerdedor());
    }
}
