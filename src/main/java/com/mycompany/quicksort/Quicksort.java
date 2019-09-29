/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.quicksort;
import java.util.Arrays;
/**
 *
 * @author Armando
 */
public class Quicksort {
    
    public static void main(String[] args) {
        int[] listaNumeros = { 2, 10, 100, 50, 1 };
        quicksort(listaNumeros, 0, listaNumeros.length - 1);
        System.out.println("Array [ 2, 10, 100, 50, 1 ] ordenado: " + Arrays.toString(listaNumeros));
    }

public static void quicksort(int A[], int izq, int der) {

  int pivote=A[izq]; // tomamos primer elemento como pivote
  int i=izq; // i realiza la búsqueda de izquierda a derecha
  int j=der; // j realiza la búsqueda de derecha a izquierda
  int aux;
 
  while(i<j){            // mientras no se crucen las búsquedas
     while(A[i]<=pivote && i<j) i++; // busca elemento mayor que pivote
     while(A[j]>pivote) j--;         // busca elemento menor que pivote
     if (i<j) {                      // si no se han cruzado                      
         aux= A[i];                  // los intercambia
         A[i]=A[j];
         A[j]=aux;
     }
   }
   A[izq]=A[j]; // se coloca el pivote en su lugar de forma que tendremos
   A[j]=pivote; // los menores a su izquierda y los mayores a su derecha
   if(izq<j-1)
      quicksort(A,izq,j-1); // ordenamos subarray izquierdo
   if(j+1 <der)
      quicksort(A,j+1,der); // ordenamos subarray derecho
}


}