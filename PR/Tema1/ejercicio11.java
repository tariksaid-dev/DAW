import java.util.*;

public class ejercicio11{
    public static void main(String[] args) {
//         Ejercicio 11 : Haz un programa que pregunte al usuario su nombre, su primer apellido y su segundo
// apellido (cada uno será una pregunta independiente). El ordenador mostrará el nombre y apellidos
// del usuario en formato apellido1 apellido2, nombre
    System.out.println("Introduce tu nombre:");
    String name = new Scanner(System.in).nextLine();
    System.out.println("Introduce tu primer apellido:");
    String lName1 = new Scanner(System.in).nextLine();
    System.out.println("Introduce tu segundo apellido:");
    String lName2 = new Scanner(System.in).nextLine();
    System.out.println(name + " " + lName1 + " " + lName2);
    }
}