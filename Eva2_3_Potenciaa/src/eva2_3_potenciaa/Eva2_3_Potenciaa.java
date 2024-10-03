/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_3_potenciaa;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class Eva2_3_Potenciaa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int base, expo;
        
        Scanner captu = new Scanner (System.in);
        System.out.println("INTRODUCE LA BASE: ");
        base = captu.nextInt();
        captu.nextLine();
        
        System.out.println("INTRODUCE EL ECPONENTE: ");
        expo = captu.nextInt();
        captu.nextLine();
        
        int acum = 1;
        for(int i = 1; i<= expo; i++){
            acum = acum*base;
        }
        System.out.println("POTENCIA= " + acum);
    }
    
}
