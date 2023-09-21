1. Hay que hacerlo sin usar expresiones regulares

record serie
-string titulo
-int año
-int añoFinalizacion

+Serie(String t, int ai, int af)
+static Optional<Serie> parse(String s) // el string tiene este formato: título (añoInicio - añoFin )

El método parse recibe un STring y nos deuvelve un Optional con la correspondiente serie, pero si el formato del String es incorrecto devuelve el Optional empty.


2. Haz una transformación que reciba un List<List<String>> y lo transforma en un List<String> que tiene los String que salen de reunir todas las listas

