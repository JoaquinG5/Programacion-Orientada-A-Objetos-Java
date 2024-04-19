
//En el main se creará el objeto y se usará el
//Math.random para generar los dos números y se guardaran en el objeto con su
//respectivos set. 

package javapooejercicio9aprendizaje;
import MatematicaEntidad.MatematicaEntidad;
import MatematicaServicio.MatematicaServicio;
import java.util.Scanner;


 
public class JavaPOOEjercicio9Aprendizaje {
    public static void main(String[] args) {
        
        MatematicaServicio numero1= new MatematicaServicio();
        MatematicaEntidad perro=numero1.ingresarNumero();
        
       numero1.DevolverMayor();
     
       
        System.out.println(  numero1.calcularPotencia());
        
        System.out.println( numero1.calcularRaiz());
    }

}
