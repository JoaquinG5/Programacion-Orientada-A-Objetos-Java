/*
 Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
objeto.
d) Método area(): para calcular el área de la circunferencia (area = pi ∗ (radio*radio)).
e) Método perimetro(): para calcular el perímetro (perimetro = 2 ∗ pi ∗ radio).
 */
package CircunferenciaEntidad;


public class CircunferenciaEntidad {
    
    private int radio;
    public double pi;

    public CircunferenciaEntidad() {
    }

    public CircunferenciaEntidad(int radio, double pi) {
        this.radio = radio;
        this.pi = pi;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public double getPi() {
        return pi;
    }

    public void setPi(double pi) {
        this.pi = pi;
    }

    @Override
    public String toString() {
        return "CircunferenciaEntidad{" + "radio=" + radio + ", pi=" + pi + '}';
    }

  
    
}
