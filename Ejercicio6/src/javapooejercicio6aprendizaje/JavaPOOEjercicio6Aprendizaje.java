
package javapooejercicio6aprendizaje;
import CafeteraEntidad.CafeteraEntidad;
import CafeteraServicio.CafeteraServicio;
import java.util.Scanner;


 
public class JavaPOOEjercicio6Aprendizaje {
    public static void main(String[] args) {
       
        Scanner leer= new Scanner(System.in);
        
        CafeteraServicio tazaCafe= new CafeteraServicio();
        CafeteraEntidad taza= new CafeteraEntidad();
        int opcion;
       
      
     do {   
     System.out.println("1-llenarCafetera, 2-llenarTaza , 3-vaciarCafetera , 4-agregarCafe ,5-salir");
        System.out.println("eleji una opcion");
        opcion=leer.nextInt();
           switch (opcion) {
            case 1:
               tazaCafe.llenarCafetera(taza);
               System.out.println("la cafetera tiene " + taza.getCantidadActual());
               break;
             case 2:
                tazaCafe.llenarTaza(taza);
                   break;
            case 3:
                tazaCafe.vaciarCafetera(taza);
                break;
            case 4:
                tazaCafe.AgregarCafe(taza);
                break;
            case 5:
                System.out.println("desea salir?");
                String salir=leer.next();
             
                if("si".equalsIgnoreCase(salir)){
                    opcion=6;
                    break;
                }else{
                    break;
                }
            default: 
                 System.out.println("opcion no valida");
           }
       }while(opcion<=5);
    }
}


       
       
        
