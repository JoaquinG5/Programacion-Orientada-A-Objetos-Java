
package javapooejercicio2aprendizaje;
import CircunferenciaEntidad.CircunferenciaEntidad;
import CircunferenciaServicio.CircunferenciaServicio;
import java.util.Scanner;

 //@author LILIANA
 
public class JavaPOOEjercicio2Aprendizaje {
    public static void main(String[] args) {
       Scanner leer=new Scanner(System.in);
        
        CircunferenciaServicio Area= new CircunferenciaServicio();
        CircunferenciaEntidad C10=Area.crearCircunferencia();
     
       //CircunferenciaServicio C20=Area.calcularArea();
      // CircunferenciaServicio C30=Area.calcularPerimetro(3.14,5*2);
    }

}
