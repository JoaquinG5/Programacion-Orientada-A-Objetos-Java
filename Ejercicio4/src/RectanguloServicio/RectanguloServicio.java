/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RectanguloServicio;
import RectanguloEntidad.RectanguloEntidad;
import java.util.Scanner;


public class RectanguloServicio {
    

  public void crearRectangulo(RectanguloEntidad r1){
      
      Scanner leer= new Scanner(System.in); 
      
      System.out.println("ingrese numero de base");
      r1.setBase(leer.nextDouble());
      
      System.out.println("ingrese numero de altura");
      r1.setAltura(leer.nextDouble());
      
     
  }
  
  
  public void superficie(RectanguloEntidad r1){
   
    double superficie=r1.getAltura()*r1.getBase();
    
      System.out.println("superfice del rectangulo  " + superficie);
    
}
  
  public void perimetro(RectanguloEntidad r1){
   
    double perimetro=((r1.getBase()+ r1.getAltura())*2);
    
      System.out.println("perimetro del rectangulo  " + perimetro);
    
}
  

  
  public  void Dibujo(RectanguloEntidad r1){

    for (int i = 1; i <= r1.getBase(); i++) {
            for (int j = 1; j <= r1.getAltura(); j++) {
                if(i==1 || i==r1.getBase() || j==1 || j==r1.getAltura()){
                    System.out.print("* ");
            }else{
                System.out.print("  ");
            }
        }
            System.out.println("");
        
    }
    }
}
