/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aaaaaaa;

import java.util.Scanner;

/**
 *
 * @author crist
 */
public class Aaaaaaa {
   static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Ingresar 5 numeros ");
        int arrayNumeros[]= new int [5];                
        llenarArray(arrayNumeros);
        System.out.println("Tus números son: ");
        mostrarArray(arrayNumeros);
        System.out.println("Los números ordenados son : ");
        ordenamientoBurbuja(arrayNumeros);
        mostrarArray(arrayNumeros);
    }
    
    public static void ordenamientoBurbuja(int array[]){            
        for (int i = 0; i < array.length-1 ; i++) {                     
             for (int j = 0; j < array.length-i-1; j++) { //en este caso ahora el array tiene 2-0-1= solo 1 valor 
                System.out.println("Burbuajde dentro" +array[j+1]) ;
                if (array[j]> array[j+1]) { 
                    int temporal= array[j];
                    array[j] = array[j+1];
                    array[j+1] = temporal;
                }
               
            }
            }
            
        }      
    
    public static void llenarArray(int array[]){
        for (int i = 0; i < array.length; i++) {
            System.out.println("Ingrese el número "+ (i +1 )+" :");
            array[i] =sc.nextInt();
        }
    }
    public static void mostrarArray(int array[]){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " -- ");
        }
    }
    }
    

