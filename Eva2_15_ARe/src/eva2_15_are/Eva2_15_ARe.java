/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_15_are;

/**
 *
 * @author invitado
 */
public class Eva2_15_ARe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //DECLARACIÓN DE ARREGLOS
        int[] arreglo = new int[10];
        
        
        //manejo por indices
        //Primer elemento de un arreglo es el 0
        arreglo[0] = 100;
        arreglo[1] = 200;
        arreglo[2] = 300;
        arreglo[3] = 400;
        arreglo[4] = 500;
        arreglo[5] = 600;
        arreglo[6] = 700;
        arreglo[7] = 800;
        arreglo[8] = 900;
        
        //Ultimo elemento de un arreglo --> TAMAÑO - 1
        arreglo[9]= 1000;
        
        //El acceso siempre es a traves de las posiciones
        System.out.println(arreglo[0]);
        System.out.println(arreglo[1]);
        System.out.println(arreglo[2]);
        System.out.println(arreglo[3]);
        System.out.println(arreglo[4]);
        System.out.println(arreglo[5]);
    }
    
}
