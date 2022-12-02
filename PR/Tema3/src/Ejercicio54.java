import java.util.*;
import java.time.*;

public class Ejercicio54 {
    public static void main(String[] args) {
        // a) genere una lista rellenada con 1000 números aleatorios, la ordene usando el
        // algoritmo de selección (ver ejercicio 43) y registre el tiempo empleado para ello.

        // Object[][] data = new Object[6][2];
        // data[0] = new Object[] {"January", 1};
        
        // String[] columns = new String[] 

        int size = 1000;
        int[] list = new int[size];
        for(int i=0; i<list.length; i++){
            list[i]= new Random().nextInt();
        }
        Instant i1 = Instant.now();
        for (int i = 0; i < list.length; i++) {
            int temp = 0;
            int min = i;
            for (int j = i + 1; j < list.length; j++) {
                if (list[j] < list[min]) {
                    min = j; 
                }
            }
            temp = list[i];
            list[i] = list[min];
            list[min] = temp;
        }
        Instant i2 = Instant.now();
        Duration d1 = Duration.between(i1, i2);
        System.out.println(d1.toMillis() + " milisegundos en ordenar la lista 1 vez");
        System.out.println(d1.toSeconds() + " segundos en ordenar la lista 1 vez"); 

        // b) A continuación, mete el apartado a) en un bucle que se repita 100 veces y calcula el
        // tiempo medio de todas esas repeticiones.
        list = new int[size];
        for(int i=0; i<list.length; i++){
            list[i]= new Random().nextInt();
        }
        Instant i3 = Instant.now();
        for(int i=0; i<1000; i++) {
            for (int j = 0; j < list.length; j++) {
                int temp = 0;
                int min = j;
                for (int k = j + 1; k < list.length; k++) {
                    if (list[k] < list[min]) {
                        min = k; 
                    }
                }
                temp = list[j];
                list[j] = list[min];
                list[min] = temp;
            }
        }
        Instant i4 = Instant.now();
        Duration d2 = Duration.between(i3, i4);
        
        System.out.println(d2.toMillis() + " milisegundos en ordenar la lista 1000 veces, tardando una media de " + (d2.toMillis()/1000.0) + " por vuelta");
        System.out.println(d2.toSeconds() + " segundos en ordenar la lista 1000 veces, tardando una media de " + (d2.toSeconds()/1000.0) + " por vuelta");  

        // d) Lanza nuevamente el programa usando tamaños cada vez más grandes: 2000, 3000,
        // 4000 y 5000 números (también puedes meter todo en un bucle que automáticamente
        // itere sobre una lista con esos tamaños)
        
        for(int i=0; i<5; i++) {
            list = new int[size];
            for(int j=0; j<list.length; j++){
                list[j]= new Random().nextInt();
            }
            Instant i5 = Instant.now();
            for(int k=0; k<1000; k++) {
                for (int l = 0; l < list.length; l++) {
                    int temp = 0;
                    int min = l;
                    for (int j = l + 1; j < list.length; j++) {
                        if (list[j] < list[min]) {
                            min = j; 
                        }
                    }
                    temp = list[l];
                    list[l] = list[min];
                    list[min] = temp;
                }
            }
            Instant i6 = Instant.now();
            Duration d3 = Duration.between(i5, i6);
        
            System.out.println(d3.toMillis() + " milisegundos en ordenar 1000 veces la lista de " + size + 
            " elementos, tardando una media de " + (d3.toMillis()/1000.0) + " por vuelta");
            System.out.println(d3.toSeconds() + " segundos en ordenar 1000 veces la lista de " + size + 
            " elementos, tardando una media de " + (d3.toSeconds()/1000.0) + " por vuelta");  
            size += 1000;
        }  
        System.out.println("---------------------------------------");

        // g) Repite el ejercicio usando el método Collections.sort, que ordena la lista usando un
        // algoritmo denominado Quicksort (ordenación rápida) y obtén la correspondiente
        // gráfica. ¿Cuál de los dos métodos de ordenación que han aparecido en el ejercicio es
        // más eficiente?
        size = 1000;
        for(int i=0;i<5;i++) {
            list = new int[size];
            for(int j=0; j<list.length; j++){
                list[j]= new Random().nextInt();
            }
            Instant i7 = Instant.now();
            for(int k=0; k<1000; k++) {
                Arrays.sort(list);
            }
            Instant i8 = Instant.now();
            Duration d4 = Duration.between(i7, i8);
            System.out.println(d4.toMillis() + " milisegundos en ordenar 1000 veces la lista de " + size + 
            " elementos, tardando una media de " + (d4.toMillis()/1000.0) + " por vuelta");
            System.out.println(d4.toSeconds() + " segundos en ordenar 1000 veces la lista de " + size + 
            " elementos, tardando una media de " + (d4.toSeconds()/1000.0) + " por vuelta");  
            size += 1000;
        }
    }
}
