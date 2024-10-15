/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_8_acceso;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class Eva2_8_Acceso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String usu, pwd;
        Scanner captu = new Scanner(System.in);
        //PANTALLA DE VALIDACION: USUARIO Y CONTRASEÑA
        do{ 
          System.out.println("usuario: "); 
        usu = captu.nextLine();
        System.out.println("contraseña"); 
        pwd = captu.nextLine();  
        }while(!(usu.equals("admin") && pwd.equals("1234")) );
        
        //PROGRAMA PRINCIPAL
        System.out.println("PROGRAMA PRINCIPAL"); 
        
        
    }
    
}
