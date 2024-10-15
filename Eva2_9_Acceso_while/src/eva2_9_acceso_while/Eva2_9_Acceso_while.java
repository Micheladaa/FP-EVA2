/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_9_acceso_while;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class Eva2_9_Acceso_while {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String usu="", pwd="";
        Scanner captu = new Scanner(System.in);
        
        
        
        while(!(usu.equals("admin") && pwd.equals("1234")) ){
        System.out.println("usuario: "); 
        usu = captu.nextLine();
        System.out.println("contraseña"); 
        pwd = captu.nextLine();  
        }
        
        //PROGRAMA PRINCIPAL
        System.out.println("PROGRAMA PRINCIPAL"); 
    }
    
}
