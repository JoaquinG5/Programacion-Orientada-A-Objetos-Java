/*
 las operaciones que se podrán realizar son las siguientes:
• Método getDiscriminante(): devuelve el valor del discriminante (double). El
discriminante tiene la siguiente formula: (b^2)-4*a*c
• Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para
que esto ocurra, el discriminante debe ser mayor o igual que 0.
• Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para
que esto ocurra, el discriminante debe ser igual que 0.
• Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, imprime las 2 posibles
soluciones.
• Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una única raíz. Es
en el caso en que se tenga una única solución posible.
• Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por
pantalla las posibles soluciones que tiene nuestra ecuación con los métodos
obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso
de no existir solución, se mostrará un mensaje.

Nota: Formula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varia el signo delante de -b

 */
package ej3extra.Servicio;

import ej3extra.Entidad.Raices;
import java.util.Scanner;


public class ServicioRaices {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
   
     public void crearRaiz(Raices r){
     
         System.out.println("ingrese el primer coeficiente");
         r.setA(leer.nextInt());
         
         System.out.println("ingrese el segundo coeficiente");
         r.setB(leer.nextInt());
         
         System.out.println("ingrese el tercer coeficiente");
         r.setC(leer.nextInt());
         
     }

     
     public double getDiscriminante(Raices r){
     
     double discriminante= (Math.pow(r.getB(),2) + 4*r.getA()*r.getC());
         
       return discriminante;
     
     }
     
         
//   Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para
//que esto ocurra, el discriminante debe ser mayor o igual que 0.
     
     public boolean tieneRaices(Raices r){
         
         boolean solucion=(getDiscriminante(r) >=0);
         
         return solucion;
         
     }
     
     
     
     
//• Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para
//que esto ocurra, el discriminante debe ser igual que 0.
     
      public boolean tieneRaiz(Raices r){
         
         boolean solucion2=(getDiscriminante(r)==0);
         
         return solucion2;
         
     }
     
     
     
//• Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, imprime las 2 posibles
//soluciones.(-b±√((b^2)-(4*a*c)))/(2*a)
      
      
      public void obtenerRaices(Raices r){


       double formulap = 0;
       double formulan = 0;
       
       
       
       if(tieneRaices(r)){
              
           formulap=(-r.getB() + (getDiscriminante(r)) / 2*r.getA());
           formulan=(-r.getB() - (getDiscriminante(r)) / 2*r.getA());
           
        }
      
      
          System.out.println("solucion con formula positiva " + formulap);
          System.out.println("solucion con formula negativa " + formulan);
   
      
      }  
      
      
//• Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una única raíz. Es
//en el caso en que se tenga una única solución posible.
      
      
      public void obtenerRaiz(Raices r){
      
          double f=0;
          
      if(tieneRaiz(r)==true){
          
        f=(-r.getB() + (getDiscriminante(r)) / 2*r.getA());
      
      }
          System.out.println("unica solucion posible " + f);   
      
      }
      
      
      
      
      
//• Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por
//pantalla las posibles soluciones que tiene nuestra ecuación con los métodos
//obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso
//de no existir solución, se mostrará un mensaje.     
      
      
      public void calcular(Raices r){
      
      
  if (getDiscriminante(r)<0){

      System.out.println("error,no existe solucion posible");
      
    }else if (tieneRaices(r)){
          
          obtenerRaices(r);
          
      }else{

      obtenerRaiz(r);

   }
    }


}
    


    
    
    

