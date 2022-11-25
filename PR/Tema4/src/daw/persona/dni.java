package daw.persona;

public class dni {
    public int número;
    public char letra;
    
    public dni(int n, char l) {
        this.número = n;
        this.letra = l;
    }

    public dni(String dni) {
        this.número = Integer.parseInt(dni.substring(0, 8));
        this.letra = dni.charAt(8);
    }
}
