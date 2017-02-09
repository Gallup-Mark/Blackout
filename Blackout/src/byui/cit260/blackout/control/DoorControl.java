
package byui.cit260.blackout.control;

/**
 *
 * @author Team Blackout
 */
public class DoorControl {
    
    public static double breakDoorOpen(double playerWeight, double playerForce, double doorWeight, double doorWidth, double doorHeight) {
    
            if (doorHeight <=0) { //doorHeight is negative?
                return -1;
            }
            if (playerWeight <=0) { //playerWeight is negative?
                return -2;
            }
            if (playerForce <=0) { //playerForce is negative?
                return -3;
            }
            if (doorWeight <=0) { //doorWeight is negative?
                return -4;
            }
            if (doorWidth <=0) { //doorWidth is negative?
                return -5;
            }
            
            double force = (playerForce * playerWeight)/20;
            double doorMass = doorHeight * doorWidth * doorWeight;
            
            if (force <= 0 ) {
                return -6;
            }
            
            if (force >= doorMass) {
                return 1;
            }
            
            else {
                return 0;
            }

            
    }
    
}
