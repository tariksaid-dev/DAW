package daw.persona;
import java.util.*;

public class CuentaCorriente {
    public int número;
    public double saldo;

    public CuentaCorriente(int número, double saldo) {
        this.número = número;
        this.saldo = saldo;
    }

    public CuentaCorriente(int número) {
        this(número, 0);
    }

    public CuentaCorriente() {
        this(new Random().nextInt(1001), 0);
    }

    public void añadirDinero(int cantidad) {
        this.saldo += cantidad;
    }

    public void retirarDinero(int cantidad) {
        this.saldo -= cantidad;
    }
}
