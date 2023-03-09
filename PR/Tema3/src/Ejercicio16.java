import bpc.daw.consola.*;
import java.awt.*;
import java.util.*;

public class Ejercicio16 {
    public static void main(String[] args) {
//         Ejercicio 16: Haz un programa que dibuje en la pantalla 8 rectángulos cuyas coordenadas,
// dimensiones y color sean aleatorios.
        Consola c = new Consola();
        Teclado t = c.getTeclado();
        CapaCanvas canvas = c.getCapaCanvas();
        Graphics2D g2d = canvas.getGraphics2D();
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();

        for(int i=0; i<8; i++) {
            ArrayList<Integer> list = new ArrayList<>();
            for(int j=0; j<3; j++) {
                int rgb = new Random().nextInt(256);
                list.add(rgb);
            }
            Color x = new Color(list.get(0), list.get(1), list.get(2));
            int height = new Random().nextInt(d.height);
            int width = new Random().nextInt(d.width);
            g2d.setColor(x);
            g2d.fillRect(width, height, width, height);
        }
        t.setVisible(false);
        t.leerCaracter();
    }
}