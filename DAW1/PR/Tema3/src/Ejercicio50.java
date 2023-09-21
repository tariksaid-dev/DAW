import javax.imageio.ImageIO;
import bpc.daw.consola.*;
import java.awt.Graphics2D;
import java.awt.image.*;
import java.io.*;
import java.util.*;

public class Ejercicio50 {
    public static void main(String[] args) {
        Consola c = new Consola();
        CapaCanvas canvas = c.getCapaCanvas();
        Teclado t = c.getTeclado();
        Graphics2D g2d = canvas.getGraphics2D();
        CapaTexto ct = c.getCapaTexto();
           
        t.setVisible(false);
        boolean gameOn = true;
        // Lista coord x 
        List<Integer> coordX = new ArrayList<>(List.of(300, 600, 900));

        try {
            // Generamos las imágenes
            BufferedImage campana = ImageIO.read(new File("img/campana.jpg"));
            BufferedImage herradura = ImageIO.read(new File("img/herradura.jpg"));
            BufferedImage cerezas = ImageIO.read(new File("img/cerezas.jpg"));
            BufferedImage bar = ImageIO.read(new File("img/bar.jpg"));

            //Las agregamos a una lista
            List<BufferedImage> symbols = new ArrayList<>(Arrays.asList(campana, herradura, cerezas, bar));
            List<Integer> num = new ArrayList<>();

            while(gameOn) {
                for(int i=0; i<coordX.size(); i++) { 
                    int chosen = new Random().nextInt(symbols.size());
                    g2d.drawImage(symbols.get(chosen), coordX.get(i), 300, 300, 300, null);

                    if(t.teclaPulsada(49) && coordX.contains(300)) {
                        Thread.sleep(150);
                        num.add(symbols.indexOf(symbols.get(chosen)));
                        coordX.remove(coordX.indexOf(300));
                    } else if (t.teclaPulsada(50) && coordX.contains(600)) {
                        Thread.sleep(150);
                        num.add(symbols.indexOf(symbols.get(chosen)));
                        coordX.remove(coordX.indexOf(600));
                    } else if (t.teclaPulsada(51) && coordX.contains(900)) {
                        Thread.sleep(150);
                        num.add(symbols.indexOf(symbols.get(chosen)));
                        coordX.remove(coordX.indexOf(900));
                    }
                }
                if(num.size() == 3) {
                    gameOn = false;
                }
            }

            String premio = "";

            boolean eq = true;
            for(int i=1; i<num.size(); i++)  {
                if(num.get(i-1) != num.get(i)) {
                    eq=false;
                }
            }

            if(eq) {
                if(num.contains(2)) {
                    premio = "10€";
                } else if (num.contains(0)) {
                    premio = "20€";
                } else if (num.contains(3)) {
                    premio = "30€";
                } else {
                    premio = "100€";
                }
            } else {
                premio = "0€";
            }

            ct.print(30, 15, "Turno terminado! Tu premio es: " + premio);
            t.leerCaracter();


        } catch (IOException | InterruptedException  e) {
            System.out.println(e);
        }           
    }
}