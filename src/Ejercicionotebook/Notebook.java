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
public class Notebook {
    
    private final String marca;
    private final String modelo;
    private final String procesador;
    private final float tamañoDisco;

    public Notebook(String marca, String modelo, String procesador, float tamañoDisco) {
        this.marca = marca;
        this.modelo = modelo;
        this.procesador = procesador;
        this.tamañoDisco = tamañoDisco;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getProcesador() {
        return procesador;
    }

    public float getTamañoDisco() {
        return tamañoDisco;
    }
    
    
    public void imprimirnotebook(){
        System.out.println("DetalleOrden{");
        System.out.println("item="+marca);
        System.out.println("item="+modelo);
        System.out.println("item="+procesador);
            
}
    
    
    
}
