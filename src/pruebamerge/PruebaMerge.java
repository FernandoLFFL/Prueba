/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebamerge;

/**
 *
 * @author Fernando
 */
public class PruebaMerge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Alumno alumno = new Alumno("Luis", 22);
        
        if ("Luis".equals(alumno.getNombre())){
            System.out.println("Luis es el dueño");
        }
        
        if (alumno.getEdad()>18){
            System.out.println("Es mayor de edad");
        }
        
        
    }
    
}
