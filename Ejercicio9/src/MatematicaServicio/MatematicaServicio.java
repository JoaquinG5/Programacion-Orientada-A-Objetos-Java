/*
Deberá además implementar los siguientes métodos:
a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase elevado
al menor número. Previamente se deben redondear ambos valores.
c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número
 */
package MatematicaServicio;

import MatematicaEntidad.MatematicaEntidad;
import java.util.Scanner;




public class MatematicaServicio {
    
    Scanner leer=new Scanner(System.in);
    
     MatematicaEntidad N= new MatematicaEntidad();
    
    public MatematicaEntidad ingresarNumero(){
        
      
        
        System.out.println("ingresar un numero");
        N.setNum1(Math.random());
        
        System.out.println("el numero es " + N.getNum1());
        
        System.out.println("ingresar otro numero");
        N.setNum2(Math.random());
        
        System.out.println("el numero es " + N.getNum2());
       
       return N;
        
        
    }
    
    double NumeroMayor;
    
    public Double DevolverMayor(){
        
    System.out.println("averiguar cual es el numero mayor de los dos numeros creados");
       
     NumeroMayor=Math.max(N.getNum1(),N.getNum2());   
        
        System.out.println(NumeroMayor);
       
        return NumeroMayor;
     

    }
    
  
    double NumeroMenor=0;
    int redondearNumero2;
    int redondearNumero1;
    
    public double calcularPotencia(){
       
      System.out.println("redondear los numeros ingresados");
       
        redondearNumero1=(int) Math.round(N.getNum1());
        redondearNumero2=(int) Math.round(N.getNum2());
        
        System.out.println(redondearNumero1 + "-" + redondearNumero2);
        
       System.out.println("averiguar el menor numero elevado de la clase");
        
        NumeroMenor=Math.min(N.getNum1(),N.getNum2());  
        
        System.out.println(NumeroMenor);
       
   System.out.println("calcular la potencia del mayor valor de la clase elevado al menor numero");
   
        System.out.println(NumeroMayor + "-" + NumeroMenor);
   
    double numeroPotenciado=Math.pow(NumeroMayor,NumeroMenor);
    
    // System.out.println(numeroPotenciado);
       
      return numeroPotenciado ;
  
        
    }
    
   // c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
//Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número
    
    public double calcularRaiz(){
        
        System.out.println("redondear el numero menor de los dos valores");
  
    int redondearNumeroMenor=(int) Math.round(NumeroMenor);
       
        System.out.println(redondearNumeroMenor);
        
        
        System.out.println("calcular la raiz cuadrada de el numero menor");
        double raizCuadrada=Math.sqrt(NumeroMenor);
       
        return raizCuadrada;
       
        
    }
    
    
    
}
