/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_10_validar;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class Eva2_10_Validar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int diaSem;
        Scanner captu = new Scanner(System.in);
        
        do{
            System.out.println("INGRESA UN NUMERO DEL 1-7: ");
            diaSem = captu.nextInt();
            captu.nextLine();
        }while(diaSem<1 || diaSem>7);
        
        switch(diaSem){
            case 1:
                System.out.print("LUNES");
                break;
            case 2:
                System.out.print("MARTES");
                break;
            case 3:
                System.out.print("MIERCOLES");
                break;
            case 4:
                System.out.print("JUEVES");
                break;
            case 5:
                System.out.print("VIERNES");
                break;
            case 6:
                System.out.print("SABADO");
                break;
            case 7:
                System.out.print("DOMINGO6");
                break;
            
        }
        
        
    }
    }
    

