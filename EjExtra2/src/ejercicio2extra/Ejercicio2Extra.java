
package ejercicio2extra;
import ejercicio2extra.Entidad.Puntos;
import ejercicio2extra.Servicio.ServicioPuntos;
import java.util.Scanner;


 
public class Ejercicio2Extra {
    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        ServicioPuntos a= new ServicioPuntos();
        
        a.crearPuntos();
        a.calcular();
        
        
    }

}
