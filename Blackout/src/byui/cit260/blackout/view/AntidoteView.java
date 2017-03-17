package byui.cit260.blackout.view;

import byui.cit260.blackout.control.AntidoteControl;
import byui.cit260.blackout.exceptions.AntidoteControlException;
import static java.lang.Integer.parseInt;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mgallup
 */
public class AntidoteView {

    private final String promptMessage = "\nPlease enter your weight in pounds";
    private final String promptMessage2 = "\nPlease enter the number of pills to ingest";
    private final String promptMessage3 = "\nYou took the correct amount of antidote, Continue the game";
    private final String promptMessage4 = "\nYou took too many pills. You are dead! Game Over!";

    double weightInPounds = 0;
    double medicineAmount = 0;
    double numberOfPills = 0;

    public AntidoteView() throws AntidoteControlException {

        //display the banner when view is created
        this.displayBanner();

        //double weightinKilo = AntidoteControl.calcMedAmount(weightInPounds);
        boolean done = false;
        while (!done) {
            try {
                weightInPounds = getWeightInPounds();
                medicineAmount = AntidoteControl.calcMedAmount(weightInPounds);
                numberOfPills = numberOfPills();
                done = true;
            } catch (AntidoteControlException ex) {
                System.out.println(ex.getMessage());

            }
        }
        boolean doILive = AntidoteControl.testAntidote(medicineAmount, numberOfPills);
        if (doILive) {
            System.out.println(promptMessage3);

        } else {
            System.out.println(promptMessage4);

            MainMenuView mainMenuView = new MainMenuView();
            mainMenuView.display();
        }

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
                + "\n* Enter your weight in pounds and the game will*"
                + "\n* calculate your weight into kilograms.  And then*"
                + "\n* mulitiply it by 5mg."
                + "\n"
                + "\n* It is then up to you to decide how many pills to take."
                + "\n* If you do not take enough, your life ends."
                + "\n"
                + "\n************************************************************");

    }

    public void displayAntidoteView() {

    }

    private double getWeightInPounds() throws AntidoteControlException {
        Scanner keyboard = new Scanner(System.in);
        String value;
        int number = 0;
        boolean valid = false;

        while (!valid) {
            System.out.println("\n" + this.promptMessage);

            value = keyboard.next();

            try {
                number = parseInt(value);
            } catch (NumberFormatException nf) {
                System.out.println("\nInvalid input. Please enter a valid weight:");
                continue;
            }

            if (number < 0 || number > 500) {
                System.out.println("\nInvalid value: Choose a correct value");
                continue;
            }
            break;
        }
        return number;
    }

    private double numberOfPills() throws AntidoteControlException {
        Scanner keyboard = new Scanner(System.in);
        String value;
        int number = 0;
        boolean valid = false;

        while (!valid) {
            System.out.println("\n" + this.promptMessage2);

            value = keyboard.next();

            try {
                number = parseInt(value);
            } catch (NumberFormatException nf) {
                System.out.println("\nInvalid input. Please enter a valid number:");
                continue;
            }

            if (number <= 0 || number > 500) {
                System.out.println("\nInvalid value: Choose a correct value");
                continue;
            }
            break;
        }
        return number;
    }

}
