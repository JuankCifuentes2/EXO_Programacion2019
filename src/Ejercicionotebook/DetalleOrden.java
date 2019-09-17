/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicionotebook;


/**
 *
 * @author Español
 */
public class DetalleOrden {

   
    private final Notebook item;
    private final double precioUnitario;
    private final int cantidad;

    public DetalleOrden(Notebook item, double precioUnitario, int cantidad) {
        this.item = item;
        this.precioUnitario = precioUnitario;
        this.cantidad = cantidad;
    }

    public Notebook getItem() {
        return item;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public int getCantidad() {
        return cantidad;
    }

    
    public void imprimirDetalleOrden(){
        item.imprimirnotebook();
        System.out.println("Precio Unitario"+precioUnitario);
        System.out.println("Cantidad"+cantidad);

}
}