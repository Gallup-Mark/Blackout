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
public class PharmacyViewThree extends PharmacyScene {
    
     public PharmacyViewThree(){
     

        
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
                +"\n ( # ) ( 3 )"
                +"\n  \\_/   \\_/");
        
        super.setDescription(" Pharmacy Room 3");
        super.setNumItems(3);
        super.setNonPlayers("Dr Stranger");
        
        
        
        
    }
    
}
