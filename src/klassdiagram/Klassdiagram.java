/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package klassdiagram;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author afnka01
 */
public class Klassdiagram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in); 
        
        ArrayList<Form>formLista= new ArrayList<>();

        int val = 0; // Detta görs för att ge valet ett startvärde
        
        
        boolean mer = true;
        
        do {
            
            System.out.println("1. Rektangel ");
            System.out.println("2. Cirkel ");
            System.out.println("3. Triangel ");
            System.out.println("4. Skriv ut alla former ");
            System.out.println("0. För att avsluta ");
            val = input.nextInt();
                input.nextLine();
            switch (val) {
                case 1:
                    System.out.println(" Ange basen ");
                    int bas = input.nextInt();
                    System.out.println("Ange höjden: ");
                    int hojd = input.nextInt();
                    System.out.println("Ange y position: ");
                    int startY = input.nextInt();
                    System.out.println("Ange x position: ");
                    int startX = input.nextInt(); 
                    
                    Rektangel rekt = new Rektangel(startX,startY,bas,hojd,true);
                    formLista.add(rekt) ;
              
                    System.out.println();
                    break;
                    
                case 2:
                    System.out.println(" Ange radie ");
                    int radie = input.nextInt();
                    System.out.println("Ange x posion: ");
                    int x = input.nextInt();
                    System.out.println("Ange y position: ");
                    int y = input.nextInt();
                    
                    Cirkel cirk = new Cirkel(x, y, radie, true);
                    formLista.add(cirk) ;
              
                    System.out.println();
                    break;
             
                case 3:
                    System.out.println(" Ange Area ");
                    int triangelArea = input.nextInt();
                    System.out.println("Ange bas: ");
                    bas = input.nextInt();
                    System.out.println("Ange höjd: ");
                    hojd = input.nextInt();
                     System.out.println("Ange x position");
                     startX = input.nextInt();
                     System.out.println("Ange y position");
                     startY = input.nextInt();                    
                    
                    Triangel tri = new Triangel(startX,startY,bas,hojd,true);
                    formLista.add(tri) ;
              
                    System.out.println();
                    break;

                   case 4:
                   for(int i = 0; i < formLista.size(); i++) {
                        System.out.println(formLista 
                            + "\t" + formLista + "\t" 
                            + formLista + "\n");

                        System.out.println();
                    }
                    break;
                   case 0: 
                    System.out.println(""); 
                    mer = false;
                    break;
                    
                    
                    
 
                   // input.nextLine();
            }
        } while (mer);
    }
}
