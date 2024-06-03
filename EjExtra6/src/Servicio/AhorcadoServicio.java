/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.


 */
package Servicio;

import Entidad.AhorcadoEntidad;
import java.util.Scanner;

/**
 *
 */
public class AhorcadoServicio {
    
    
 
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    
     AhorcadoEntidad a= new AhorcadoEntidad ();
     
   
     
     public void crearJuego(){
     
     
         System.out.println("ingrese palabra");
         a.setPalabra(leer.next());
     
         System.out.println("ingrese cantidad de jugadas maximas");
         a.setJugadasMaximas(leer.nextInt());
     
         System.out.println("ingresar longitud de palabra");
         System.out.println(a.getPalabra().length());
         
         System.out.println("ingrese longitud del vector");
         
         int nro=leer.nextInt();
         
         a.palabraABuscar=new String[nro];
   
          System.out.println("ingresar la palabra en el vector");
          System.out.println(a.getPalabra());
         
         for (int i = 0; i < a.getPalabra().length(); i++) {
             
            
          a.palabraABuscar[i]= i + a.palabra.substring(i, i+1);




          System.out.println("[" + a.palabraABuscar[i] + "]");
           
             
         }
         
         
         System.out.println("");
         
         System.out.println("cantidad de jugadas maximas " + a.getJugadasMaximas());
      
         
     }
     
     
     public void longitud(){
     
         System.out.println("averiguar longitud de la palabra ingresada");
         int longitud=a.getPalabra().length();
         
         System.out.println("debera averiguar na palabra que contenga " + 
                 
         longitud + " letras");
     
     
     }
     

    
  
     
     public void  buscar(){
        
            
             System.out.println("averiguar si la letra se encuentra en la palabra o no");
             System.out.println("ingrese letra");
             String letraNueva=leer.next();


          if (a.getPalabra().indexOf(letraNueva)!= -1){
               System.out.println("la letra " + letraNueva + " es parte de la palabra  ");

         }else{
               
               System.out.println(letraNueva + "  no es parte de la palabra");     

               
           }
    
         
      } 

      
         int contadorLetras;
         int contadorLetrasFuera;
         String l;
        int contadorjugadas;
     boolean letraEncontrada;
         
     public void encontradas(){

    


while(a.getJugadasMaximas()!=contadorjugadas){

 System.out.println("buscar letras encontradas en la palabra y cuales faltan");
         System.out.println("ingresar letra "); 
         l=leer.next();
             
      
        
         if(a.getPalabra().contains(l)){
                 System.out.println("letra  encontrada");
                 letraEncontrada= true;
                  contadorLetras++;
                  
          
                  System.out.println("le faltan averiguar " + (a.palabra.length()-contadorLetras )+ " letras");
                   if((a.palabra.length()==contadorLetras)){
                      System.out.println("palabra encontrada");
                       break;
                   }
              
         
              }else{
                  System.out.println("letra no encontrada");
                 letraEncontrada = false;
                  contadorLetrasFuera++;
              
                  System.out.println("le faltan averiguar " +  (a.palabra.length()-contadorLetras ) + " letras");
                
                 
               }
                     
         contadorjugadas++;
          System.out.println("jugada realizada nro " + contadorjugadas);
       
              
              }
   
              
        
         System.out.println("jugadas hechas " + (contadorjugadas));
         System.out.println("encontradas " + contadorLetras);
         System.out.println("no encontradas " + contadorLetrasFuera);
            
               
               
        }    


     
     
     public void intentos(){
     
         
         System.out.println("mostrar oportunidades totales del  jugador");
         
         System.out.println(a.getJugadasMaximas());

         
         System.out.println("averiguar cuantos intentos le queda al jugador ");
         
         int intentos=(a.jugadasMaximas-contadorjugadas);
         System.out.println(intentos);

       }
        
           
     
   public void Juego(AhorcadoServicio b){
         
    b.crearJuego();
    b.longitud();
    b.buscar();
    b.encontradas();
    b.intentos();
      
    
    
     if((contadorjugadas==a.jugadasMaximas) && (contadorLetrasFuera!=contadorLetras)){
               
                      System.out.println("intentos agotados,palabra no encontrada");
                       
               }
    
   }
      
     } 
    
 


    
         

     
        
    
     
    
     
     
     
         
         
         
    
           
              
             
            
         
      











    
     
     
     
     
     
     
     
     
     
     
    
    

