package Concesionaria_Comp_Agreg;

import java.util.ArrayList;

public class Concesionaria {

    private final String compania;
    private final Gerente gerente;
    private final ArrayList<Vendedor> vendedores = new ArrayList<>();
    private final ArrayList<Carro> cars = new ArrayList<>();

    public Concesionaria(String compania, Gerente gerente) {
        this.compania = compania;
        this.gerente = gerente;
    }

    public void addCar(Carro car) {
        cars.add(car);
    }
    
    public void addPerson(Vendedor vendedor){
        vendedores.add(vendedor);
    }
    
    public void imprimir(){
        System.out.println(compania+"\t"+gerente.getNombre());
        for (Vendedor persona : vendedores) {
            System.out.println(persona.getNombre());
        }
        
        for (Carro auto : cars) {
            System.out.println(auto.getFabricante());
        }
    }
}
