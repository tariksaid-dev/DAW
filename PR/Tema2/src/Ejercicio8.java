import bpc.daw.objetos.*;

public class Ejercicio8 {
    public static void main(String[] args) {
//         Ejercicio 8 : Haz un programa en el que haya dos depósitos de agua de capacidad máxima 20
// litros y con capacidades iniciales 15 y 5 litros respectivamente. Retira del primero cinco litros
// de agua y añádelos al segundo. Dibuja los depósitos antes y después de la operación.
        DepositoAgua d1 = new DepositoAgua(15, 20);
        DepositoAgua d2 = new DepositoAgua(5, 20);
        d1.dibujar();
        d2.dibujar();
        d1.retirarLitro();
        d1.retirarLitro();
        d1.retirarLitro();
        d1.retirarLitro();
        d1.retirarLitro();
        d2.añadirLitro();
        d2.añadirLitro();
        d2.añadirLitro();
        d2.añadirLitro();
        d2.añadirLitro();
        d1.dibujar();
        d2.dibujar();
    }   
}
