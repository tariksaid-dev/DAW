import java.util.*;

public record Empleado(String nombre, List<Empleado> subordinados) {
    public Empleado(String nombre) {
        this(nombre, new ArrayList<>());
    }

    public void mostrarSubordinados() {
        System.out.println(nombre);
        mostrarSubordinados(1);
    }

    private void mostrarSubordinados(int tabs) {
        for (Empleado e : subordinados) {
            for (int i = 0; i < tabs; i++) {
                System.out.print("-");
            }
            System.out.println(e.nombre);
            e.mostrarSubordinados(tabs + 1);
        }
    }

    public static void main(String[] args) {
        Empleado patricia = new Empleado("Patricia");
        Empleado ricardo = new Empleado("Ricardo");
        Empleado diego = new Empleado("Diego");
        Empleado juan = new Empleado("Juan", List.of(diego));
        Empleado alberto = new Empleado("Alberto", List.of(patricia));
        Empleado manuel = new Empleado("Manuel");
        Empleado valentin = new Empleado("Valentin");
        Empleado gema = new Empleado("Gema");
        Empleado mariajose = new Empleado("Maria Jose", List.of(valentin, gema));
        Empleado rafa = new Empleado("Rafa", List.of(manuel, mariajose));
        Empleado paco = new Empleado("Paco", List.of(rafa, ricardo));
        Empleado antonio = new Empleado("Antonio", List.of(juan, alberto, paco));
        antonio.mostrarSubordinados();
    }
}
