/*
Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos:
numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero). Las
operaciones asociadas a dicha clase son:
//a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
//b) Agregar los métodos getters y setters correspondientes
//c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.

 */
package CuentaEntidad;


public class CuentaEntidad {
    
    public int numeroCuenta;
    public long Dni;
    public double saldoActual;
    public double interes;
    public String Nombre;
    public String Apellido;
    public int contraseña;

    public CuentaEntidad() {
    }

    public CuentaEntidad(int numeroCuenta, long Dni, double saldoActual, double interes, String Nombre, String Apellido, int contraseña) {
        this.numeroCuenta = numeroCuenta;
        this.Dni = Dni;
        this.saldoActual = saldoActual;
        this.interes = interes;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.contraseña = contraseña;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getDni() {
        return Dni;
    }

    public void setDni(long Dni) {
        this.Dni = Dni;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public int getContraseña() {
        return contraseña;
    }

    public void setContraseña(int contraseña) {
        this.contraseña = contraseña;
    }

    @Override
    public String toString() {
        return "{" + "numeroCuenta=  " + numeroCuenta + ", Dni=  " + Dni + ", saldoActual=  " + saldoActual + ", interes=  " + interes + ", Nombre=  " + Nombre + ", Apellido=  "  + Apellido + ", contrasenia= " + contraseña + '}';
    }

    
  }