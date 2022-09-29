public class Ejercicio25 {
    public static void main(String[] args) {
//         Ejercicio 25 : Realiza “a mano” los siguientes cálculos con las variables booleanas A=true, B=false,
// C=false y D=true 
        boolean A = true;
        boolean B = false;
        boolean C = false;
        boolean D = true;
        if (A || (B && C)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        if ((A && !B) || !(D && A)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        if (A || (B && C || (!(A || B) && C))) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        if (!(A || B) || (!A && !B)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        if ((!C && (!A || !B)) || (D && (!(C && B)))) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
