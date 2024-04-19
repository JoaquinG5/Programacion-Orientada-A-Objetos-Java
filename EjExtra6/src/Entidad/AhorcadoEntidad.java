/*

• Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima. Con
la palabra del usuario, pone la longitud de la palabra, como la longitud del vector.
Después ingresa la palabra en el vector, letra por letra, quedando cada letra de la
palabra en un índice del vector. Y también, guarda en cantidad de jugadas máximas, el
valor que ingresó el usuario y encontradas en 0.

• Método buscar(letra): este método recibe una letra dada por el usuario y busca sila
letra ingresada es parte de la palabra o no. También informará si la letra estaba o no.
• Método encontradas(letra): que reciba una letra ingresada por el usuario y muestre
cuantas letras han sido encontradas y cuantas le faltan. Este método además deberá
devolver true si la letra estaba y false si la letra no estaba, ya que, cada vez que se
busque una letra que no esté, se le restará uno a sus oportunidades.
• Método intentos(): para mostrar cuantas oportunidades le queda al jugador.
• Método juego(): el método juego se encargará de llamar todos los métodos
previamente mencionados e informará cuando el usuario descubra toda la palabra o
se quede sin intentos. Este método se llamará en el main.




 */
package Entidad;

/**
 
 */
public class AhorcadoEntidad {
    
    public String palabra;
   public String []palabraABuscar;
    public String letrasEncontradas;
    public int jugadasMaximas;

    public AhorcadoEntidad() {
    }

    public AhorcadoEntidad(String palabra, String[] palabraABuscar, String letrasEncontradas, int jugadasMaximas) {
        this.palabra = palabra;
        this.palabraABuscar = palabraABuscar;
        this.letrasEncontradas = letrasEncontradas;
        this.jugadasMaximas = jugadasMaximas;
    }

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    public String[] getPalabraABuscar() {
        return palabraABuscar;
    }

    public void setPalabraABuscar(String[] palabraABuscar) {
        this.palabraABuscar = palabraABuscar;
    }

    public String getLetrasEncontradas() {
        return letrasEncontradas;
    }

    public void setLetrasEncontradas(String letrasEncontradas) {
        this.letrasEncontradas = letrasEncontradas;
    }

    public int getJugadasMaximas() {
        return jugadasMaximas;
    }

    public void setJugadasMaximas(int jugadasMaximas) {
        this.jugadasMaximas = jugadasMaximas;
    }

    @Override
    public String toString() {
        return "AhorcadoEntidad{" + "palabra=" + palabra + ", palabraABuscar=" + palabraABuscar + ", letrasEncontradas=" + letrasEncontradas + ", jugadasMaximas=" + jugadasMaximas + '}';
    }

   
    
    
    
    
    
    
    
}
