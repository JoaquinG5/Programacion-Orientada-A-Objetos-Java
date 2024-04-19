/*
Realizar una clase llamada Matemática que tenga como atributos dos números reales con
los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener un
constructor vacío, parametrizado y get y set. 
 */
package MatematicaEntidad;


public class MatematicaEntidad {
    
    public double num1;
    public double num2;
   
    public MatematicaEntidad() {
    }

    public MatematicaEntidad(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    @Override
    public String toString() {
        return "{" + "num1=  " + num1 + ", num2=  " + num2 + '}';
    }

    
    
    
    
    
}
