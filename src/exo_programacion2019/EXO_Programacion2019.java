
package exo_programacion2019;

public class EXO_Programacion2019 {

    public static void main(String[] args) {
        // TODO code application logic here
        Persona per = new Persona("pepe", "garcia");
        Alumno al = new Alumno("daniel", "gomez","10223");
        Profesor prof = new Profesor("programacion", "julian", "fernandez");
       
        System.out.println(per.toString());
        System.out.println(al.toString());
        System.out.println(prof.toString());
        
        
    }
    
}
