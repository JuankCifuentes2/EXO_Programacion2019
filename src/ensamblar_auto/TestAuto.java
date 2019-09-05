/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ensamblar_auto;

/**
 *
 * @author Español
 */
public class TestAuto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Motor mot1 = new Motor (1);
        Motor mot2 = new Motor (2);
        Carroceria carroceria1 = new Carroceria ("grande");
        Carroceria carroceria2 = new Carroceria ("pequeña");
        
        Auto auto1 = new Auto ("fiat",carroceria1,mot1);
        
        auto1.imprimir();
        
        // TODO code application logic here
    }
    
}
