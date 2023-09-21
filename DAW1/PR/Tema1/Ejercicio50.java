public class Ejercicio50{
    public static void main(String[] args) {
        //         Ejercicio 50 : Hacer un programa en el que haya una variable entera llamada dinero e inicializarla a
// cualquier valor. El programa nos expresará esa cantidad en billetes de 500, 100, 50, 20 y 10 € y
// monedas de 2 y 1 €. Se ignoran los céntimos.

//          Sugerencia: Antes de programar, hacer un ejemplo con lápiz y papel. Una vez que tengas
//          claro el procedimiento que hay que seguir para resolver el problema planteado, traslada a un
// programa las mismas operaciones que realizas sobre el papel.
        int dinero = 5671;

        int numeroBilletes500 = dinero / 500;
        int dineroPost500 = dinero % 500;

        int numeroBilletes100 = dineroPost500 / 100;
        int dineroPost100 = dineroPost500 % 100;

        int numeroBilletes50 = dineroPost100 / 50;
        int dineroPost50 = dineroPost100 % 50;

        int numeroBilletes20 = dineroPost50 / 20;
        int dineroPost20 = dineroPost50 % 20;

        int numeroBilletes10 = dineroPost20 / 10;
        int dineroPost10 = dineroPost20 % 10;

        int numeroBilletes2 = dineroPost10 / 2;
        int dineroPost2 = dineroPost20 % 2;

        int numeroBilletes1 = dineroPost2 / 1;

        System.out.println("En " + dinero + " hay " + numeroBilletes500 + " de 500 euros, " 
        + numeroBilletes100 + " de 100 euros, " + numeroBilletes50 + " de 50 euros, " 
        + numeroBilletes20 + " de 20 euros, " + numeroBilletes10 + " de 10 euros, " 
        + numeroBilletes2 + " de 2 euros y " + numeroBilletes1 + " de 1 euro.");
    }
}