
package byui.cit260.blackout.view;

//import java.util.Scanner;

/**
 *
 * @author Team Blackout
 */
public class HelpMenuView extends View{
    
    
    public HelpMenuView() {
       super ("\n"
                + "\n----------------------------------------------------------"
                + "\n | Help Menu"
                + "\n----------------------------------------------------------"
                + "\nG - Goal of game"
                + "\nF - Finding clues"
                + "\nH - How to move"
                + "\nQ - Quit Game"
                + "\n-----------------------------------------------------------");
    }

    @Override
    public boolean doAction(String choice) {

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
                    this.console.println("\n*** Invalid selection, try again");
                    break;
            }
            return false;
    }

    private void displayGoal() {
        this.console.println("\n*** Figure out who you are and how much antidote you need to survive ***");
    }

    private void displayMoveOptions() {
       this.console.println("\n*** Where do you want to go?***");
    }

    private void displayClues() {
        this.console.println("\n*** Gather clues to bring back your memory and find the antidote ***");
    }

    

    
}
