package com.ieshlanz.titulos.programa;

import com.ieshlanz.titulos.clases.*;
import java.util.*;

import com.ieshlanz.titulos.clases.CatalagoTitulosArchivos;

public class Programa {
    public static void main(String[] args) throws Exception {
        CatalagoTitulosArchivos cta = new CatalagoTitulosArchivos("titulos.txt");

        System.out.println("1. Añadir título");
        System.out.println("2. Consultar todos los títulos");
        System.out.println("3. Cambiar estado del título");
        System.out.println("4. Salir");

        int opcion = new Scanner(System.in).nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Introduce el DNI del alumno");
                String dni = new Scanner(System.in).nextLine();
                System.out.println("Introduce el nombre del alumno");
                String nombre = new Scanner(System.in).nextLine();
                System.out.println("Introduce el nombre del estudio");
                String estudio = new Scanner(System.in).nextLine();
                System.out.println("Introduce el estado del título");
                Estado estado = Estado.valueOf(new Scanner(System.in).nextLine());
                cta.añadirTitulo(dni, nombre, estudio, estado);
                break;
            case 2:
                for (Titulo t : cta.getTitulos()) {
                    System.out.println(t);
                }
                break;
            case 3:
                System.out.println("Introduce el DNI del alumno");
                dni = new Scanner(System.in).nextLine();
                System.out.println("Introduce el nuevo estado del título");
                estado = Estado.valueOf(new Scanner(System.in).nextLine());
                Titulo t = cta.getTitulo(dni);
                t.setEstado(estado);
                cta.guardar();
                break;
            case 4:
                cta.guardar();
                System.out.println("Hasta luego");
                break;
            default:
                System.out.println("Opción incorrecta");
                break;
        }
    }
}
