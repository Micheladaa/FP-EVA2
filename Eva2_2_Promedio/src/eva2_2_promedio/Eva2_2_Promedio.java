/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_2_promedio;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class Eva2_2_Promedio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int califa, acum;
       
        Scanner captu = new Scanner(System.in);
        acum = 0;
        
        /*System.out.println("INTRODUCE UNA CALIFICACION");
        califa = captu.nextInt();
        captu.nextLine();*/
        
        for(int i = 1; i <= 10; i++){
        System.out.println("ESTUDIANTE #" + i);
        System.out.println("INTRODUCE UNA CALIFICACION:");
        califa = captu.nextInt();
        captu.nextLine();
        acum = acum + califa;
        }
        System.out.println("TODAS LAS CALIFICACIONES SUMADAS SON: " + acum );
        double prom = acum/10;
        System.out.println("PROMEDIO: " + prom);
    }
    
}
