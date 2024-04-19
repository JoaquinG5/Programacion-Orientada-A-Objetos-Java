
package javapooejercicio10aprendizaje;
import ArregloEntidad.ArregloEntidad;
import ArregloServicio.ArregloServicio;
import java.util.Scanner;

 //@author LILIANA
 
public class JavaPOOEjercicio10Aprendizaje {
    public static void main(String[] args) {
        
       Scanner leer = new Scanner(System.in);

      ArregloServicio a1=new ArregloServicio();
     
      a1.crearArreglos();
      a1.ordenarArreglo();
      a1.copiarNumeros();
    }

}
