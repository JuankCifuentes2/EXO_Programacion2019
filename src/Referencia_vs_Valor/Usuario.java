
package Referencia_vs_Valor;

public class Usuario {
    
    private final String nombre;
    private final int edad;

    public Usuario(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", edad=" + edad + '}';
    }
    
    
}
