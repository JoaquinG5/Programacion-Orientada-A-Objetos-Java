
package javapooejercicio5aprendizaje;
import CuentaEntidad.CuentaEntidad;
import CuentaServicio.CuentaServicio;
import java.util.Scanner;


 
public class JavaPOOEjercicio5Aprendizaje {
    public static void main(String[] args) {
      Scanner leer= new Scanner(System.in);
        
        CuentaServicio C1= new CuentaServicio();
        
        
        System.out.println("bienvenido,ingrese sus datos");
        
        CuentaEntidad Cuenta=C1.abrirCuenta();


     
     
     int opc=0;
     
       do {
           System.out.println("elija una opcion del menu");
           System.out.println("1-consultar Datos,2-ingresar Dinero,3-retirar Dinero,4-extraccion rapida,5-consultar saldo,6-salir");
           opc=leer.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("consultar Datos");
                    C1.consultarDatos(Cuenta);
                    break;
                case 2:
                    System.out.println("ingresar Dinero");
                    C1.IngresarDinero(Cuenta);
                    break;
                case 3:
                    System.out.println("retirar Dinero");
                    C1.retirarDinero(Cuenta);
                    break;
                  case 4:
                    System.out.println("extraccion rapida");
                    C1.extraccionRapida(Cuenta);   
                    break;
                case 5:
                    System.out.println("consultar saldo");
                    C1.consultarSaldo(Cuenta);
                     break;
                default:
                    if(opc==6){
                    System.out.println("adios");
                    break;
            }
        }
            
    }  
       while (opc<6);
  }
}


