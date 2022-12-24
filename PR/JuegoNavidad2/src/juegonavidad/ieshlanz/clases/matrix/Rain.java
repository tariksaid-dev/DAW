package juegonavidad.ieshlanz.clases.matrix;
import bpc.daw.consola.*;
import java.awt.*;
import java.util.*;
import java.awt.Color;


public class Rain {
    private int x = Toolkit.getDefaultToolkit().getScreenSize().width;
    private int y = Toolkit.getDefaultToolkit().getScreenSize().height;
    private Color color = Color.GREEN;
    private int columnas = this.x / 40;
    private int filas = this.y / 40;
    private int posicionX = 0;
    private int posicionY = 0;
    



    public void dibujar(Graphics g, CapaTexto ct) throws InterruptedException {
        g.setColor(this.color);
        g.setFont(new Font("mono", Font.BOLD, 24));
        for (int i = 0; i < this.filas; i++) {
            this.posicionX = new Random().nextInt(30, this.x);
            this.posicionY = 0;
            for (int j = 0; j < this.columnas; j++) {
                g.setColor(color);
                this.posicionY = j * 20;
                g.drawString(this.caracterAzar() + "", this.posicionX, this.posicionY);
                this.caida();
                this.oscurecer(g);
                
            }
        }
    }

    // haz una función que haga el fondo un poco más oscuro
    private void oscurecer(Graphics g) {
        g.setColor(new Color(0, 0, 1, 10));
        g.fillRect(0, 0, this.x, this.y);
        
    }

    // haz una función que haga que las letras caigan verticalmente hacia abajo
    private void caida() throws InterruptedException {
        // haz una función que haga que las letras caigan verticalmente hacia abajo
        Thread.sleep(5);
    }

    private char caracterAzar() {
        Random r = new Random();
        int caracter = r.nextInt(94) + 33;
        return  (char) caracter;
    }
}
