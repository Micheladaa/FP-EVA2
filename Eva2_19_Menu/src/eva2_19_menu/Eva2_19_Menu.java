/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_19_menu;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class Eva2_19_Menu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String menu[];
        int precios[];
        int cant;
        
        Scanner captu = new Scanner(System.in);
        
        System.out.println("Cuantos productos tendra el menu: ");
        cant = captu.nextInt();
        captu.nextLine();
        
        menu = new String[cant];
        precios = new int[cant];
        for (int i = 0; i<menu.length; i++){
            System.out.println("Nombre del producto: ");
            menu[i] = captu.nextLine();
            System.out.println("Precio del producto: ");
            precios[i] = captu.nextInt();
            captu.nextLine();
            System.out.println("<<<<<<<<<MENU>>>>>>>>>>");
            System.out.println(i + "-" + menu[i] + " $" + precios[i]);
        }
         
        
    }
    
}
