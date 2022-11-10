
public class Ejercicio24 {
    public static void main(String[] args) {
//     Ejercicio 24: Realiza un programa que use 4 listas (array) para guardar las notas de los
// alumnos. A continuación, el programa mostrará el nombre de cada alumno y su nota media
        int[] pepe = {9, 5, 4, 3};
        int[] ana = {4, 8, 6, 5};
        int[] juan = {2, 5, 10, 2};
        int[] roberta = {10, 10, 10, 9};
        
        double mp = 0;
        double ma = 0;
        double mj = 0;
        double mr = 0;

        for(int i=0; i<pepe.length; i++) {
            mp+= pepe[i];
            ma+= ana[i];
            mj+= juan[i];
            mr+= roberta[i];
        }

        System.out.println("La nota media de Pepe es " + mp/pepe.length 
        + "\nLa nota media de Ana es " + ma/ana.length 
        + "\nLa nota media de Juan es " + mj/juan.length 
        + "\nLa nota media de Roberta es " + mr/roberta.length);
    }
}
