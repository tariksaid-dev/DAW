public class Ejercicio1 {
    public static void main(String[] args) {
        String[] profes = {"Juan", "Manolo", "Hermenegildo", "Tim"};
        double[] notas = {70, 30, 80, 40};
        double media = (notas[0] + notas[1] + notas[2] + notas[3]) / notas.length;
        if (notas[0] >= media) {
            System.out.println(profes[0]);
        } 
        if (notas[1] >= media) {
            System.out.println(profes[1]);
        }
        if (notas[2] >= media) {
            System.out.println(profes[2]);
        }
        if (notas[3] >= media) {
            System.out.println(profes[3]);
        }
    }
}