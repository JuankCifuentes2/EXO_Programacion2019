
package tercerEjercicio;

public class Coche extends Vehiculo{

    @Override
    public void mostrar(String color, int numeroSerie) {
        System.out.println("Color del coche: "+color+
                           " numero de serie:"+numeroSerie);
    }
    
}
