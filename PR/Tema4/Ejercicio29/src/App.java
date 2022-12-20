import bolas.*;
public class App {
    public static void main(String[] args) {
        try {
            BolaDragon bola1 = BolaDragon.crearBolaDragon();
            System.out.println(bola1.getNumero());
            BolaDragon bola2 = BolaDragon.crearBolaDragon();
            System.out.println(bola2.getNumero());
            BolaDragon bola3 = BolaDragon.crearBolaDragon();
            System.out.println(bola3.getNumero());
            BolaDragon bola4 = BolaDragon.crearBolaDragon();
            System.out.println(bola4.getNumero());
            BolaDragon bola5 = BolaDragon.crearBolaDragon();
            bola5.getNumero();
            BolaDragon bola6 = BolaDragon.crearBolaDragon();
            BolaDragon bola7 = BolaDragon.crearBolaDragon();
            BolaDragon bola8 = BolaDragon.crearBolaDragon();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
