
package LibroServicio;

import LibroEntidad.LibroEntidad;
import java.util.Scanner;
/**
 *
 * @author LILIANA
 */
public class LibroServicio {
  
  Scanner leer= new Scanner(System.in);
  
  
  
      
   public String nombre;
   public String apellido;
   public int edad;
   public int dni;
   
   
   
   
      public String getNombre() {
        return nombre;
    }

   public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }
    
    
    
    public LibroServicio ingresoUsuario(){
        
      LibroServicio Usuario= new LibroServicio ();
       
     
        System.out.print("ingrese su nombre: ");
        Usuario.setNombre(leer.nextLine());
        System.out.print("ingrese su apellido: ");
        Usuario.setApellido(leer.nextLine());
        System.out.print("ingrese su edad: ");
        Usuario.setEdad(leer.nextInt());
        System.out.print("ingrese su nro de dni: ");
        Usuario.setDni(leer.nextInt());
        
        return Usuario;
        
        
    }
          
    
    
    public  LibroEntidad cargarDatosUsuario(){
        

        
        LibroEntidad UsuarioData= new LibroEntidad ();
        
        System.out.print("nombre de titulo del libro: ");
        UsuarioData.setTitulo(leer.next());
        System.out.print("nombre de autor: ");
        UsuarioData.setAutor(leer.next());
        System.out.print("ISBN: ") ;
        UsuarioData.setISBN(leer.nextInt());
       System.out.print("Nro de Paginas: ");
        UsuarioData.setNroPaginas(leer.nextInt());
     
        return UsuarioData;
        
    }

  
}
