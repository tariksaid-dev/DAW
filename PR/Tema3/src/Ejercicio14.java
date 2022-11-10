import java.util.*;
public class Ejercicio14 {
    public static void main(String[] args) {
//         Ejercicio 14 : Realiza un programa que pida una por una, las notas de los alumnos
// comprendidas entre 0 y 10 sin decimales. Cuando el usuario introduzca un -1, se mostrará la mayor nota, la menor, y la nota media de todos ellos.
        System.out.println("Introduce las notas de los alumnos comprendidas entre 0 y 10 sin decimales.");
        System.out.println("Introduce un -1 para mostrar la mayor, la menor, y la nota media.");

        List<Integer> list = new ArrayList<>();
        int nota = 0;
        while(nota != -1) {
            nota = new Scanner(System.in).nextInt();
            if (nota>=0 && nota <=10) {
                list.add(nota);
            }
        }

        // Forma 1
        // int max = 0;
        // for (int i=0; i<list.size(); i++) {
        //     if (max < list.get(i)) {
        //         max = list.get(i);
        //     }
        // }

        // Forma 2
        System.out.println("La nota máxima es un " + Collections.max(list));
        System.out.println("La nota mínima es un " + Collections.min(list));
        
        // Suma y media
        int a = 0;
        for(int i=0; i<list.size(); i++) {
            a += list.get(i);
        }
        a = a / list.size();
        System.out.println("La nota media es " + a);

    }
}