
package byui.cit260.blackout.control;

import byui.cit260.blackout.view.StreetMenuView;
import byui.cit260.blackout.view.StreetViewOne;

/**
 *
 * @author mgallup
 */
public class StreetMenuControl {
    
    // class instances
    //class menu for all subStreet Views
    
    private static String menu =  ("\n"
                + "\n----------------------------------------------------------"
                + "\n | Street Menu"
                + "\n----------------------------------------------------------"
                + "\n1 - Move to Street 1"
                + "\n2 - Move to Street 2"
                + "\n3 - Move to Street 3"
                + "\n4 - Move to Street 4"
                + "\n5 - Move to Street 5"
                + "\nQ - Back to Main Menu"
                + "\n-----------------------------------------------------------");
    
    private static StreetMenuView streetMenuView = new StreetMenuView();
    private static StreetViewOne streetViewOne = new StreetViewOne(menu);
    
    
    
    public static void showstreetViewOne(){
        streetViewOne.display();
        System.out.println(menu);
    }
    
    
    public static void showstreetMenu(){
        streetMenuView.display();
    }
    
}
