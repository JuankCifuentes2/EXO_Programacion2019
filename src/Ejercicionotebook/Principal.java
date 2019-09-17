/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicionotebook;

import java.util.Date;

/**
 *
 * @author Español
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Cliente lucas = new Cliente (12345,"lucas");
        
        Notebook notebook1 = new Notebook ("hp","xpe","intel",240);
        Notebook notebook2= new Notebook ("dell","dsd","ds",360);
        
        
        DetalleOrden dod1 = new DetalleOrden(notebook1,10000,1);
        DetalleOrden dod2 = new DetalleOrden(notebook1,10000,1);
        
        Date creacion = new Date();
        Date envio = new Date();
        
        Orden orden1 = new Orden (1,creacion);
        Orden orden2 = new Orden (1,creacion);
        
        orden1.addditem(dod1);
        orden1.addditem(dod2);
        
        orden1.setenvio(envio);
        
        orden2.addditem(dod1);
        orden2.setenvio(envio);
        
        
        lucas.addorden(orden1);
        lucas.addorden(orden2);
        
        lucas.imprimirCliente();
        
        // TODO code application logic here
    }
    
}
