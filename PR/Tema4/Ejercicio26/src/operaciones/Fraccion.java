package operaciones;

public class Fraccion {

    private int numerador;
    private int denominador;

    public Fraccion(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public int getNumerador() {
        return numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public double getValorReal() {
        return (double) numerador / denominador;
    }

    public Fraccion getInversa() {
        return new Fraccion(denominador, numerador);
    }

    public static Fraccion sumar(Fraccion a, Fraccion b) {
        int numerador = a.getNumerador() * b.getDenominador() + b.getNumerador() * a.getDenominador();
        int denominador = a.getDenominador() * b.getDenominador();
        return new Fraccion(numerador, denominador);
    }

    public static Fraccion multiplicar(Fraccion a, Fraccion b) {
        int numerador = a.getNumerador() * b.getNumerador();
        int denominador = a.getDenominador() * b.getDenominador();
        return new Fraccion(numerador, denominador);
    }

    public static Fraccion dividir(Fraccion a, Fraccion b) {
        return multiplicar(a, b.getInversa());
    }
}
