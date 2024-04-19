/*
Crea una clase en Java donde declares una variable de tipo array de Strings que contenga
los doce meses del año, en minúsculas. A continuación, declara una variable mesSecreto
de tipo String, y hazla igual a un elemento del array (por ejemplo, mesSecreto = mes[9]. El
programa debe pedir al usuario que adivine el mes secreto. Si el usuario acierta mostrar
un mensaje, y si no lo hace, pedir que vuelva a intentar adivinar el mes secreto. Un
ejemplo de ejecución del programa podría ser este:
Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: febrero
No ha acertado. Intente adivinarlo introduciendo otro mes: agosto
¡Ha acertado!
 */
package ej5extra.Servicio;

import ej5extra.Entidad.Entidad;
import java.util.Arrays;
import java.util.Scanner;



public class Servicio {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
       Entidad a= new Entidad();
   
    
    public void ingresarMes(Entidad a){
        
      String meses[]={"enero","febrero","marzo","abril","mayo","junio",
      "julio","agosto","septiembre","octubre","noviembre","diciembre"};
        
    
    String mesNuevo=meses[8];
   
        for (int i = 0; i < meses.length; i++) {
           
      System.out.println("  " +  i  +  " " + meses[i]);
   
            }
 
        String mesSecreto;
        
        
        do {
  
        System.out.println("averiguar mes ");
        mesSecreto=leer.next();

             if(mesNuevo.equalsIgnoreCase(mesSecreto)){
                 
               System.out.println(" ha acertaoo ");
                System.out.println(" es el mes " + mesSecreto );
                break;
               
          } else {
              System.out.println("error,intente de nuevo");
          } 
    }  while (!mesSecreto.equals(mesNuevo));  
       
 }   
    
   }
      
       
       
          
       
      
        

//                
//                for (int i = 0; x < meses.length; x++) {
//			if (meses[i].equalsIgnoreCase(mesSecreto)) {
//				return i;
//			}
//		}
//                return -1;
//                
//		if (posicionDeElementoBuscado == -1) {
//			System.out.println("El elemento NO existe en el arreglo");
//		} else {
//			System.out.println("El elemento existe en la posición: " + posicionDeElementoBuscado);
//		

  
  


                
               
                

//   
//        for (int i = 0; i < mesesDelAño.length; i++) {
//            
//       
//   
//   
//       
//        System.out.println("ingresar mes");
//        mes=leer.nextInt();
// 
//      String mesSecreto;
//      
//      System.out.println("ingrese un mes secreto");
//      mesSecreto=leer.next();      
//
//            
//            
//            System.out.println("averiguar el mes ingresado");
//            
//            mesesDelAño[i]=mes.parseInt(mesSecreto);
//            
     



        
        

    

