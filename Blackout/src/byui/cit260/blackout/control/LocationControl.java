/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.blackout.control;

import byui.cit260.blackout.view.*;

/**
 *
 * @author Brian
 */
public class LocationControl {
    
    
    //this is where we make an instance of each sence
    
    public static PharmacyViewOne pharmacyViewOne = new PharmacyViewOne();
    public static  PharmacyViewTwo pharmacyViewTwo = new PharmacyViewTwo();
    public static PharmacyViewThree pharmacyViewThree = new PharmacyViewThree();
    
    public static void showpharmacyViewOne(){
        pharmacyViewOne.displayMapSymbol();
        pharmacyViewOne.display();
        
        
    }
    
    public static void showpharmacyViewTwo(){
        pharmacyViewTwo.displayMapSymbol();
        pharmacyViewTwo.display();
    }
    
    public static void showpharmacyViewThree(){
        pharmacyViewThree.displayMapSymbol();
        pharmacyViewThree.display();
    }
    
    
}



