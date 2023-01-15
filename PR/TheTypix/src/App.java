import juegonavidad.ieshlanz.clases.matrix.*;
import juegonavidad.ieshlanz.clases.juego.*;
import java.awt.event.KeyEvent;
import javax.imageio.ImageIO;
import java.io.*;
import java.awt.*;
import bpc.daw.consola.*;
import bpc.daw.reproductor.*;

public class App {
    public static void main(String[] args) {
        Consola c = new Consola(
                "Typix",
                Toolkit.getDefaultToolkit().getScreenSize().width,
                Toolkit.getDefaultToolkit().getScreenSize().height);

        Teclado t = c.getTeclado();
        CapaTexto ct = c.getCapaTexto();
        CapaCanvas canvas = c.getCapaCanvas();
        CapaSprites sprites = c.getCapaSprites();
        Graphics g = canvas.getGraphics();
        Title the = null;
        Title matrix = null;
        PressAnyButton pab = null;
        String jugador = null;
        int dificultad = 1;
        boolean juego = true;
        boolean gameOver = false;
        ArchivoMP3 musica = new ArchivoMP3("musica/clubbedToDeath.mp3");
        Reproductor rep = new Reproductor(musica, false, false);

        t.setVisible(false);

        while (juego) {
            rep.play();
            gameOver = false;

            // ALGORITMO MATRIX
            Thread hilo = new Thread() {
                public void run() {
                    try {
                        EfectoMatrix.matrix(g);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            };
            hilo.start();

            // TITULOS
            try {
                Thread.sleep(5000);
                Image foto = ImageIO.read(new File("img/title.png"));
                the = new Title(sprites, foto, 0, ct);
                matrix = new Title(sprites, foto, 1, ct);
                while (the.getX() < Toolkit.getDefaultToolkit().getScreenSize().width / 2 - 100
                        || matrix.getX() > Toolkit.getDefaultToolkit().getScreenSize().width / 2 - 300) {
                    the.actuarThe();
                    matrix.actuarMatrix();
                    Thread.sleep(15);
                }
                Image foto2 = ImageIO.read(new File("img/paraContinuar.png"));
                pab = new PressAnyButton(sprites, foto2.getScaledInstance(700, 100, Image.SCALE_FAST));

                boolean seguir = false;
                if (t.leerCaracter() == (KeyEvent.VK_ENTER)) {
                    Thread.sleep(250);
                    c.esperarSiguienteFrame();
                    seguir = true;
                    pab.borrar(sprites);
                    the.borrar(sprites);
                    matrix.borrar(sprites);
                }
                ;

                // MENU PRINCIPAL
                Image foto3 = ImageIO.read(new File("img/mainMenu.png"));
                Image foto4 = ImageIO.read(new File("img/selector.png"));
                MainMenu mm = new MainMenu(sprites, foto3);
                Selector s = new Selector(sprites, foto4);
                while (seguir) {
                    mm.actuar(t, sprites, s);

                    c.esperarSiguienteFrame();

                    if (mm.getState() == false) {
                        mm.borrar(sprites);
                        s.borrar(sprites);
                        seguir = false;
                    }
                }
                Thread.sleep(200);

                if (mm.getOption() == 0) {
                    // Nueva Partida
                    Image foto5 = ImageIO.read(new File("img/introduceNombre.png"));
                    NuevoJuego nj = new NuevoJuego(sprites, foto5);

                    Image foto6 = ImageIO.read(new File("img/letrasGreen.png"));
                    Letras l = new Letras(sprites, foto6);
                    g.setFont(new Font("mono", Font.BOLD, 44));
                    g.setColor(Color.green);

                    while (l.isDone() == false) {
                        c.esperarSiguienteFrame();
                        l.actuar(t, foto6, sprites);
                    }
                    if (l.isDone() == true) {
                        l.borrar(sprites);
                        nj.borrar(sprites);
                        l.borrarTodasLasLetras(sprites);
                    }
                    Guardar.guardar(l.getNombre(), 1);
                    jugador = l.getNombre();
                    dificultad = 1;
                    // hilo.stop();

                } else if (mm.getOption() == 1) {
                    // Cargar Partida
                    hilo.stop();
                    g.setFont(new Font("mono", Font.BOLD, 44));
                    g.setColor(Color.green);
                    g.clearRect(0, 0, (int) Toolkit.getDefaultToolkit().getScreenSize().getWidth(),
                            (int) Toolkit.getDefaultToolkit().getScreenSize().getHeight());
                    Guardar.leer();
                    Selector s3 = new Selector(sprites, foto4);
                    Image foto8 = ImageIO.read(new File("img/loadScreen.png"));
                    MenuCargar mc = new MenuCargar(sprites, foto8);
                    mc.generarPantallaCarga(g, s3, sprites);
                    while (!mc.isDone()) {
                        // si le damos a enter en nueva partida cuando no hay partidas creadas, nos saca
                        // del juego (mirar func
                        // volver())
                        Thread.sleep(130);
                        c.esperarSiguienteFrame();
                        mc.actuar(t, s3, sprites);

                        // Aquí se supone que nos hemos llevado el nombre y la dificultad de la partida
                        // a las variables arriba declaradas.
                    }
                    g.clearRect(0, 0, (int) Toolkit.getDefaultToolkit().getScreenSize().getWidth(),
                            (int) Toolkit.getDefaultToolkit().getScreenSize().getHeight());
                    Thread.sleep(150);

                    // despues de seleccionar la partida, elegimos el nivel que queremos jugar

                    Selector s2 = new Selector(sprites, foto4);
                    ElegirNivel ed = new ElegirNivel(sprites, s2);
                    while (ed.isDone() == false) {
                        // Thread.sleep(130);
                        c.esperarSiguienteFrame();
                        ed.actuar(t, sprites, s2);
                    }
                    if (ed.isDone() == true) {
                        ed.borrar(sprites);
                        s2.borrar(sprites);
                    }

                    jugador = Guardar.nombre.get(MenuCargar.getOption());
                    dificultad = Guardar.dificultad.get(MenuCargar.getOption()).intValue();

                }
                hilo.stop();
                g.setFont(new Font("mono", Font.BOLD, 44));
                g.setColor(Color.green);
                g.clearRect(0, 0, (int) Toolkit.getDefaultToolkit().getScreenSize().getWidth(),
                        (int) Toolkit.getDefaultToolkit().getScreenSize().getHeight());
            } catch (Exception e) {
                e.printStackTrace();
            }

            if (ElegirNivel.getOption() == 1 || dificultad == 1) {
                try {
                    // NIVEL 1
                    Cinematica1.primeraPantalla(g, jugador);
                    Cinematica1.segundaPantalla(g, jugador, sprites);

                    NivelBase nb = new NivelBase();
                    nb.añadirSpritesMapa(sprites, g);
                    nb.contador(g, nb, t);
                    nb.cazaLetras(t, sprites);
                    while (nb.getVidas() > 0 && !nb.isAcabado()) {
                        // System.out.println(Thread.activeCount());
                        nb.actuar(sprites, t, g);
                        c.esperarSiguienteFrame();
                    }
                    if (nb.getVidas() > 0) {
                        FadeIn.efectoFadein(g, ImageIO.read(new File("img/hasGanado.png")), 500, 400, 30);
                        // sube nivel desbloqueado a nivel2 y autosave
                        if (dificultad == 1) {
                            dificultad++;
                            Guardar.guardar(jugador, dificultad);
                        } else {
                            ElegirNivel.option = 2;
                        }
                    } else {
                        FadeIn.efectoFadein(g, ImageIO.read(new File("img/hasPerdido.png")), 500,
                                400, 30);
                        gameOver = true;
                    }
                    Thread.sleep(200);
                    nb.clearScreen(g, sprites);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            // NIVEL2
            if ((ElegirNivel.getOption() == 2 || dificultad == 2) && !gameOver) {
                try {
                    Cinematica2.primeraPantalla(g, jugador, sprites);

                    Nivel2 nb = new Nivel2();
                    nb.añadirSpritesMapa(sprites, g);
                    nb.contador(g, nb, t);
                    nb.cazaLetras(t, sprites);
                    while (nb.getVidas() > 0 && !nb.isAcabado()) {
                        nb.actuar(sprites, t, g);
                        c.esperarSiguienteFrame();
                    }
                    if (nb.getVidas() > 0) {
                        FadeIn.efectoFadein(g, ImageIO.read(new File("img/hasGanado.png")), 500, 400, 30);
                        // sube nivel desbloqueado a nivel3 y autosave
                        if (dificultad == 2) {
                            dificultad++;
                            Guardar.guardar(jugador, dificultad);
                        } else {
                            ElegirNivel.option = 3;
                        }
                    } else {
                        FadeIn.efectoFadein(g, ImageIO.read(new File("img/hasPerdido.png")), 500,
                                400, 30);
                        gameOver = true;
                    }
                    Thread.sleep(200);
                    nb.clearScreen(g, sprites);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            // NIVEL3
            if ((ElegirNivel.getOption() == 3 || dificultad == 3) && !gameOver) {
                try {
                    Cinematica3.primeraPantalla(g, jugador, sprites);

                    Nivel3 nb = new Nivel3();
                    nb.añadirSpritesMapa(sprites, g);
                    nb.contador(g, nb, t);
                    nb.cazaLetras(t, sprites);
                    while (nb.getVidas() > 0 && !nb.isAcabado()) {
                        nb.actuar(sprites, t, g);
                        c.esperarSiguienteFrame();
                    }
                    if (nb.getVidas() > 0) {
                        FadeIn.efectoFadein(g, ImageIO.read(new File("img/hasGanado.png")), 500, 400, 30);
                        // sube nivel desbloqueado a nivel4 y autosave
                        if (dificultad == 3) {
                            dificultad++;
                            Guardar.guardar(jugador, dificultad);
                        } else {
                            ElegirNivel.option = 4;
                        }
                    } else {
                        FadeIn.efectoFadein(g, ImageIO.read(new File("img/hasPerdido.png")), 500,
                                400, 30);
                        gameOver = true;
                    }
                    Thread.sleep(200);
                    nb.clearScreen(g, sprites);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            if ((ElegirNivel.getOption() == 4 || dificultad == 4) && !gameOver) {
                try {
                    // NIVEL4
                    Cinematica4.primeraPantalla(g, jugador, sprites);

                    Nivel4 nb = new Nivel4();
                    nb.añadirSpritesMapa(sprites, g);
                    nb.contador(g, nb, t);
                    nb.cazaLetras(t, sprites);
                    while (nb.getVidas() > 0 && !nb.isAcabado()) {
                        nb.actuar(sprites, t, g);
                        c.esperarSiguienteFrame();
                    }
                    if (nb.getVidas() > 0) {
                        FadeIn.efectoFadein(g, ImageIO.read(new File("img/hasGanado.png")), 500, 400, 30);
                        // sube nivel desbloqueado a nivel5 y autosave
                        if (dificultad == 4) {
                            dificultad++;
                            Guardar.guardar(jugador, dificultad);
                        } else {
                            ElegirNivel.option = 5;
                        }
                    } else {
                        FadeIn.efectoFadein(g, ImageIO.read(new File("img/hasPerdido.png")), 500,
                                400, 30);
                        gameOver = true;
                    }
                    Thread.sleep(200);
                    nb.clearScreen(g, sprites);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            if ((ElegirNivel.getOption() == 5 || dificultad == 5) && !gameOver) {
                try {
                    // NIVEL5
                    Cinematica5.primeraPantalla(g, jugador, sprites);
                    Nivel5 nb = new Nivel5();
                    nb.añadirSpritesMapa(sprites);
                    nb.contador(g, nb, t);
                    nb.cazaLetras(t, sprites);
                    while (nb.getVidas() > 0 && !nb.isAcabado()) {
                        nb.actuar(sprites, t, g);
                        c.esperarSiguienteFrame();
                    }
                    if (nb.getVidas() > 0) {
                        FadeIn.efectoFadein(g, ImageIO.read(new File("img/hasGanado.png")), 500, 400,
                                30);
                        CinematicaFinal.primeraPantalla(g, jugador, sprites);
                    } else {
                        FadeIn.efectoFadein(g, ImageIO.read(new File("img/hasPerdido.png")), 500,
                                400, 30);
                    }
                    Thread.sleep(200);
                    nb.clearScreen(g, sprites);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            try {
                rep.stop();
                FadeIn.efectoFadein(g, ImageIO.read(new File("img/gameOver.png")), 0, 0, 30);
                Thread.sleep(5000);
                g.clearRect(0, 0, 1920, 1080);
                Guardar.nombre.clear();
                Guardar.dificultad.clear();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
