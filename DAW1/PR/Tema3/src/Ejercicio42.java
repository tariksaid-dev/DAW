import java.util.*;
public class Ejercicio42 {
    public static void main(String[] args) {
        // Days, hours, and subjects
        String[] days = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes"};
        String [] hours = {"8:15-9:15", "9:15-10:15", "10:15-11:15", "11:15-11:45", "11:45-12:45", "12:45-13:45", "13:45-14:45"};
        String[][] subDays = {
            {"BD", "BD", "PR", "free", "PR", "SI", "SI"},
            {"SI", "SI", "FOL", "free", "ED", "PR", "PR"},
            {"FOL", "FOL", "PR", "free", "PR", "BD", "BD"},
            {"ED", "ED", "PR", "free", "PR", "LM", "LM"},
            {"BD", "BD", "LM", "free", "LM", "SI", "SI"}
        };

        // Input
        System.out.println("Escribe un día lectivo (Lunes a Viernes):");
        String inputDay = new Scanner(System.in).nextLine();

        // loop
        for(int i=0; i<days.length; i++) {
            if(days[i].equalsIgnoreCase(inputDay)) {
                for(int j=0; j<hours.length; j++) {
                    System.out.println(hours[j] + " " + subDays[i][j]);
                }
            }
        }
    }
}
