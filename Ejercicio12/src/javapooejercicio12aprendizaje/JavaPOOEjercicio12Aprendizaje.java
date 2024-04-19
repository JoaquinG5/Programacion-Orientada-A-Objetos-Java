
package javapooejercicio12aprendizaje;
import PersonaServicio.PersonaServicio;
import java.util.Scanner;

 //@author LILIANA
 
public class JavaPOOEjercicio12Aprendizaje {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        PersonaServicio Ps=new PersonaServicio();
       
        Ps.crearPersona();
        Ps.calcularEdad();
        Ps.menorEdad();
        Ps.mostrarPersona();
    }

}
