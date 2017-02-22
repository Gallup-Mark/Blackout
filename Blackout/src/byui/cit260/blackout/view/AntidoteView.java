
package byui.cit260.blackout.view;

import byui.cit260.blackout.control.AntidoteControl;
import java.util.Scanner;

/**
 * 
 * @author mgallup
 */
public class AntidoteView {
    
    private  final String promptMessage = "\nPlease enter your weight in pounds";
    private final String promptMessage2 = "Please enter the number of pills to ingest";
    
    double weightInPounds = 0;
    double medicineAmount = 0;
    double numberOfPills = 0;
    
    public AntidoteView() {
            
                   //display the banner when view is created
            this.displayBanner(); 
            
           
            weightInPounds = getWeightInPounds();
            //double weightinKilo = AntidoteControl.calcMedAmount(weightInPounds);
            
            medicineAmount = AntidoteControl.calcMedAmount(weightInPounds);
            //System.out.println(medicineAmount);
            numberOfPills = numberOfPills();
            
            // Verify number of pills = medicine amount
            boolean doILive = AntidoteControl.testAntidote(medicineAmount, numberOfPills);
            System.out.println(doILive);
    
    }

    private void displayBanner() {
        System.out.println(
                   "\n***********************************************************"
                + "\n* Would you like to administer the Antidote?"
                + "\n"
                + "\n* The antidote comes in 500mg  tablets."
                + "\n"
                + "\n* You must take 5mg per kilogram of your weight.*"
                + "\n"
                + "\n* Enter your weight in pounds and the game wil*"
                + "\n* calculate your weight into kilograms.  And the*"
                + "\n* mulitiply it by 5mg."
                + "\n* It is then up to you to decide how many pills to take."
                + "\n* If you do not take enough, your life ends."
                + "\n"
                + "\n************************************************************");
                
        
    }

   public void displayAntidoteView() {
        
        

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
    
    private double numberOfPills() {
        Scanner keyboard = new Scanner(System.in);
        int value = 0;
        boolean valid = false;
        
        while (!valid) {
            System.out.println("\n" + this.promptMessage2);
            
            value = keyboard.nextInt();
            
            if (value < 0 || value > 500) {
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
    



    

