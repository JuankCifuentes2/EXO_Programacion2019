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
        Carroceria carroceria1 = new Carroceria ("Camion");
        Carroceria carroceria2 = new Carroceria ("Colectivo");
        
        Rueda r1 = new Rueda("Acero","GoodYear","R18");
        Rueda r2 = new Rueda("Acero","GoodYear","R14");
        Rueda r3 = new Rueda("Acero","Firestone","R18");
        Rueda r4 = new Rueda("Acero","Firestone","R14");
        
        
        Rueda ruedas[] = new Rueda[4];
        
        ruedas[0] = r1;
        ruedas[1] = r2;
        ruedas[2] = r3;
        ruedas[3] = r4;
        
        Auto auto1 = new Auto ("fiat",carroceria1,mot1);
        Auto auto2 = new Auto ("peugeot",carroceria2,mot2);
        
        
       auto1.addRueda(r1);
       auto1.addRueda(r1);
       auto1.addRueda(r2);
        
        auto1.imprimir();
        
        auto2.addRueda(r3);
        
        auto2.imprimir();
        
        // TODO code application logic here
    }
    
}
