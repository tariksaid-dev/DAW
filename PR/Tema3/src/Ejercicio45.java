public class Ejercicio45 {
    public static void main(String[] args) {
        // data
        int[] a = {50, 26, 7, 9, 15, 27};
        // loop for ordering the array
        for(int i=0; i<a.length; i++) {
            for(int j=0; j<a.length-1; j++) {
                if(a[j] > a[j+1]) {
                    int aux = a[j];
                    a[j] = a[j+1];
                    a[j+1] = aux;
                }
            }
        }
        for(int i=0; i<a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
