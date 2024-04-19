/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.




 */
package PersonaServicio;

import PersonaEntidad.PersonaEntidad;
import java.util.Scanner;



public class PersonaServicio {
    
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    PersonaEntidad P1=new PersonaEntidad();
    
    
    
    
    public void crearPersona(){
        
        System.out.println("cual es su nombre");
        P1.setNombre(leer.next());
        
        System.out.println("cuando nacio?");
        P1.setDia(leer.nextInt());
        P1.setMes(leer.nextInt());
        P1.setAnio(leer.nextInt());
          
   
        System.out.println("mi nombre es  " + P1.getNombre());
        System.out.println("Y naci en la fecha  ");
        System.out.print(P1.getDia() + "/" + P1.getMes() + "/" + P1.getAnio());
    }
    

    
    public void calcularEdad(){
        
        System.out.println ("  cual es la fecha del dia de hoy");
        
        int diaActual=leer.nextInt();
        int mesActual=leer.nextInt();
        int anioActual=leer.nextInt();
       
        
        System.out.println("la fecha de hoy es  " + diaActual + "/ " + mesActual + "/" + anioActual );
        
        int edad=anioActual-P1.getAnio();
        
        System.out.println("la edad es  " +  edad);
        
        
 
    }
    
    
    
    int edadPersona;

    public boolean menorEdad(){
        
        System.out.println("cual es su edad ");
        
        edadPersona=leer.nextInt();
        boolean menor;

        return menor=P1.getAnio()<edadPersona;
  
    }
    
    
   public void mostrarPersona(){
      
       System.out.println("nombre de la persona");
       System.out.println(P1.getNombre());
       
       System.out.println("dia de nacimiento");
       System.out.println(P1.getDia());
       
       System.out.println("mes de nacimiento");
       System.out.println(P1.getMes());
          
       System.out.println("anio de nacimiento");
       System.out.println(P1.getAnio());
       
       System.out.println("edad");
       System.out.println(edadPersona);
       
   }
}
