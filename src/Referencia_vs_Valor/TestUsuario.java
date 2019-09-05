
package Referencia_vs_Valor;

public class TestUsuario {

    public static void main(String[] args) {
        // TODO code application logic here
        int a = 56;//VARIABLES PRIMITIVAS
        int b = 28;
        
        Usuario u = new Usuario("pepe", 23);//REFERENCIAS
        Usuario v = new Usuario("james", 45);
        
        System.out.println("a: "+a);
        System.out.println("b: "+b);
        System.out.println("u: "+u);
        System.out.println("v: "+v);
        a=b;
        u=v;
        System.out.println("a: "+a);
        System.out.println("b: "+b);
        System.out.println("u: "+u);
        System.out.println("v: "+v);
        
    }
    
}
