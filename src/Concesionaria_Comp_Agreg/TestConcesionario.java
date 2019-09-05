
package Concesionaria_Comp_Agreg;

public class TestConcesionario {

    public static void main(String[] args) {
        // TODO code application logic here
        Gerente ryne = new Gerente("Ryne Mendez");
        Vendedor nicole = new Vendedor("nicole newman");
        Vendedor vince = new Vendedor("vince sola");
        
        //****AGREGACION****
        Concesionaria concesionaria = new Concesionaria("PEUGEOT.SA", ryne);
        concesionaria.addPerson(vince);
        concesionaria.addPerson(nicole);
        //****COMPOSICION***
        concesionaria.addCar(new Carro("Toyota"));
        concesionaria.addCar(new Carro("GMC"));
        concesionaria.addCar(new Carro("DODGE"));
        concesionaria.imprimir();
    }
    
}
