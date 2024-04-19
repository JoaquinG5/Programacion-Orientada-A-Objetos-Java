/*
• Metodo crearPersona(): el método crear persona, le pide los valores de los atributos al
usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o O.
Si no es correcto se deberá mostrar un mensaje
• Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, significa
que la persona está por debajo de su peso ideal y la función devuelve un -1. Si la
fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona
está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado de la
fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
función devuelve un 1.
• Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve
un booleano.
 */
package PersonaServicio;

import PersonaEntidad.PersonaEntidad;
import java.util.Scanner;


public class PersonaServicio {

    Scanner leer = new Scanner(System.in);

    public void crearEntidad(PersonaEntidad p1) {

        System.out.print("nombre");
        p1.setNombre(leer.next());

        System.out.println("el nombre es " + p1.getNombre());

        System.out.print("edad");
        p1.setEdad(leer.nextInt());

        System.out.println("la edad es " + p1.getEdad());

        System.out.print("peso");
        p1.setPeso(leer.nextDouble());

        System.out.println("el peso es " + p1.getPeso());

        System.out.print("altura");
        p1.setAltura(leer.nextDouble());

        System.out.println("la altura es " + p1.getAltura());

        System.out.println("sexo: 1-h , 2- m , 3- o");

        int s = leer.nextInt();

        do {
            switch (s) {
                case 1:
                    p1.setSexo("h");
                    break;
                case 2:
                    p1.setSexo("m");
                    break;
                case 3:
                    p1.setSexo("o");
                    break;
                default:

                    System.out.println("opcion no valida");
                    break;
            }
        } while (s > 3 && s <= 0);

        System.out.println("el sexo es " + p1.getSexo());
    }

    public double calcularImc(PersonaEntidad p1) {

        System.out.println(" peso " + p1.getPeso());

        int contador;

        double imc = p1.getPeso() / (p1.getAltura() * p1.getAltura());

        if (imc < 20) {
            System.out.println("bajo del peso ideal");
            contador = -1;
        } else if (imc >= 20 && imc <= 25) {
            System.out.println("peso ideal");
            contador = 0;

        } else {
            System.out.println("sobrepeso");
            contador = 1;
        }
        return imc;

    }

    public void mayoriaEdad(PersonaEntidad p1) {

        boolean MayoriaEdad = false;

        System.out.println("cual es su edad");
        System.out.println(p1.getEdad());

        if (p1.getEdad() > 18) {
            MayoriaEdad = true;
            System.out.println("ud es mayor de edad");
        } else {
            System.out.println("ud es menor de edad");
        }
        


    }

}
