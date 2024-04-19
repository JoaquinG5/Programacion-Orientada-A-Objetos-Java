
package CircunferenciaServicio;
import CircunferenciaEntidad.CircunferenciaEntidad;
import java.util.Scanner;
/**
 *
 * @author LILIANA
 */
public class CircunferenciaServicio {
    
    Scanner leer=new Scanner(System.in);
   
    public CircunferenciaEntidad crearCircunferencia(){
        
        CircunferenciaEntidad C1= new CircunferenciaEntidad();
        
        System.out.print("ingrese el radio de la circunferencia");
        C1.setRadio(leer.nextInt());
        
        return C1;
    }
    
    
  public void calcularArea(double pi , int radio){
       
     CircunferenciaEntidad C2= new CircunferenciaEntidad();
        
     System.out.print("ingrese el radio de la circunferencia");
     C2.setRadio(leer.nextInt());
     
     System.out.println("ingresar Pi");
     C2.setPi(leer.nextInt());
       
     if ( pi*radio*radio >0){
         System.out.println("area creada");
       }
  } 

 public void calcularPerimetro(double pi , int radio){
       
     CircunferenciaEntidad C3= new CircunferenciaEntidad();
        
     System.out.print("ingrese el radio de la circunferencia");
     C3.setRadio(leer.nextInt());
     
     System.out.println("ingresar Pi");
     C3.setPi(leer.nextInt());
       
     if ( pi*radio*2>0){
         System.out.println("perimetro calculado");
       }
      
  }
}




    
    
    
    


    
    
    
