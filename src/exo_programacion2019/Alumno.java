package exo_programacion2019;

public class Alumno extends Persona{//SUBCLASE O CLASE HIJA

    private final String legajo;

    public Alumno(String nombre, String apellido, String legajo) {
        super(nombre, apellido);
        this.legajo = legajo;
    }

    @Override
    public String toString() {
        return "Alumno{" + "legajo=" + legajo +" "+super.toString();
    }
    
    

}
