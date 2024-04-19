
//A continuación, en la clase main hacer lo siguiente:
//Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
//los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal, tiene
//sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la persona es
//mayor de edad.
//Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en
//distintas variables, para después en el main, calcular un porcentaje de esas 4 personas
//cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y
//también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores.


package javapooejercicio7aprendizaje;
import PersonaEntidad.PersonaEntidad;
import PersonaServicio.PersonaServicio;
import java.util.Scanner;


 
public class JavaPOOEjercicio7Aprendizaje {
    public static void main(String[] args ) {
       
       Scanner leer= new Scanner(System.in);
        
       PersonaServicio nuevaPersona= new PersonaServicio();
        
       PersonaEntidad p1=new PersonaEntidad();
       nuevaPersona.crearEntidad(p1);
       nuevaPersona.calcularImc(p1);
       nuevaPersona.mayoriaEdad(p1);
   
       System.out.println("----------------------------");
        
       PersonaEntidad p2=new PersonaEntidad();
       nuevaPersona.crearEntidad(p2);
       nuevaPersona.calcularImc(p2);
       nuevaPersona.mayoriaEdad(p2);
        
       System.out.println("----------------------------");
        
       PersonaEntidad p3=new PersonaEntidad();
       nuevaPersona.crearEntidad(p3);
       nuevaPersona.calcularImc(p3);
       nuevaPersona.mayoriaEdad(p3);
 
        
       System.out.println("----------------------------");
        
       PersonaEntidad p4=new PersonaEntidad();
       nuevaPersona.crearEntidad(p4);
       nuevaPersona.calcularImc(p4);
       nuevaPersona.mayoriaEdad(p4);
        
       System.out.println("----------------------------");
        
        
      PersonaEntidad p5=new PersonaEntidad();
      nuevaPersona.crearEntidad(p5);
      nuevaPersona.calcularImc(p5);
      nuevaPersona.mayoriaEdad(p5);
        
       
     System.out.println("----------------------------");
     
    
   
    double totalImcs;
    totalImcs=(nuevaPersona.calcularImc(p1) + nuevaPersona.calcularImc(p2) + nuevaPersona.calcularImc(p3) + nuevaPersona.calcularImc(p4) + nuevaPersona.calcularImc(p5));
     
    System.out.println("el total de los imcs con los conjuntos son :");
    System.out.println(totalImcs);
    
    
    
    int totalEdades;
    totalEdades=( p1.getEdad() +  p2.getEdad() + p3.getEdad()  + p4.getEdad() + p5.getEdad());
  
    System.out.println("el total de las edades juntas:");
    System.out.println(totalEdades);
  

        System.out.println("porcentaje de personas bajo peso ideal " + totalImcs * 20/100);
        System.out.println("porcentaje de personas en peso ideal " + totalImcs * 25 /100);
        System.out.println("porcentaje de oersonas con sobrepeso " + (100-((totalImcs * 25 /100 )+ (totalImcs * 20/100))));
     
        System.out.println("porcentaje de personas menor de edad " + totalEdades*18/100 + " %");
        System.out.println("porcentaje de personas mayores de edad " + (100-(totalEdades*18/100)) + " %") ;
    
    
     
    
  
        
    }
    
    
    
    
   } 

 
      

    
    

