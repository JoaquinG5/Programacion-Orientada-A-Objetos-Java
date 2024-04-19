
package javapooejercicio3aprendizaje;
import OperacionEntidad.OperacionEntidad;
import OperacionServicio.OperacionServicio;
import java.util.Scanner;

 //@author LILIANA
 
public class JavaPOOEjercicio3Aprendizaje {
    public static void main(String[] args) {
       Scanner leer= new Scanner(System.in);
       
       OperacionServicio n= new OperacionServicio();
       
       OperacionEntidad n1=n.crearOperacion();
       
 
  
    System.out.println("suma " + n.sumar(n1));
    System.out.println("resta " + n.restar(n1));
    System.out.println("multiplicacion " +    n.multiplicar(n1));
    System.out.println("division " +  n.dividir(n1));
   
  
    }

}
