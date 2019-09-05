
package tercerEjercicio;

public class Barco extends Vehiculo{

    @Override
    public void mostrar(String color, int numeroSerie) {
        System.out.println("Color del barco: "+color+
                           " numero de serie:"+numeroSerie);
    }
    
}
