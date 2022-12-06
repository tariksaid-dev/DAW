package daw.persona;

public class DNI {
    public int número;
    public char letra;

    public DNI(int n, char l) {
        this.número = n;
        this.letra = l;

    }
    
    public DNI(String dni) {
        this.número = Integer.parseInt(dni.substring(0, 8));
        this.letra = dni.charAt(8);
        } 
}
