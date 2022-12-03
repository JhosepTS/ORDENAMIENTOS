
package Ordenacionporintercambio02;
//Jhosep TS

import java.util.Scanner;
public class burbuja {
   public static void main(String [] args){
     Scanner teclado= new Scanner(System.in);
     System.out.print(" Ingrese dimension del arreglo: ");
     int tam=teclado.nextInt();
     int arreglo[]= new int [tam]; 
     //Ingresando Valores al arreglo
     for(int i=0 ; i<arreglo.length; i++){
         System.out.print(" A [" +i+ "]= ");
         arreglo[i]=teclado.nextInt();
     }  
     Burbuja(arreglo);
     //Mostrando el arreglo Ordenado
     System.out.println("=====  ARREGLO ORDENADO  ====");
     for(int i =0; i<arreglo.length;i++){
         System.out.print(" \t "+arreglo[i]);
     } 
    }
    //Metodo de ordenamiento burbuja
     static void Burbuja(int arreglo[]){
     int i,j,aux;
     for(i=0;i<arreglo.length;i++){
  for(j=i+1;j<arreglo.length;j++){
   if(arreglo[i]>arreglo[j]){
    aux=arreglo[i];
    arreglo[i]=arreglo[j];
    arreglo[j]=aux;
   }
  }
 }   
}
}