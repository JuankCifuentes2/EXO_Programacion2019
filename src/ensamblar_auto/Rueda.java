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
public class Rueda {
    
    private final String material;
    private final String fabricante;
    private final String dimension;

    public Rueda(String material, String fabricante, String dimension) {
        this.material = material;
        this.fabricante = fabricante;
        this.dimension = dimension;
    }

    public String getMaterial() {
        return material;
    }

    public String getFabricante() {
        return fabricante;
    }

    public String getDimension() {
        return dimension;
    }
    
    
    
    
}
