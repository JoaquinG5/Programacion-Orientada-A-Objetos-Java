//En el main se creará el objeto y se le pedirá al usuario que ingrese una frase
//que puede ser una palabra o varias palabras separadas por un espacio en blanco y a
//través de los métodos set, se guardará la frase y la longitud de manera automática según
//la longitud de la frase ingresada. 

package javapooejercicio8aprendizaje;

import CadenaEntidad.CadenaEntidad;
import CadenaServicio.CadenaServicio;
import java.util.Scanner;




public class JavaPOOEjercicio8Aprendizaje {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        CadenaServicio C1 = new CadenaServicio();

        CadenaEntidad C2 = C1.ingresarFrase();
        C1.mostrarVocales(C2);
        C1.invertirFrase(C2);
        C1.vecesRepetido(C2);
        C1.compararLongitud(C2);
        C1.unirFrases(C2);
        C1.reemplazar(C2);
        C1.contenerLetra(C2);
       
        System.out.println( C1.contenerLetra(C2));

    }
}
