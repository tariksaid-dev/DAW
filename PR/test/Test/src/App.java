import java.io.BufferedReader;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.*;
import bpc.daw.consola.*;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import javax.imageio.ImageIO;
import java.util.*;
import java.util.List;
import java.io.*;
import java.awt.*;

public class App {
    private Image imagen;
    private List<Sprite> letras;

    public static void main(String[] args) throws Exception {
        Consola c = new Consola();
        CapaSprites sprites = c.getCapaSprites();
        Teclado t = c.getTeclado();
    }
}
