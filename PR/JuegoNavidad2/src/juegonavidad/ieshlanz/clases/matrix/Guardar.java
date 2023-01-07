package juegonavidad.ieshlanz.clases.matrix;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.*;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

@SuppressWarnings("unchecked")
public class Guardar {

    public static List<String> nombre = new ArrayList<>();
    public static List<Double> dificultad = new ArrayList<>();

    public static void guardar(String nombre, int dificultad) throws Exception {
        String contenido = "";
        BufferedReader br = new BufferedReader(new FileReader("partidasGuardadas/saved.json"));
        String linea;
        while ((linea = br.readLine()) != null) {
            contenido += linea;
        }

        // Crear un mapa a partir del contenido del archivo
        Gson gson = new Gson();
        Map<String, Object> map = gson.fromJson(contenido, LinkedHashMap.class);

        // Añadir un nuevo elemento al mapa
        map.put(nombre, dificultad);

        // Crear una cadena de texto a partir del mapa actualizado
        String json = gson.toJson(map);

        // Sobrescribir el archivo JSON con la cadena de texto actualizada
        FileWriter file = new FileWriter("partidasGuardadas/saved.json");
        file.write(json);
        file.flush();
        file.close();
        br.close();
    }

    public static void leer() throws Exception {
        String contenido = "";
        BufferedReader br = new BufferedReader(new FileReader("partidasGuardadas/saved.json"));
        String linea;
        while ((linea = br.readLine()) != null) {
            contenido += linea;
        }

        Gson gson = new GsonBuilder().create();
        Map<String, Object> map = gson.fromJson(contenido, LinkedHashMap.class);

        for (Map.Entry<String, Object> entry : map.entrySet()) {
            nombre.add(entry.getKey());
            dificultad.add((double) entry.getValue());
        }
        br.close();
    }
}
