/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_12_numero_mayor;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class Eva2_12_Numero_Mayor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num, numGrande=-99999;
        Scanner captu = new Scanner(System.in);
        
        do{
            System.out.println("INGRESA UN NUMERO ENTERO: ");
            num = captu.nextInt();
            captu.nextLine();
            if(num>numGrande){
                numGrande=num;
            }
        }while(num<-1 || num>-1);
        
        System.out.println("EL NUMERO MAS GRANDE ES: "+numGrande);
    }
    
}
