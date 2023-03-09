import java.awt.Color;
import bpc.daw.consola.*;
import java.awt.*;
import javax.imageio.ImageIO;
import java.awt.image.*;
import java.io.*;

public class Ejercicio9_2 {
    public static void main(String[] args) {
//         Añade al ejercicio 5 un pájaro que vaya volando en línea recta desde el lado izquierdo
// de la pantalla hacia el lado derecho. Para ello deberás usar la imagen adjunta
// “pájaro.png” y crear variables para guardar estos tres rectángulos:

// A continuación, deberás crear un sprite con la imagen “pájaro.png” con la forma inicial
// dada por el primer rectángulo y situada en las coordenadas (50,160). Al pasar 100
// milisegundos, el sprite cambiará su forma al rectángulo 2 y se moverá 10 píxeles hacia
// la derecha. Nuevamente, el programa esperará 100 milisegundos y el sprite cambiará
// al tercer rectángulo y se moverá otros 10 píxeles. Esto se repetirá hasta que el sprite
// alcanza el borde derecho de la imagen.
        Consola c = new Consola();

        // Fondo
        CapaFondo cf = c.getCapaFondo();
        Fondo f = new FondoColorSolido(0, 191, 255);
        cf.setFondo(f);
        
        // Teclado
        Teclado t = c.getTeclado();
        t.setVisible(false);
        t.activarEco(true);
        
        // Canvas
        CapaCanvas canvas = c.getCapaCanvas();

        // Suelo        
        Graphics2D g2d = canvas.getGraphics2D();
        g2d.setPaint(Color.green);
        g2d.fillRect(0, 700, 1920, 400);
        // Círculo
        g2d.setPaint(Color.yellow);
        g2d.fillOval(120, 90, 100, 100);

        // DIMENSIONES
        // Sprite 1
        Point p1 = new Point(11, 178);
        Dimension d1 = new Dimension(77, 90);
        Rectangle rectangle1 = new Rectangle(p1, d1);
        // Sprite 2
        Point p2 = new Point(107, 178);
        Dimension d2 = new Dimension(73, 90);
        Rectangle rectangle2 = new Rectangle(p2, d2);
        // Sprite 3
        Point p3 = new Point(202, 178);
        Dimension d3 = new Dimension(72, 90);
        Rectangle rectangle3 = new Rectangle(p3, d3);

        // List<Rectangle> list = new ArrayList<>(Arrays.asList(rectangle1, rectangle2, rectangle3));
        Rectangle[] y = {rectangle1, rectangle2, rectangle3};

        // Pájaro
        CapaSprites sprites = c.getCapaSprites();
        try {
            BufferedImage pajaro = ImageIO.read(new File("img/pajaro.png"));
            
            int x = 50;
            while (x<1440) {
                for(int i=0; i<3; i++) {
                    Sprite sprite = sprites.crearSprite(pajaro, y[i], x+=10, 160);
                    Thread.sleep(100);
                    sprites.eliminarSprite(sprite);
                }

                // Sprite primero = sprites.crearSprite(pajaro, rectangle1, x+=10, 160);
                // Thread.sleep(100);
                // sprites.eliminarSprite(primero);
                // Sprite segundo = sprites.crearSprite(pajaro, rectangle2, x+=10, 160);
                // Thread.sleep(100);
                // sprites.eliminarSprite(segundo);
                // Sprite tercero = sprites.crearSprite(pajaro, rectangle3, x+=10, 160);
                // Thread.sleep(100);
                // sprites.eliminarSprite(tercero);
            }
            
        } catch (IOException | InterruptedException e) {
            System.out.println(e);
        }

        // End
        t.leerCaracter();
    }
}
