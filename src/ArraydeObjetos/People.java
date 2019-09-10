package ArraydeObjetos;

import java.util.Scanner;

public class People {

    private String nombre;
    private String apellido;
    private int clave;

    public People() {

    }

    public People(String nombre, String apellido, int clave) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public void ingresar(People gente[]) {

        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < gente.length; i++) {
            System.out.println("Ingrese nombre: [" + (i + 1) + "]");
            String nombre = teclado.next();
            System.out.println("Ingrese apellido: [" + (i + 1) + "]");
            String apellido = teclado.next();
            System.out.println("Ingrese clave: [" + (i + 1) + "]");
            int clave = teclado.nextInt();

            gente[i] = new People(nombre, apellido, clave);
            System.out.println("***********************");
        }

    }

    public void mostrar(People gente[]) {

        for (int i = 0; i < gente.length; i++) {
            People persona2 = gente[i];
            System.out.println("nombre: " + gente[i].getNombre()
                    + " apellido: " + gente[i].getApellido()
                    + " clave: " + gente[i].getClave());
        }

    }

}
