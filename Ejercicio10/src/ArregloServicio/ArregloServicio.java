/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArregloServicio;

import ArregloEntidad.ArregloEntidad;
import java.util.Arrays;
import java.util.Scanner;


public class ArregloServicio {

    Scanner leer = new Scanner(System.in);

    ArregloEntidad a1 = new ArregloEntidad();

    double[] ArregloA = new double[50];

    double[] ArregloB = new double[20];

    public void crearArreglos() {

        System.out.println("imprimir por pantalla al arreglo A relleno con numeros aleatorios");

        for (int i = 0; i < 50; i++) {
            ArregloA[i] = Math.random();
        }

        for (int i = 0; i < 50; i++) {
            System.out.println(ArregloA[i]);
        }

        //  System.out.println(ArregloA);
        // return ArregloA;
    }

    public void ordenarArreglo() {

        System.out.println("ordenar Arreglo A de menor a mayor");

        Arrays.sort(ArregloA);

        for (int i = 0; i < 50; i++) {
            System.out.println(ArregloA[i]);

        }

    }
    //copiar los primeros 10 números
//ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor
//0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de
//20.

    public void copiarNumeros() {

        System.out.println("copiar los primeros 10 numeros ordenados al arreglo b de 20 elementos");
        System.out.println("------------------");
        
        
        for (int i = 0; i < 10; i++) {
               if (i < 10) {
            ArregloB[i] = ArregloA[i];
           } else {
            ArregloB[i] = 0.5;
          }           
          System.out.println("Posición Nº: " + i + " [" + ArregloB[i] + "]");
        }
        System.out.println("");

       
            for (int i = 0; i < 20; i++) {
        System.out.println(ArregloB[i]);
        
      }
            
//        System.out.println("otra forma de hacerlo es usar un for y el comando arrays fill");   
//            
//             for (int i = 0; i < 10; i++) {
//                  ArregloB[i] = ArregloA[i];
//             }
//              System.out.println("");
//
//        Arrays.fill(ArregloB, 10, 20, 0.5);
//        for (int i = 0; i < 20; i++) {
//        System.out.println(ArregloB[i]);
//        
//      }
//        
        
        System.out.println("imprimir los arrays");
      
        for (int i = 0; i < 50; i++) {
            System.out.println(ArregloA[i]);

        
        }
        
        
         System.out.println("------------------");
         
          System.out.println("------------------");
        
           for (int i = 0; i < 20; i++) {
         
        System.out.println(ArregloB[i]);
        
        }
       
        
}
}