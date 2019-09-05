package tercerEjercicio;

public class NewMain {

    public static void main(String[] args) {
        // TODO code application logic here
        Vehiculo bar = new Barco();
        bar.mostrar("azul", 12123);

        Vehiculo bar1 = new Barco();
        bar1.mostrar("verde", 45566);
        
        Vehiculo coc = new Coche();
        coc.mostrar("gris", 7899);
        
        Vehiculo co = new Coche();
        co.mostrar("marron", 5563);
    }

}
