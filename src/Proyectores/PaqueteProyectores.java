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
public class PaqueteProyectores {
    
    private int codPaqueteDeProyectores;
    private String destinatario;
    private String destino;
    private float costoEnvio;
    private boolean enTransito;

    public PaqueteProyectores(int codPaqueteDeProyectores, String destinatario, String destino, float costoEnvio) {
        this.codPaqueteDeProyectores = codPaqueteDeProyectores;
        this.destinatario = destinatario;
        this.destino = destino;
        this.costoEnvio = costoEnvio;
    }

    public void setCodPaqueteDeProyectores(int codPaqueteDeProyectores) {
        this.codPaqueteDeProyectores = codPaqueteDeProyectores;
    }
    
    public int getCodPaqueteDeProyectores() {
        return codPaqueteDeProyectores;
    }

    

    public boolean isEnTransito() {
        return enTransito;
    }

    public void setEnTransito(boolean enTransito) {
        this.enTransito = enTransito;
    }

 

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public void imprimirPaqueteProyectores(){
        System.out.println("DetallePaquete{");
        System.out.println("codigo="+codPaqueteDeProyectores);
        System.out.println("destinatario="+destinatario);
        System.out.println("destino="+destino);
        System.out.println("En transito?"+enTransito);
        System.out.println("++++++++++++++++++++++++");
      
        
            
}
    
    
    

}