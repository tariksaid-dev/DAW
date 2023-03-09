import java.util.*;
public class Ejercicio3 {
    public static void main(String[] args) {
        System.out.println("Introduce un número de cuatro cifras: ");
        // String num = new Scanner(System.in).nextLine();
        int num = 5273;
        int primeraCifra = num / 1000;
        int segundaCifra = (num / 100) - primeraCifra * 10;
        int terceraCifra = (num / 10) - primeraCifra * 100 - segundaCifra * 10; 
        int cuartaCirfra = num - primeraCifra * 1000 - segundaCifra * 100 - terceraCifra * 10; 
        if(primeraCifra == cuartaCirfra && segundaCifra == terceraCifra) {
            System.out.println("Es capicua");
        } else {
            System.out.println("No es capicua");
        }
    }
}