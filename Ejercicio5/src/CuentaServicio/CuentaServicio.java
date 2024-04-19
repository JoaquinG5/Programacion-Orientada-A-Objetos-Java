/*

d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
y se la sumara a saldo actual.
e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se la
restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se pondrá el
saldo actual en 0.
f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
usuario no saque más del 20%.
g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta

 */
package CuentaServicio;

import CuentaEntidad.CuentaEntidad;
import java.util.Scanner;

public class CuentaServicio {
    
 
    
    Scanner leer= new Scanner(System.in);
    
    public CuentaEntidad abrirCuenta(){
  
      CuentaEntidad Cuenta= new CuentaEntidad();
       
    
        System.out.println("ingrese su nombre");
        Cuenta.setNombre(leer.next());
        
        System.out.println("ingrese su apellido");
        Cuenta.setApellido(leer.next());
        
        System.out.println("ingrese su Dni");
        Cuenta.setDni(leer.nextLong());
        
        System.out.println("ingrese su contraseña");
        Cuenta.setContraseña(leer.nextInt());
        
       System.out.println("ingrese su numero de cuenta");
        Cuenta.setNumeroCuenta(leer.nextInt());
       
        System.out.println("ingrese su saldo actual");
        Cuenta.setSaldoActual(leer.nextDouble());
        
        System.out.println("bienvenido");
   
        return Cuenta;
    
    }    
    
    
    double ingreso=0;
    
 
        
public void IngresarDinero(CuentaEntidad Cuenta) {     
  
    
    System.out.println("su saldo actual es " + Cuenta.getSaldoActual());
  

    System.out.println("ingrese dinero si lo requiere");
    ingreso=leer.nextDouble();
   
   
    double ingresoDineroCuenta=(Cuenta.getSaldoActual()+ ingreso);
   
    System.out.println("su saldo actual es " + ingresoDineroCuenta);
       
  
    
}

public void retirarDinero(CuentaEntidad Cuenta) {     
  
    
    System.out.println("su saldo actual es " + Cuenta.getSaldoActual());
  

    System.out.println("ingrese el monto de dinero a retirar");
    double retiroDinero=leer.nextDouble();


     if ((Cuenta.getSaldoActual()-(retiroDinero)<0)){
       System.out.println("tiene saldo insuficiente, su saldo actual es  0 ");
       Cuenta.setSaldoActual(0);
      }else{
       
       System.out.println("ud retiro " + retiroDinero);
      
    }

System.out.println("su saldo actual es " + ((Cuenta.getSaldoActual()-(retiroDinero))));
  
    
}







        
//public void RetirarDinero(CuentaEntidad Cuenta){
// 
//   
//      System.out.println("cuanto dinero desea retirar?");
//        double retiro = leer.nextDouble();
//   
//      int cuentaVacia=0;
//        
//        
//      if ((Cuenta.getSaldoActual()-(retiro)<0)){
//      System.out.println("tiene saldo insuficiente, su saldo actual es " + cuentaVacia); 
//      }else{
//       Cuenta.setSaldoActual((Cuenta.getSaldoActual()-(retiro)));
//       System.out.println("ud retiro " + retiro);
//       System.out.println("su saldo actual es " + Cuenta.getSaldoActual());
//    }
//
// 
//
//}


    
    


public void extraccionRapida(CuentaEntidad Cuenta){
   
double extraccion;
double extraccion1;

    System.out.println("cual es su saldo actual? " + Cuenta.getSaldoActual());
    
   System.out.println("realize una extraccion, ingrese el monto");
    
   extraccion=leer.nextDouble();
    
   extraccion1=Cuenta.getSaldoActual()*0.20;

    if (extraccion<extraccion1){
        System.out.println(" ud retiro " + extraccion);
      
    }else{
        System.out.println("error,ingrese otro monto a retirar");
    }
    
    Cuenta.setSaldoActual(Cuenta.getSaldoActual()-extraccion);
   
}
  
//Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
//h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta

  public void consultarSaldo(CuentaEntidad Cuenta){
      System.out.println(" mi saldo actual es " + Cuenta.getSaldoActual());

  }

  public void consultarDatos(CuentaEntidad Cuenta){

      System.out.println( "mis datos personales : "  + Cuenta.toString());

  
  
  }
} 

      
         
    
        

     
      
  





 
 
    
    

