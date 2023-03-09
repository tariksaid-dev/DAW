public class Ejercicio8 {
    public static void main(String[] args) {
        double distancia = 92;
        double velocidadCoche = 120;
        double velocidadCamion = 70;
        double horaSalida = 12;
        double tiempoEncuentro = distancia / (velocidadCamion + velocidadCoche);
        double minutosFormat = tiempoEncuentro * 60;
        double horasFormat = minutosFormat / 100;
        double horaEncuentro = horaSalida + horasFormat;
        double distanciaRecorridaCamion = velocidadCamion * tiempoEncuentro;
        double distanciaRecorridaCoche = velocidadCoche * tiempoEncuentro;

        System.out.println("Se encontrarán a las " + horaEncuentro + " horas. ");
        System.out.println("El coche ha recorrido " + distanciaRecorridaCoche + "km y el camión " + distanciaRecorridaCamion + "km.");
    }
}
