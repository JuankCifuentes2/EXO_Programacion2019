
package ensamblar_auto;


public class Auto {
    
    private final String marca;
    private final Carroceria carroceria;
    private final Motor motor;

    public Auto(String marca, Carroceria carroceria, Motor motor) {
        this.marca = marca;
        this.carroceria = carroceria;
        this.motor = motor;
    }

  
public void imprimir(){
        System.out.println(marca+"\t"+carroceria.getTipo()+"\t"+motor.getRevoluciones() );
        
    }
    
    
}
