/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OperacionServicio;

import OperacionEntidad.OperacionEntidad;
import java.util.Scanner;
/**
 *
 * @author LILIANA
 */
public class OperacionServicio {
    
 public   OperacionEntidad crearOperacion(){
     
     Scanner leer= new Scanner(System.in);
     
     OperacionEntidad O1=new OperacionEntidad();
     
     System.out.println("ingreae un numero");
     O1.setNumero1(leer.nextInt());
     
     System.out.println("ingreae otro numero ");
     O1.setNumero2(leer.nextInt());
     
     return O1;
 }
  
 
 public int sumar(OperacionEntidad O1){
     
  int Suma=(O1.getNumero1() + O1.getNumero2());
 
     return Suma;
  
}
    
 public int restar(OperacionEntidad O1){
     
 int Resta= (O1.getNumero1() - O1.getNumero2());
     return Resta;
  
}
 
 
 
 public int multiplicar(OperacionEntidad O1){
     
  int multiplicacion=(O1.getNumero1()*O1.getNumero2());
 
  if ((O1.getNumero1()==0 || O1.getNumero2()==0)){
    System.out.println("error");
    return 0;
  }else{
    return multiplicacion;
  }  
 }
  
  public double dividir(OperacionEntidad O1){
     
  int division=(O1.getNumero1() / O1.getNumero2());
 
  if ((O1.getNumero1()==0 || O1.getNumero2()==0)){
       System.out.println("error");
    return 0;
  }else{  
    return division;
  }  
 }

 
}