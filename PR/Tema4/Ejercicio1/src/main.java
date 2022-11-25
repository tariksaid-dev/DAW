import daw.persona.*;

public class main {
    public static void main(String[] args) throws Exception {
        DNI dni = new DNI("12345678A");
        System.out.println(dni.número);
        System.out.println(dni.letra);
    }
}
