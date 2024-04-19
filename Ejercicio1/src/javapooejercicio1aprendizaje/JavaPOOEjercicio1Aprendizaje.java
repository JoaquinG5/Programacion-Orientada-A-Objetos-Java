
package javapooejercicio1aprendizaje;

import LibroEntidad.LibroEntidad;
import LibroServicio.LibroServicio;
import java.util.Scanner;


 //@author LILIANA
 
public class JavaPOOEjercicio1Aprendizaje {
    public static void main(String[] args) {
       
   Scanner leer=new Scanner (System.in);
        
        
    LibroServicio NuevoUsuario= new LibroServicio();
   
    LibroServicio U1=NuevoUsuario.ingresoUsuario();
    LibroEntidad datosLibro=NuevoUsuario.cargarDatosUsuario();
            
       
    }



}
