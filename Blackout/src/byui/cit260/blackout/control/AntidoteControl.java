package byui.cit260.blackout.control;

/**
 *
 * @author mgallup
 */
public class AntidoteControl {
    
public static double calcMedAmount(double weightInPounds, int numberOfPills) {
    
            double weightInKilo = (weightInPounds * 0.4535);
            double medicineAmount = (weightInKilo * 5);
    
            if (weightInPounds <=0) { //weightInPounds is negative?
                return -1;
            }
            if (numberOfPills <=0) { //numberOfPills is negative?
                return -2;
            }

            if (weightInKilo <= 0 ) { //weightInKilo is negative?
                return -3;
            }
            
            if (medicineAmount <=0) { //medicineAmount is negative?
                return -4;
            }
            
            else {
                return medicineAmount;
            }

            
    }
    
}
