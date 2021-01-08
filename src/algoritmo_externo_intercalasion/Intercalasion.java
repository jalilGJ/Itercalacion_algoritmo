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
public class Intercalasion {
    int i,j,temporal,pasadas;//variables que se utilizaran en el programa 

    public Intercalasion() {// metodo contructor
        this.i = 0;
        this.j = 0;
        this.temporal = 0;
        
    }
    //metodo de burbuja
    public void burbuja1(int[] arreglo){
        pasadas=0;
        for(i=0;i<arreglo.length;i++){// cuando i vale 0 y tiene que ser menor que el arreglo entonces que se incremente
            // este bucle  lo que va ser es ordenar los numeros, cuando j es igual a i que sume 1 entoces el arreglo j va ser menor al arreglo y que se incremente
            for(j=i+1;j<arreglo.length;j++){
                if(arreglo[i]>arreglo[j]){//  compara si el arreglo i es menor que el arreglo j 
                    temporal=arreglo[i]; // entonces el arreglo i pasa a ser temporal
                    arreglo[i]=arreglo[j];//  el arreglo j se almacena al arreglo i 
                    arreglo[j]=temporal;// el arreglo j pasa ser el temporal 
            }
                pasadas++; // se incrementa cuantas vueltas dio el programa para ordenar
            }
            
        }
        System.out.println("terminó en:" + pasadas +  " pasadas ");
    }
   
    // metodo de intercalacion 
    public void intercalacion(int [] arregloA,int []arregloB){//metodo para ordenar en un tercer vector resulatnte dos vectores
        int i,j,k;// se declara las variables propias del metodo 
        // se crea un arreglo que contenga el tamaño  del arreglo A mas el tamaño que tenga el arreglo b
        int arregloc[]=new int [arregloA.length+arregloB.length];
      
        
         for(i = j = k =0;i<arregloA.length && j<arregloB.length; k++){//  inicializar cuando i,j,k sea igual a cero ,  termina cuando i sea menor arreglo
// y ademas cuando j sea menor al arreglo B y incrementamos a k.
            if(arregloA[i]<arregloB[j]){// el numero que se encuantra en el arreglo a en la posicion i es menor lo que hay en el arreglo del indice j
                arregloc[k]=arregloA[i];// si los datos son correctos, se pasan al arreglo c y eso va ser igual al arreglo A
                 i++; // 
            }else{// si no resulta que son menores entonces 
                arregloc[k]=arregloB[j];// arreglo c va ser igual B
               
                j++;// se incrementa j que es el arreglo B
            }
                
        }  
            // para añadir a arreglo c los elementos del arreglo A sobrantes en caso de haberlos
         for(;i<arregloA.length;i++,k++){// espacio por si quedo algun lugar, se inializa en segundo lugar y se incrementan los ambos indices
         arregloc[k]=arregloA[i];//el arreglo c en k que es el indice de ese arreglo le pasamos lo que tenga el arreglo a en su indice i 
        }
         // para añadir a arreglo C los elementos  arreglo B sobrantes en caso de haberlos
         for(;j<arregloB.length;j++,k++){// espacio por si quedo algun lugar y se inializa en segundo lugar y se incrementan los ambos indices
         arregloc[k]=arregloB[j];
        }
         System.out.println("arreglo ordenado por el metodo de intercalacion :");
         mostrarArreglo(arregloc);//arreglo ordenado
    } 
         
    public void mostrarArreglo(int[]arreglo){// inserta un metodo para mostrar los datos
        int k; 
        for(k=0;k<arreglo.length;k++){
            System.out.print("["+arreglo[k]+"]");
            }
        System.out.println();
    }  
}
