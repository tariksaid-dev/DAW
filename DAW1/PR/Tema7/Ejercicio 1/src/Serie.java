import java.util.*;

public record Serie(String titulo, int año, int añoFinalizacion) {

    // S debe ser añoInicio - añoFin
    public static Optional<Serie> parse(String s) {
        List<String> palabras = List.of(s.split(" "));
        boolean palabra1 = palabras.get(0).chars().allMatch(Character::isLetter);
        boolean palabra2 = palabras.get(1).startsWith("(");
        boolean palabra2_1 = !palabras.get(1).substring(1).chars().allMatch(Character::isLetter);
        boolean palabra3 = palabras.get(2).equals("-");
        boolean palabra4 = palabras.get(3).endsWith(")");
        boolean palabra4_1 = !palabras.get(3).substring(0, palabras.get(3).length() - 2).chars()
                .allMatch(Character::isLetter);
        List<Boolean> bool = List.of(palabra1, palabra2, palabra2_1, palabra3, palabra4, palabra4_1);

        int contador = 0;
        for (boolean i : bool) {
            if (i == false) {
                contador++;
            }
        }

        // bool.forEach(System.out::println);
        // palabras.forEach(System.out::println);
        return contador > 0 ? Optional.empty()
                : Optional.of(new Serie(palabras.get(0), Integer.parseInt(palabras.get(1).substring(1)),
                        Integer.parseInt(palabras.get(3).substring(0, palabras.get(3).length() - 2))));
    }

    public static void main(String... args) {
        Serie.parse("aaa (aaa - aaa)");
    }
}