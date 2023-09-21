public class Ejercicio16 {
    public static void main(String[] args) {
//         Ejercicio 16 : Un videoclub alquila la película "El padrino" a 3.5 €/día y "Odisea 2001" por 2.95 €/día.
// Haz un programa que muestre por pantalla cuánto dinero se necesita para alquilar dos días estas
// películas. Haz que también se muestre por pantalla si es suficiente un billete de 5€ para pagar dicho
// alquiler. 
        double padrino = 3.5;
        double odisea = 2.95;
        System.out.println("Para alquilar 'El padrino' durante dos días, necesitas " + (padrino * 2) + " euros" + "; y si en su lugar deseas alquilar 'Odisea 2001' necesitas " + (odisea * 2) + " euros.\n Si solo tienes 5 euros, en el caso de 'El padrino' te faltan " + (padrino * 2 - 5) + " euros, y para 'Odisea 2001' " + (odisea * 2 - 5) + ".");
    }
}