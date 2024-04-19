
package javapooejercicio4aprendizaje;
import RectanguloEntidad.RectanguloEntidad;
import RectanguloServicio.RectanguloServicio;
import java.util.Scanner;


 
public class JavaPOOEjercicio4Aprendizaje {
    public static void main(String[] args) {
   
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
  
     
    RectanguloServicio a= new RectanguloServicio();
    RectanguloEntidad r1= new RectanguloEntidad();
  

    a.crearRectangulo(r1);
    a.superficie(r1);
    a.perimetro(r1);
    a.Dibujo(r1);
    
}
    }