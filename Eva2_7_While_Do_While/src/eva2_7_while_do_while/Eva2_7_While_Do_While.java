/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_7_while_do_while;

/**
 *
 * @author invitado
 */
public class Eva2_7_While_Do_While {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //FOR-------> SABEMOS LA CANTIDAD DE REPETICIONES
        //WHILE/DO WHILE-----> NO SABEMOS LA CANTIDAD
        System.out.println("WHILE");
        int val =1;
        while(val <= 10){//MIENTRAS (ESTO SEA VERDAD) (REPITE ESTAS INSTRUCCIONES)
            System.out.print(val + "-");
            val++;
            
        }
        //DO WHILE
        System.out.println("");
        System.out.println("DO WHILE");
        int vals =1;
        do{
          System.out.print(vals + "-");
            vals++;  
        }while(vals <= 10);//REPETIR (ESTAS INSTRUCCIONES) MIENTRAS (ESTO SEA VERDAD)
        
    }
    
}
