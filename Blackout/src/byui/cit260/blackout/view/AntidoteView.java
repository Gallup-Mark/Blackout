
package byui.cit260.blackout.view;

import byui.cit260.blackout.control.AntidoteControl;
import java.util.Scanner;

/**
 * 
 * @author mgallup
 */
public class AntidoteView {
    
    private final String promptMessage;
    private final String promptMessage2;
    
    double weightInPounds = this.getWeightInPounds();
    double medicineAmount = this.getMedicineAmount();
    
    public AntidoteView() {
            
            //promptMessage = "Please enter your weight in pounds"            
            this.promptMessage = "\nPlease enter your weight in pounds:"; 
           // promptMessage2 = "Please enter the number of tablets to ingest:"
            this.promptMessage2 = "Please enter the number of tablets to ingest:";
        int numberOfPills = 0;
            
            double weightinKilo = AntidoteControl.calcMedAmount(weightInPounds, numberOfPills);
            double medicineAmount = AntidoteControl.calcMedAmount(weightInPounds, numberOfPills);
    
         
            
            //display the banner when view is created
            this.displayBanner(); 
            
    
    }

    private void displayBanner() {
        System.out.println(
                   "\n***************************************************************"
                + "\n*                                                                                      *"
                + "\n* Would you like to administer the Antidote?                   *"
                + "\n*                                                                                      *"
                + "\n* The antidote comes in 500mg and 250mg tablets.       *"
                + "\n*                                                                                      *"
                + "\n* You must take 5mg per kilogram of your weight.           *"
                + "\n*                                                                                      *"
                + "\n* Enter your weight in pounds and the game will            *"
                + "\n* calculate your weight into kilograms.  And then              *"
                + "\n* mulitiply it by 5mg.                                                         *"
                + "\n* It is then up to you to decide how many pills to take.      *"
                + "\n* If you do not take enough, your life ends..                      *"
                + "\n*                                                                                          *"
                + "\n*******************************************************************");
                
        
    }

   public void displayAntidoteView() {
        
        

// System.out.println("\n*** calcMedAmont() function called ***");
    }

    private double getWeightInPounds() {
        Scanner keyboard = new Scanner(System.in);
        int value = 0;
        boolean valid = false;
        
        while (!valid) {
            System.out.println("\n" + this.promptMessage);
            
            value = keyboard.nextInt();
            
            if (value < 0 || value > 500) {
                System.out.println("\nInvalid value: Choose a correct value");
                continue;
            }
            break;
        }
        return value;
    }

    private double getMedicineAmount() {
         Scanner keyboard = new Scanner(System.in);
        int value = 0;
        boolean valid = false;
        
        while (!valid) {
            System.out.println("\n" + this.promptMessage2);
            
            value = keyboard.nextInt();
            
            if (value < 0 || value > 50) {
                System.out.println("\nInvalid value: Choose a correct value");
                continue;
            }
            break;
        }
        return value;
    }

    //void displayAntidoteView() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    



    

