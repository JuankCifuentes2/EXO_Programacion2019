/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyectores;

import java.util.ArrayList;

/**
 *
 * @author Español
 */
public class GestorDePaquetesDeProyectores {
    
    private String nombreEmpresa;
    private final ArrayList<PaqueteProyectores> paquetes ;

    public GestorDePaquetesDeProyectores(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
        
        this.paquetes = new ArrayList<>();
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }
    
    public int getNumPaquetes(){
        
        return paquetes.size();
    
    }
    
    
    
    
    public void adddPaquete (PaqueteProyectores paquetenuevo){
        paquetes.add(paquetenuevo);
    }
    
    public void imprimirGestor(){
        
        System.out.println("Gestor ");
        System.out.println("Nombre Empresa "+ nombreEmpresa);
          System.out.println("");
        System.out.println("Numero de Paquetes " + paquetes.size());
        System.out.println("");
        
        for(PaqueteProyectores o : paquetes){
            
            System.out.println(paquetes.indexOf(o)+1);
        
            o.imprimirPaqueteProyectores();
        

}
    
    
}
}