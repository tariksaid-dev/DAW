import javax.imageio.ImageIO;
import bpc.daw.consola.*;
import java.awt.Graphics2D;
import java.awt.image.*;
import java.io.*;
import java.util.*;

public class Ejercicio50_test {

    public static boolean bufferedImagesEqual(BufferedImage img1, BufferedImage img2, BufferedImage img3) {
        if (img1.getWidth() == img2.getWidth() && img2.getWidth() == img3.getWidth() && img1.getHeight() == img2.getHeight() && img2.getHeight() == img3.getHeight()) {
            for (int x = 0; x < img1.getWidth(); x++) {
                for (int y = 0; y < img1.getHeight(); y++) {
                    if (img1.getRGB(x, y) != img2.getRGB(x, y) && img2.getRGB(x, y) != img3.getRGB(x, y) && img1.getRGB(x,y) != img3.getRGB(x, y)) {
                        System.out.println("tienen colores distintos");
                        return false;
                    }
                }
            }
        } else {
            System.out.println("no son de igual altura o anchura");
            return false;
        }
        System.out.println("Son iguales");
        return true;
    }

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
            List<BufferedImage> symbolsChosen = new ArrayList<>();


            while(gameOn) {
                for(int i=0; i<coordX.size(); i++) { 
                    int chosen = new Random().nextInt(symbols.size());
                    g2d.drawImage(symbols.get(chosen), coordX.get(i), 300, 300, 300, null);

                    if(t.teclaPulsada(49) && coordX.contains(300)) {
                        Thread.sleep(150);
                        symbolsChosen.add(symbols.get(chosen));
                        coordX.remove(coordX.indexOf(300));
                    } else if (t.teclaPulsada(50) && coordX.contains(600)) {
                        Thread.sleep(150);
                        symbolsChosen.add(symbols.get(chosen));
                        coordX.remove(coordX.indexOf(600));
                    } else if (t.teclaPulsada(51) && coordX.contains(900)) {
                        Thread.sleep(150);
                        symbolsChosen.add(symbols.get(chosen));
                        coordX.remove(coordX.indexOf(900));
                    }
                }
                if(symbolsChosen.size() == 3) {
                    gameOn = false;
                }
            }

            String premio = "";
            for(BufferedImage i : symbolsChosen) {
                System.out.println(i);
            }

            if(bufferedImagesEqual(symbolsChosen.get(0), symbolsChosen.get(1), symbolsChosen.get(2))) {
                if(symbolsChosen.contains(cerezas)) {
                    premio = "10€";
                } else if (symbolsChosen.contains(campana)) {
                    premio = "20€";
                } else if (symbolsChosen.contains(bar)) {
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