/*
• Método crearNif(): le pide al usuario el DNI y con ese DNI calcula la letra que le
corresponderá. Una vez calculado, le asigna la letra que le corresponde según el
resultado del calculo.
• Método mostrar(): que nos permita mostrar el NIF (ocho dígitos, un guion y la letra en
mayúscula; por ejemplo: 00395469-F).
La letra correspondiente al dígito verificador se calculará a traves de un método que
funciona de la siguiente manera: Para calcular la letra se toma el resto de dividir el número
de DNI por 23 (el resultado debe ser un número entre 0 y 22). El método debe buscar en
un array (vector) de caracteres la posición que corresponda al resto de la división para
obtener la letra correspondiente.La tabla de caracteres es la siguiente:
POSICIÓN LETRA
0 T
1 R
2 W
3 A
4 G
5 M
6 Y
7 F
8 P
9 D
10 X
11 B
12 N
13 J
14 Z
15 S
16 Q
17 V
18 H
19 L
20 C
21 K
22 E
 */
package ej4extra.Servicio;

import ej4extra.Entidad.NIF;
import java.lang.reflect.Array;
import java.util.Scanner;




public class Servicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    
    NIF a= new NIF();
    
    public void crearNIF(){

        System.out.println("bienvenido,ingresar su numero de DNI : ");
        a.setDNI(leer.nextLong());
        
        String vectorLetras[]={"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S",
        "Q","V","H"," L"," C","K","E"};
        
        int nro= (int) (a.getDNI()%23);
        
        a.setLetra(vectorLetras[nro]);

}
 
    public void mostrar(){

        System.out.println("NIF : " + a.getDNI() + "-" + a.getLetra());

}
    
    
}
