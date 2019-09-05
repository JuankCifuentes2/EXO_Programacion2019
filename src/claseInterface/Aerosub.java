package claseInterface;

public class Aerosub implements Aereo, Acuatico {

    @Override
    public void despegar() {
        System.out.println("Avion despegando");
    }

    @Override
    public void emerger() {
        System.out.println("Submarino Emergiendo");
    }

    @Override
    public void sumergirse() {
        System.out.println("Submarino sumergiendose");
    }

    @Override
    public void acuatizar() {
        System.out.println("Pato acuatizando");
    }

}
