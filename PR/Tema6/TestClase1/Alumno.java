package TestClase1;

public class Alumno {
    private String nombre;
    private String apellidos;
    private String curso;
    private int edad;
    
    public Alumno(String nombre, String apellidos, String curso, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.curso = curso;
        this.edad = edad;
    }
    
    @Override
    public String toString() {
        return apellidos+", "+nombre;
    }
    
    public String getNombre() {
        return this.nombre;
    }
    
    public String getApellidos() {
        return this.apellidos;
    }
    
    public String getCurso() {
        return this.curso;
    }
    
    public int getEdad() {
        return this.edad;
    }
}
