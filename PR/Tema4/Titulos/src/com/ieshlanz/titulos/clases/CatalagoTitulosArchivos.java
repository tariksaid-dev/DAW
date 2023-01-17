package com.ieshlanz.titulos.clases;

import java.io.*;
import java.util.*;

public class CatalagoTitulosArchivos implements CatalogoTitulos {
    private String ruta;
    private List<Titulo> titulos;

    public CatalagoTitulosArchivos(String ruta) throws IOException {
        this.ruta = ruta;
        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
            titulos = new ArrayList<Titulo>();
            String linea;
            while ((linea = br.readLine()) != null) {
                Titulo titulo = extraerTitulo(linea);
                titulos.add(titulo);
            }
        }
    }

    private Titulo extraerTitulo(String linea) {
        String[] campos = linea.split(";");
        return new TituloArchivo(campos[0], campos[1], campos[2], Estado.values()[Integer.parseInt(campos[3])]);

    }

    @Override
    public List<Titulo> getTitulos() {
        return new ArrayList<Titulo>(titulos);
    }

    @Override
    public boolean guardar() {
        try (PrintWriter pw = new PrintWriter(ruta)) {
            for (Titulo t : titulos) {
                pw.println(t);
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
}
