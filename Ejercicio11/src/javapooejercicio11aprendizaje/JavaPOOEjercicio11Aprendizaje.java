
package javapooejercicio11aprendizaje;


import java.util.Date;
import java.util.Scanner;





//Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con la
//clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la clase
//Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al
//usuario para poner el constructor del objeto Date. Una vez creada la fecha de tipo Date,
//deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, que se
//puede conseguir instanciando un objeto Date con constructor vacío.
//Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
//Ejemplo fecha actual: Date fechaActual = new Date();
 
public class JavaPOOEjercicio11Aprendizaje {
    public static void main(String[] args) {
     Scanner leer=new Scanner(System.in);  

     
        System.out.println("bienvenido,ingrese su fecha de nacimiento");
        System.out.println("ingrese el dia");
        int dia=leer.nextInt();
        System.out.println("ingrese el mes");
        int mes=leer.nextInt();
        System.out.println("ingrese el anio");
        int anio=leer.nextInt();
        
        Date Fecha= new Date(anio-1900,mes-1,dia);
        
        System.out.println("la fecha de nacimiento es " + Fecha.toLocaleString());

        
        Date fechaActual= new Date();
        
        System.out.println(" la fecha actual es " + fechaActual.toLocaleString());
     
        System.out.println("la diferencia de años entre la fecha actual y la fecha de nacimiento ingresada es "
        
          + (fechaActual.getYear() - Fecha.getYear()));
        
   
     
}
    
   
        
        
        
      
   

}
       


        
        
     

       
 

