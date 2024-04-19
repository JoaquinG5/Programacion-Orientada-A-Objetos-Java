/*Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de String)
y su longitud. 
 */
package CadenaEntidad;


public class CadenaEntidad {
    
    public String frase;
    public int longitudFrase;

    public CadenaEntidad() {
    }

    public CadenaEntidad(String frase, int longitudFrase) {
        this.frase = frase;
        this.longitudFrase = longitudFrase;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getLongitudFrase() {
        return longitudFrase;
    }

    public void setLongitudFrase(int longitudFrase) {
        this.longitudFrase = longitudFrase;
    }

    
    
}
