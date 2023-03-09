public class Ejercicio35 {
    public static void main(String[] args) {
    //     Ejercicio 35 : La siguiente gráfica recoge los ingresos y gastos de una empresa en un año:
    //     Haz un programa que muestre por pantalla:
    //     a) Si cada mes ha tenido un balance positivo o negativo.
    //     b) La media de ingresos y gastos anual
    //     c) El balance final anual y si ha sido positivo o no. 
        double ingresosEnero = 15000;
        double ingresosFebrero = 16000;
        double ingresosMarzo = 10000;
        double ingresosAbril = 9000;
        double ingresosMayo = 12000;
        double ingresosJunio = 13000;
        double ingresosJulio = 7000;
        double ingresosAgosto = 6000;
        double ingresosSeptiembre = 11000;
        double ingresosOctubre = 13000;
        double ingresosNoviembre = 14000;
        double ingresosDiciembre = 15000;
        double gastosEnero = 8000;
        double gastosFebrero = 9000;
        double gastosMarzo = 11000;
        double gastosAbril = 10000;
        double gastosMayo = 12000;
        double gastosJunio = 10000;
        double gastosJulio = 9000;
        double gastosAgosto = 8000;
        double gastosSeptiembre = 9000;
        double gastosOctubre = 9000;
        double gastosNoviembre = 12000;
        double gastosDiciembre = 14000;
        double ingresosAnual = (ingresosEnero + ingresosFebrero + ingresosMarzo + ingresosAbril + ingresosMayo + ingresosJunio 
        + ingresosJulio + ingresosAgosto + ingresosSeptiembre + ingresosOctubre + ingresosNoviembre + ingresosDiciembre) / 12;
        double gastosAnual = (gastosEnero + gastosFebrero+ gastosMarzo + gastosAbril + gastosMayo + gastosJunio 
        + gastosJulio + gastosAgosto + gastosAgosto + gastosSeptiembre + gastosOctubre + gastosNoviembre + gastosDiciembre) / 12;
        double balanceAnual = ingresosAnual - gastosAnual;
        if (ingresosEnero > gastosEnero) {
            System.out.println("El balance de enero ha sido positivo.");
        } else {
            System.out.println("El balance de enero ha sido negativo.");
        }
        if (ingresosFebrero > gastosFebrero) {
            System.out.println("El balance de febrero ha sido positivo.");
        } else {
            System.out.println("El balance de febrero ha sido negativo.");
        }
        if (ingresosMarzo > gastosMarzo) {
            System.out.println("El balance de marzo ha sido positivo.");
        } else {
            System.out.println("El balance de marzo ha sido negativo.");
        }
        if (ingresosAbril > gastosAbril) {
            System.out.println("El balance de abril ha sido positivo.");
        } else {
            System.out.println("El balance de abril ha sido negativo.");
        }
        if (ingresosMayo > gastosMayo) {
            System.out.println("El balance de mayo ha sido positivo.");
        } else {
            System.out.println("El balance de mayo ha sido negativo.");
        }
        if (ingresosJunio > gastosJunio) {
            System.out.println("El balance de junio ha sido positivo.");
        } else {
            System.out.println("El balance de junio ha sido negativo.");
        }
        if (ingresosJulio > gastosJulio) {
            System.out.println("El balance de julio ha sido positivo.");
        } else {
            System.out.println("El balance de julio ha sido negativo.");
        }
        if (ingresosAgosto > gastosAgosto) {
            System.out.println("El balance de agosto ha sido positivo.");
        } else {
            System.out.println("El balance de agosto ha sido negativo.");
        }
        if (ingresosSeptiembre > gastosSeptiembre) {
            System.out.println("El balance de septiembre ha sido positivo.");
        } else {
            System.out.println("El balance de septiembre ha sido negativo.");
        }
        if (ingresosOctubre > gastosOctubre) {
            System.out.println("El balance de octubre ha sido positivo.");
        } else {
            System.out.println("El balance de octubre ha sido negativo.");
        }
        if (ingresosNoviembre > gastosNoviembre) {
            System.out.println("El balance de noviembre ha sido positivo.");
        } else {
            System.out.println("El balance de noviembre ha sido negativo.");
        }
        if (ingresosDiciembre > gastosDiciembre) {
            System.out.println("El balance de diciembre ha sido positivo.");
        } else {
            System.out.println("El balance de diciembre ha sido negativo.");
        }
        System.out.println("La media de ingresos anual es de " + ingresosAnual);
        System.out.println("La media de gastos anual es de " + gastosAnual);
        System.out.println("El balance final anual es de " + balanceAnual);
        if (balanceAnual > 0) {
            System.out.println("El balance anual ha sido positivo");
        } else {
            System.out.println("El balance anual ha sido negativo");
        }
    }
}
