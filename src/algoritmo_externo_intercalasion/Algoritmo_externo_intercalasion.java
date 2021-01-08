/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmo_externo_intercalasion;

/**
 *
 * @author PC7
 */
public class Algoritmo_externo_intercalasion {

 
    public static void main(String[] args) {
          Intercalasion ordenacion =new Intercalasion(); // se instancia 
    //se declaran los vectores
    int vector1[] ={3,6,8,9,0,4,7,8}; // se inserta los valores que va tener el vector 
    
    int vector2[]={1,2,5,10,22,43,56,99,100};//segundo vector
    System.out.println("arreglo vector 1 original: ");
    ordenacion.mostrarArreglo(vector1);// se llama al  metodo desde la subclase para que nos muestre el vector 
     
    System.out.println("arreglo vector 3 original: "); 
    ordenacion.mostrarArreglo(vector2); // metodo para mostrar el vector
   ordenacion.burbuja1(vector1);// metodo burbuja 
    ordenacion.burbuja1(vector2);
    ordenacion.intercalacion(vector1,vector2);// se inserta el metodo para ordenar los numeros previamente ordenados
    }
    
}
