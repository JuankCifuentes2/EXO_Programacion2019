/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyectores;

/**
 *
 * @author Español
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PaqueteProyectores paqu1 = new PaqueteProyectores(545454, "Juan", "Pasto", 58);
        PaqueteProyectores paqu2 = new PaqueteProyectores(3213123, "Jorge", "New york",5554);
        
        paqu1.setEnTransito(true);
        
        
        GestorDePaquetesDeProyectores gest1 = new GestorDePaquetesDeProyectores("LEMA");
        
        
        gest1.adddPaquete(paqu2);
        gest1.adddPaquete(paqu1);
    
        
        gest1.imprimirGestor();
        
        
    }
    
  }
