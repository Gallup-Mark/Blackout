/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.blackout.view;

/**
 *
 * @author mgall
 */
public class PharmacyViewTwo extends PharmacyScene {
 
     public PharmacyViewTwo(){
     

        
        super.setMapSymbol("\n"
                + "\n        (_)"
                + "\n _______//"
                + "\n(________)"
                + "\n \\      /"
                + "\n  |    |"
                + "\n /______\\"
                + "\n(________)"
                +"\n   _     _"  
                +"\n  / \\   / \\" 
                +"\n ( # ) ( 2 )"
                +"\n  \\_/   \\_/");
        
        super.setDescription(" Pharmacy Room 2");
        super.setNumItems(2);
        super.setNonPlayers("Customer Bob");
        
       
        
        
    }
    
    
}
