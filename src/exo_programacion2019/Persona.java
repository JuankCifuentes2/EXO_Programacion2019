package exo_programacion2019;

public class Persona {//CLASE PADRE O SUPERCLASE

    private String nombre;
    private String apellido;

    public Persona() {
    }

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return   "nombre=" + nombre + ", apellido=" + apellido +" ";
    }
    
    
}
