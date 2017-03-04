
package byui.cit260.blackout.control;

import byui.cit260.blackout.view.StreetMenuView;
import byui.cit260.blackout.view.StreetViewOne;

/**
 *
 * @author mgallup
 */
public class StreetMenuControl {
    
    // class instances
    public static StreetMenuView streetMenuView = new StreetMenuView();
    public static StreetViewOne streetViewOne = new StreetViewOne();
    
    
    public static void showstreetViewOne(){
        
    }
    
    
    public static void showstreetMenu(){
        streetMenuView.display();
    }
    
}
