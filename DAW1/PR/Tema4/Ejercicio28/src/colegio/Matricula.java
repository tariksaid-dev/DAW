package colegio;

public class Matricula {
    private static int siguienteNumeroMatricula = 1;
    private int numeroMatricula;
    private String nombreAlumno;
    private String nombreAsignatura;

    public Matricula(String nombreAlumno, String nombreAsignatura) {
        this.nombreAlumno = nombreAlumno;
        this.nombreAsignatura = nombreAsignatura;
        this.numeroMatricula = siguienteNumeroMatricula;
        siguienteNumeroMatricula++;
    }

    public String getNombreAlumno() {
        return nombreAlumno;
    }

    public String getNombreAsignatura() {
        return nombreAsignatura;
    }

    public int getNumeroMatricula() {
        return numeroMatricula;
    }
}