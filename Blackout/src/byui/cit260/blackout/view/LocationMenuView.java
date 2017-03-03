
package byui.cit260.blackout.view;

import byui.cit260.blackout.control.BackPackControl;
import java.util.Scanner;
import java.util.Stack;
import byui.cit260.blackout.control.LocationControl;

/**
 *
 * @author Brian
 */
public class LocationMenuView extends View {
    
    //private String promptMessage = "";
    //private String menu = "";
    
    //private Stack itemList = BackPackControl
    
    public LocationMenuView(){
        super( "\n"
                + "\n----------------------------------------------------------"
                + "\n | Locaitons Menu"
                + "\n----------------------------------------------------------"
                + "\nW - Pharmacy Room 1"
                + "\nE - Pharmacy Room 2"
                + "\nR - Pharmacy Room 3"
                + "\nQ - Return to Game Menu"
                + "\n-----------------------------------------------------------");
    }
        
   
        
    @Override    
    public boolean doAction(String choice) {

            choice = choice.toUpperCase(); //convert choice to upper case
            
            switch (choice) {
                case "W" : //show Room 1 of Pharmacy
                    showPharmacyRoom1();
                    break;
                case "E" : //show Room 2 of Pharmacy
                    showPharmacyRoom2();
                    break;
                case "R" : //show Room 3 of Pharmacy
                    showPharmacyRoom3();
                    break;
                
                
                default :
                    System.out.println("\n*** Invalid selection, try again");
                    break;
            }
            return false;
    }
        
        
    private void showPharmacyRoom1(){
        LocationControl.showpharmacyViewOne(); 
        
        System.out.println(menu);
    }
    
    private void showPharmacyRoom2(){
        LocationControl.showpharmacyViewTwo();
        System.out.println(menu);
    }
    
    private void showPharmacyRoom3(){
        LocationControl.showpharmacyViewThree();  
        System.out.println(menu);
    }

    
    
}
