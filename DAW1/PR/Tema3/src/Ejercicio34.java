public class Ejercicio34 {
    public static void main(String[] args) {
//         Ejercicio 34: Calcula la suma de los cuadrados de los números comprendidos entre 5 y 13:
// 52 +62+72+82+92+102+112+122+132
        double y = 0;
        for(int i=5; i<14; i++) {
            double x = Math.pow(i, 2);
            y += x;
            System.out.println(y);
        }
    }
}
