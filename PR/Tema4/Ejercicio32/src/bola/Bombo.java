package bola;

import java.util.*;

public class Bombo {
    private Queue<Bola> bolas;

    public Bombo(int totalBolas) {
        bolas = new LinkedList<Bola>();
        for (int i = 1; i <= totalBolas; i++) {
            bolas.add(new Bola(i));
        }
    }

    public int getNumeroBolas() {
        return bolas.size();
    }

    public Bola sacarBola() {
        return bolas.poll();
    }
}
