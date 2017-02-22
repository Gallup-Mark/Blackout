package byui.cit260.blackout.control;

/**
 *
 * @author mgallup
 */
public class AntidoteControl {
    
public static double calcMedAmount(double weightInPounds) {
    
            double weightInKilo = (weightInPounds * 0.4535);
            System.out.println("Your weight in kilograms is " + weightInKilo);
            double medicineAmount = (weightInKilo * 5);
            medicineAmount = Math.round(medicineAmount);
    
            if (weightInPounds <=0) { //weightInPounds is negative?
                return -1;
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
    
public static boolean testAntidote(double medicineAmount, double takenMedicineAmount) {
        boolean answer = false;
            if (medicineAmount == takenMedicineAmount) {
                answer = true;
            }
            
            return answer;

        }


}

