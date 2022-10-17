public class Ejercicio36 {
    public static void main(String[] args) {
//         Ejercicio 36 : En la “Librería Estándar de Java” está la clase Math, que sirve para realizar
// cálculos matemáticos. Consulta su documentación y calcula:
// a. La raíz cuadrada de 150
// b. 2 elevado a 9, y se divide entre el logaritmo neperiano de 6
// c. Coseno de 0.16 radianes.
// d. Seno de 45 grados (utiliza la clase Math para pasar de grados a radianes)
        System.out.println(Math.sqrt(150));
        System.out.println(Math.pow(2, 9) / Math.log(6));
        System.out.println(Math.cos(0.16));
        System.out.println(Math.sin(Math.toRadians(45)));
    }
}