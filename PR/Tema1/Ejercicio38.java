public class Ejercicio38 {
    public static void main(String[] args) {
//         Ejercicio 38 : Realiza un programa que cree una lista de 5 palabras. El programa deberá mostrar por
// pantalla el número de palabras de la lista, la primera y la última de ellas. El programa deberá estar
// hecho con fácil mantenimiento (esto es que si ampliamos o disminuimos el número de palabras de la
// lista no debemos tocar nada más en las restantes líneas del programa).
        String[] palabras = {"uno", "dos", "tres", "cuatro", "cinco"};
        System.out.println(palabras.length);
        System.out.println(palabras[0]);
        System.out.println(palabras[palabras.length -1]);
    } 
}
