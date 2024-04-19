/*
• Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima.
• Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.
• Método vaciarCafetera(): pone la cantidad de café actual en cero.
• Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada.
 */
package CafeteraServicio;

import CafeteraEntidad.CafeteraEntidad;
import java.util.Scanner;

public class CafeteraServicio {

    Scanner leer = new Scanner(System.in);

    public CafeteraEntidad llenarCafetera(CafeteraEntidad taza) {
        taza.setCantidadActual(taza.getCapacidadMaxima());
        return taza;
    }

    public void llenarTaza(CafeteraEntidad taza) {

        int tazaVacia = 200;
        String respuesta = "";

        System.out.println("llenar la taza");
        System.out.println("queres llenar la taza?");
        respuesta = leer.next();

        if ("si".equals(respuesta)) {

            if (taza.getCantidadActual() >= tazaVacia) {

                taza.setCantidadActual(taza.getCantidadActual() - tazaVacia);
                System.out.println("la cantidad actual de cafe dispobile en la cafetera es ");
                System.out.println(taza.getCantidadActual());

            } else {

                System.out.println("se servira lo que que queda de cafe " + taza.getCantidadActual());

                taza.setCantidadActual(0);

            }
        } else {
            System.out.println("elija otra opcion");

        }

    }

    public void vaciarCafetera(CafeteraEntidad taza) {
        taza.setCantidadActual(0);
        System.out.println("la taza esta vacia  " + taza.getCantidadActual());
    }

    public void AgregarCafe(CafeteraEntidad taza) {

        int cafeServido;

        System.out.println("cuanto cafe quiera que le sirvan?");
        cafeServido = leer.nextInt();

        if ((cafeServido + taza.getCantidadActual()) <= taza.getCapacidadMaxima()) {

            taza.setCantidadActual(cafeServido + taza.getCantidadActual());

            System.out.println("la cafetera tiene " + taza.getCantidadActual());
        } else {

            System.out.println("rebalso la cafetera,no se ingreso la cantidad requerida");

        }

    }

}
