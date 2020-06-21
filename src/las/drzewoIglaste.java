/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package las;

import java.util.Random;

/**
 *
 * @author micha
 */
public class drzewoIglaste {
    Random ileDrzew = new Random();
    Random pnie = new Random();
    Random ileGalezi = new Random();
    Random ileLisc = new Random();
    int iloscDrzew = ileDrzew.nextInt(300);
    int pien;
    int galezie;
    int liscie;
 
   
 
        
      public void rosnij()
{    
        
           for (int i = 0; i<iloscDrzew; i++)
        {
            pien = pnie.nextInt(200);
            galezie = ileGalezi.nextInt(200);
            liscie = ileLisc.nextInt(400);
            
            System.out.println("Drzewa Iglaste: "+ (i+1) +" z "+ iloscDrzew + " Średnica pnia: " + pien + "cm" +" Ilość galezi: " + galezie + " Ilość liści: "+ liscie );
           
        }
}
}