package exo_programacion2019;

public class Profesor extends Persona {//CLASE HIJA

    private String curso;

    public Profesor() {
    }

    public Profesor(String curso, String nombre, String apellido) {
        super(nombre, apellido);
        this.curso = curso;

    }

    @Override
    public String toString() {
        return "Profesor{" + "curso=" + curso +" "+super.toString();
    }

 

}
