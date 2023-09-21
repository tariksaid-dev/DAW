package punto;

import java.awt.Toolkit;

public class Punto {
    public int x;
    public int y;

    public Punto() {
        this.x = 0;
        this.y = 0;
    }

    public Punto(int x, int y) {
        if(Toolkit.getDefaultToolkit().getScreenSize().width < x || Toolkit.getDefaultToolkit().getScreenSize().height < y) {
            this.x = Toolkit.getDefaultToolkit().getScreenSize().width;
            this.y = Toolkit.getDefaultToolkit().getScreenSize().height;
        } else {
            this.x = x;
            this.y = y;
        }
    }

    public Punto(Punto p) {
        this.x = p.x / 2;
        this.y = p.y / 2;
    }

    public Punto(double angulo, double distancia) {
        this.x = (int)(Math.cos(angulo) * distancia);
        this.y = (int)(Math.sin(angulo) * distancia);
    }
}
