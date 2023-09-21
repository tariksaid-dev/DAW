import java.util.*;
public class Ejercicio46 {
    public static void main(String[] args) {
//         Ejercicio 46 : Realiza un programa que pregunte al usuario su año de nacimiento, si es hombre o
// mujer, su altura (en metros), peso (en kg) y muestre por pantalla su frecuencia cardiaca máxima, su
// índice de masa corporal y su estado según la Organización Mundial de la Salud.
//  Frecuencia cardiaca máxima: Si es hombre se calcula como 220 - edad, y si es mujer se
//     calcula como 226 - edad.
//  Índice de masa corporal (IMC): Se calcula dividiendo el peso entre la altura elevada al
//     cuadrado y se muestra con dos cifras decimales.

        System.out.println("Introduce tu año de nacimiento: ");
        int añoNacimiento = new Scanner(System.in).nextInt();
        int edad = 2022 - añoNacimiento;
        System.out.println("Introduce tu género (escribe 1 si eres hombre, 0 si eres mujer): ");
        int género = new Scanner(System.in).nextInt();
        System.out.println("Introduce tu altura en metros: ");
        double altura = new Scanner(System.in).nextDouble();
        System.out.println("Introduce tu peso en kilogramos: ");
        double peso = new Scanner(System.in).nextDouble();

        // Calculamos frecuencia cardíaca máxima:
        if (género == 1) {
            int frecuenciaCardíaca = 220 - edad;
            System.out.println("Tu frecuencia cardíaca máxima es: " + frecuenciaCardíaca);
        } else if (género == 0) {
            int frecuenciaCardíaca = 226 - edad;
            System.out.println("Tu frecuencia cardíaca máxima es: " + frecuenciaCardíaca);
        } else {
            System.out.println("Género incorrecto, introduce 1 si eres hombre, y 0 si eres mujer.");
        }

        // Calculamos el índice de masa corporal:
        double imc = peso / (altura * altura);
        System.out.println(imc);

        // Finalmente comparamos el imc con el estado según la tabla de la OMS:
        if (imc < 16) {
            System.out.println("Infrapeso: delgadez severa");
        } else if (imc >= 16 && imc <= 16.99) {
            System.out.println("Infrapeso: delgadez moderada");
        } else if (imc >= 17 && imc <= 18.49) {
            System.out.println("Infrapeso: delgadez aceptable");
        } else if (imc >= 18.50 && imc <= 24.99) {
            System.out.println("Peso normal");
        } else if (imc >= 25.00 && imc <= 29.99) {
            System.out.println("Sobrepeso");
        } else if (imc >= 30.00 && imc <= 34.99) {
            System.out.println("Sobrepeso: tipo I");
        } else if (imc >= 35.00 && imc <= 40.00) {
            System.out.println("Sobrepeso: tipo II");
        } else if (imc > 40.00) {
            System.out.println("Sobrepeso: tipo III");
        }
    }
}
