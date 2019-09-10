package ArraydeObjetos;

public class Persona {

    private final String nombre;
    private final String apellido;
    private final int clave;

    public Persona(String nombre, String apellido, int clave) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getClave() {
        return clave;
    }

}
