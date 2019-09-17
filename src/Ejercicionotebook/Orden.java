/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicionotebook;




import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Español
 */
public class Orden {
    
    
    private final int id;
    private final Date creacion;
    private final Date envio;
    private final ArrayList<DetalleOrden> items ;
    
    public Orden(int id, Date creacion) {
        this.id = id;
        this.creacion = creacion;
        this.envio = new Date();
        this.items = new ArrayList<>();
    }

    public void addditem (DetalleOrden detalle){
        items.add(detalle);
    }
     
    public int getNumItems(){
        
        return items.size();
    
    }
    
    public void setenvio(Date envio) {
        
        envio = this.envio;
    }
    
    public void imprimirOrden(){
        
        System.out.println("Ordenes");
        System.out.println("ID"+ id);
        System.out.println("Creacion"+ creacion);
        System.out.println("Envio"+ envio);
        
        for(DetalleOrden o = items){
        
            o.imprimirDetalleOrden();
        
}    
}
}