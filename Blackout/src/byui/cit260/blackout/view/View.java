package byui.cit260.blackout.view;

import java.util.Scanner;

/**
 *
 * @author Team Blackout
 */
public abstract class View implements ViewInterface {

    //protected String displayMessage;
    protected String promptMessage = "\nPlease enter an option:";
    protected String menu;

    public View(String theMenu) {
        this.menu = theMenu;

    }

    @Override
    public void display() {
        boolean done = false; // set flag to not done
        do {
            // prompt for and get players name
            String value = this.getInput();
            if (value.toUpperCase().equals("Q")) //user wants to quit
            {
                break; // exit the game
            }
            // do the requested action and display the next view
            done = this.doAction(value);

        } while (!done);

    }

    @Override
    public String getInput() {

        Scanner keyboard = new Scanner(System.in); // get infile for keyboard
        String value = ""; //value to be returned
        boolean valid = false; // intialize to not valid

        while (!valid) { // loop while an invalid va;lue is entered
            System.out.println(menu);
            System.out.println("\n" + this.promptMessage);

            value = keyboard.nextLine(); // get next line typed on keyboard
            value = value.trim(); // trim off leading and trailing blanks

            if (value.length() > 1) { // only one charachter
                System.out.println("\nInvalid value: choose a correct value");
                continue;
            }

            break;  // end the loop
        }
        return value;
    }
    
    
    public String getInput(String message) {

        Scanner keyboard = new Scanner(System.in); // get infile for keyboard
        String value = ""; //value to be returned
        boolean valid = false; // intialize to not valid

        while (!valid) { // loop while an invalid va;lue is entered
            System.out.println(message);
            //System.out.println("\n" + this.promptMessage);

            value = keyboard.nextLine(); // get next line typed on keyboard
            value = value.trim(); // trim off leading and trailing blanks

            if (value.length() > 1) { // only one charachter
                System.out.println("\nInvalid value: choose a correct value");
                continue;
            }

            break;  // end the loop
        }
        return value;
    }

}
