/*
Deberá además implementar los siguientes métodos:
a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase
ingresada.
b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por
ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
d) Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
e) Método compararLongitud(String frase), deberá comparar la longitud de la frase que
compone la clase con otra nueva frase ingresada por el usuario.
f) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena con
una nueva frase ingresada por el usuario y mostrar la frase resultante.
g) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar la
frase resultante.
h) Método contiene(String letra), deberá comprobar si la frase contiene una letra que
ingresa el usuario y devuelve verdadero si la contiene y falso si no.
 */
package CadenaServicio;

import CadenaEntidad.CadenaEntidad;
import java.util.Scanner;



public class CadenaServicio{
    
  Scanner leer= new Scanner(System.in).useDelimiter("\n");  
      
  public CadenaEntidad ingresarFrase(){
      
   CadenaEntidad frase= new CadenaEntidad();
     
    System.out.println("ingrese una palabra o frase  ");
      
    frase.setFrase(leer.next());

    
     return frase;
  }
   

//a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase
//ingresada
  
 public void mostrarVocales(CadenaEntidad frase ) {
      
     int contador=0;
     
 
       
     for (int i = 0; i < frase.getFrase().length(); i++) {
        
    if ((frase.getFrase().charAt(i)=='a') || (frase.getFrase().charAt(i)=='e') || (frase.getFrase().charAt(i)=='i') || (frase.getFrase().charAt(i)=='o') || (frase.getFrase().charAt(i)=='u')){ 
    contador++;
  }
           
             
}
        System.out.println("la frase  " + frase.getFrase() + "   contiene vocal " + contador + "  veces");      
 }
  
 //b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por
//ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".

  
  
  public void invertirFrase(CadenaEntidad frase){
       
        System.out.println("invertir la frase ingresada  ");
      
        String FraseInvertida ="";
        for (int x = frase.getFrase().length() - 1; x >= 0; x--){

            FraseInvertida = FraseInvertida + frase.getFrase().charAt(x);     
   }
        System.out.println("la frase invertida es   " + FraseInvertida);
  }


  
//  c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
//contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
//d) Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces
  
  public  void vecesRepetido(CadenaEntidad frase){
      
        System.out.println("ingrese una letra");
      
      char letra = leer.next().charAt(0);
      int contador=0; 
      
      for (int i = 0; i < frase.getFrase().length(); i++) {
      
      if (letra==(frase.getFrase().charAt(i))){
      
          contador++;
          }
      } 
      
     System.out.println("la letra repetida es  " + letra + "  y se repite  " + contador + "  veces " );
}


  
  
//  e) Método compararLongitud(String frase), deberá comparar la longitud de la frase que
//compone la clase con otra nueva frase ingresada por el usuario.
//      
public void compararLongitud(CadenaEntidad frase){
        
      
         
         
         System.out.println("ingresa otra frase para comparar longitud con la frase ingresada");
         String NuevaFrase = leer.next();
         
          
          
          int longitudFrase=frase.getFrase().length();
          int longitudNuevaFrase=NuevaFrase.length();
          
         if (longitudFrase==longitudNuevaFrase){
             System.out.println("son iguales");
         }else{
             System.out.println("no son iguales");
         }       
     }
     

//f) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena con
//una nueva frase ingresada por el usuario y mostrar la frase resultante.
              
public void unirFrases(CadenaEntidad frase){


          
     System.out.println("ingrese otra frase para unir");
     String NuevaFrase = leer.next();
     
    System.out.println(frase.getFrase()+" "+ NuevaFrase);

}
       

//g) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
//encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar la
//frase resultante.

public void reemplazar(CadenaEntidad frase){
     
    
    System.out.println("ingrese un caracter");
    String caracter = leer.next();
    
   String reemplazoA;
   reemplazoA = frase.getFrase().replace("a",caracter);
   
    System.out.println("la frase cambiada es " + reemplazoA);
    
}

//h) Método contiene(String letra), deberá comprobar si la frase contiene una letra que
//ingresa el usuario y devuelve verdadero si la contiene y falso si no.


public boolean contenerLetra(CadenaEntidad frase){
    
    
    System.out.println("ingrese una letra");
    String letra=leer.next();
      

      boolean contieneLetra = false;
    
    for (int i = 0; i < frase.getLongitudFrase(); i++) {
        if(letra.equalsIgnoreCase(frase.getFrase().substring(i, i + 1))){
          contieneLetra=true;
          break;
    }
   } 
    return contieneLetra;

}  
  

}












  






 



          
          
  


      
    
    

