
package ej3extra;
import ej3extra.Entidad.Raices;
import ej3extra.Servicio.ServicioRaices;
import java.util.Scanner;


 
public class Ej3Extra {
    public static void main(String[] args) {
        
    
        Raices r= new Raices();
        ServicioRaices sr= new ServicioRaices();
        
        
        sr.crearRaiz(r);
        sr.calcular(r);
        
    }

}
