
package ensamblar_auto;

import Concesionaria_Comp_Agreg.Carro;
import Concesionaria_Comp_Agreg.Vendedor;
import java.util.ArrayList;


public class Auto {
    
    private final String marca;
    private final Carroceria carroceria;
    private final Motor motor;
    private final ArrayList<Rueda> rueda = new ArrayList<>();

    public Auto(String marca, Carroceria carroceria, Motor motor) {
        this.marca = marca;
        this.carroceria = carroceria;
        this.motor = motor;
    }

  
    public void addRueda(Rueda rued) {
        rueda.add(rued);
    }
    
    
    
  
public void imprimir(){
        System.out.println(marca+"\t"+carroceria.getTipo()+"\t"+motor.getRevoluciones());
        
                for (Rueda rueda : rueda) {
            System.out.println(rueda.getFabricante()+"\t"+rueda.getMaterial()+"\t"+rueda.getDimension());
        }
        
    }
    
    
}
