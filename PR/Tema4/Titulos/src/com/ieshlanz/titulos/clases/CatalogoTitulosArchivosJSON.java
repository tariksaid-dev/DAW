package com.ieshlanz.titulos.clases;

import java.util.*;
import java.io.*;
import com.google.gson.Gson;

public class CatalogoTitulosArchivosJSON implements CatalogoTitulos {
    private String ruta;
    private List<Titulo> titulos;

    public CatalogoTitulosArchivosJSON(String ruta) throws IOException {
        this.ruta = ruta;
        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
            titulos = new ArrayList<>();
            String linea;
            while ((linea = br.readLine()) != null) {
                Titulo titulo = extraerTitulo(linea);
                titulos.add(titulo);
            }
        }
    }

    private Titulo extraerTitulo(String linea) {
        Gson gson = new Gson();
        return gson.fromJson(linea, TituloArchivo.class);
    }

    @Override
    public List<Titulo> getTitulos() {
        return new ArrayList<>(titulos);
    }

    @Override
    public boolean guardar() {
        Gson gson = new Gson();
        try (PrintWriter pw = new PrintWriter(ruta)) {
            for (Titulo t : titulos) {
                pw.println(gson.toJson(t));
            }
            return true;
        } catch (IOException e) {
            return false;
        }
    }

    @Override
    public boolean añadirTitulo(String dni, String nombre, String estudio, Estado estado) {
        Titulo t = new TituloArchivo(dni, nombre, estudio, estado);
        titulos.add(t);
        return guardar();
    }

    public String toJSON() {
        Gson gson = new Gson();
        return gson.toJson(titulos);
    }
}
