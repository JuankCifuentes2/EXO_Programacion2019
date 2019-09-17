/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicionotebook;

import java.util.ArrayList;

/**
 *
 * @author Español
 */
public class Cliente {
    
    
    private final int dni;
    private final String nombre;
    private final ArrayList<Orden> ordenes ;
    
    
    public Cliente(int dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
        this.ordenes = new ArrayList<>();
        
    }
   
    public void addorden (Orden o){
        ordenes.add(o);
    }

    public int getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }
    
    public void imprimirCliente(){
        
        System.out.println("Cliente");
        System.out.println("Nommbre"+ nombre);
        System.out.println("Dni"+dni );
        
        
        for(Orden o = ordenes){
        
            o.imprimirOrden();
        
}   
    
    
}
}