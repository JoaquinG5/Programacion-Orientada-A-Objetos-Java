/*
Generar un objeto puntos usando un método crearPuntos() que le pide al usuario los dos números 
y los ingresa en los atributos del objeto. Después, a través de otro método calcular y devolver 
la distancia que existe entre los dos puntos que existen en la clase Puntos.
 */
package ejercicio2extra.Servicio;

import ejercicio2extra.Entidad.Puntos;
import java.util.Scanner;

public class ServicioPuntos {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    Puntos p= new Puntos();
    
    
  public void crearPuntos(){

      System.out.println("ingrese valor para x1");
      p.setX1(leer.nextInt());

      
      System.out.println("ingrese valor para y1");
      p.setY1(leer.nextInt());
      
      System.out.println("ingrese valor para x2");
      p.setY1(leer.nextInt());
      
      System.out.println("ingrese valor para y2");
      p.setY2(leer.nextInt());
      
      System.out.println("la coordenada A es  " + p.getX1() + " - " + p.getY1() );
      System.out.println("la coordenada b es  " + p.getX2() + " - " + p.getY2() );
}
    
    
  public void calcular(){

      System.out.println("calcular la distancia que hay entre los dos puntos");
      double distancia=Math.sqrt((Math.pow(p.getX1()-p.getX2(),2) +  Math.pow(p.getY1()-p.getY2(),2)));
      
      System.out.println("la distancia entre los dos puntos es  " + distancia);
        
    
    }
  
 
}
