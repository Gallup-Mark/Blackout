
package byui.cit260.blackout.view;

import java.util.Scanner;

/**
 *
 * @author mgallup
 */
public class HelpMenuView {
    
    private String promptMessage = "";
    private String menu;
    
    public HelpMenuView() {
        this.menu = "\n"
                + "\n----------------------------------------------------------"
                + "\n | Help Menu"
                + "\n----------------------------------------------------------"
                + "\nG - Goal of Game"
                + "\nF - Finding clues"
                + "\nH - How to move"
                + "\nQ - Quit Game"
                + "\n-----------------------------------------------------------";
        System.out.println(menu);
    }

    public void displayHelpMenuView() {
        boolean done = false; // set flag to not done
        do {
                // prompt for and get players name
                String menuOption = this.getMenuOption();
                if (menuOption.toUpperCase().equals("Q")) { //user wants to quit
                    MainMenuView mainMenu = new MainMenuView();
                    mainMenu.displayMainMenuView();
                    return;
                }
                    
                    // do the requested action and display the next view
                   done = this.doAction(menuOption);
                   
                   
        } while (!done);

    }

    private String getMenuOption() {
        Scanner keyboard = new Scanner(System.in); // get infile for keyboard
        String value = ""; //value to be returned
        boolean valid = false; // intialize to not valid
        
        while (!valid) { // loop while an invalid va;lue is entered
            System.out.println("\n" + this.promptMessage);
            
            value = keyboard.nextLine(); // get next line typed on keyboard
            value = value.trim(); // trim off leading and trailing blanks
            
            if (value.length() > 1) { // only one charachter
                System.out.println("\nInvalid value: choose a correct value");
                continue;
            }
            
            break;  // end then loop
        }
        return value;
    }

    private boolean doAction(String choice) {

            choice = choice.toUpperCase(); //convert choice to upper case
            
            switch (choice) {
                case "G" : //display goal of game
                    this.displayGoal();
                    break;
                case "H" : // display how to move
                    this.displayMoveOptions();
                    break;
                case "F" : // display clues
                    this.displayClues();
                    break;
                
                default :
                    System.out.println("\n*** Invalid selection, try again");
                    break;
            }
            return false;
    }

    private void displayGoal() {
        System.out.println("\n*** Figure out who you are and how much antidote you need to survive ***");
    }

    private void displayMoveOptions() {
       System.out.println("\n*** Where do you want to go?***");
    }

    private void displayClues() {
        System.out.println("\n*** Gather clues to bring back your memory and find the antidote ***");
    }

    

    
}
