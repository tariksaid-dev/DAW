import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;
import java.lang.NumberFormatException;

public class Ejercicio43 {
    public static void main(String[] args) {
//         Ejercicio 43 : Consulta el pdf de la “Librería Estándar de Java” y busca las clases Math y
// NumberFormat. Haz un programa que calcule el valor del número pi usando la siguiente
// fórmula: ������ = 4 ∗ ������������������ ������������(1) y muestre el valor usando 4 cifras decimales.
        try {

            double pi = 4 * Math.atan(1); 

            // Método 1 (ONELINER)
            // double x = Double.parseDouble(new DecimalFormat("#.####").getInstance(Locale.ENGLISH).format(pi)); Output: 3.142?
            double z = Double.parseDouble(new DecimalFormat("#.####", new DecimalFormatSymbols(Locale.ENGLISH)).format(pi)); 
            //Si no usamos el locale.english, nos da error al usar las puntos como separador de los decimales

            // Método 2 (No podemos usar setMaximum por type mismatch (void to numberFormat))
            NumberFormat nf = NumberFormat.getInstance(Locale.ENGLISH);
            nf.setMaximumFractionDigits(4);
            double w = Double.parseDouble(nf.format(pi));

            System.out.println(z);
            System.out.println(w);

        } catch (NumberFormatException e) {
            System.out.println(e);
        }
    }
}
