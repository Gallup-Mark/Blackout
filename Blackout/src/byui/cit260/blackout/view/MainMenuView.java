
package byui.cit260.blackout.view;

import blackout.Blackout;
import byui.cit260.blackout.control.GameControl;
import byui.cit260.blackout.view.GameMenuView;
import java.util.Scanner;

/**
 *
 * @author mgallup
 */
public class MainMenuView {
    
    private String promptMessage = "";
    private String menu;
    
    public MainMenuView() {
        this.menu = "\n"
                + "\n----------------------------------------------------------"
                + "\n | Main Menu"
                + "\n----------------------------------------------------------"
                + "\nN - New Game"
                + "\nS - Save Game"
                + "\nL - Load Game"
                + "\nH - Help Menu"
                + "\nQ - Quit Game"
                + "\n-----------------------------------------------------------";
        System.out.println(menu);
    }

    public void displayMainMenuView() {
        boolean done = false; // set flag to not done
        do {
                // prompt for and get players name
                String menuOption = this.getMenuOption();
                if (menuOption.toUpperCase().equals("Q"))  //user wants to quit
                    break; // exit the game
                    
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
                case "N" : //create start new game
                    this.startNewGame();
                    break;
                case "S" : // create save game
                    this.saveGame();
                    break;
                case "L" : // Load game
                    this.loadGame();
                    break;
                case "H" : //Help Menu
                    this.helpMenu();
                    break;
                case "Q" : //quit game
                    this.quitGame();
                    break;
                default :
                    System.out.println("\n*** Invalid selection, try again");
                    break;
            }
            return false;
    }

    private void startNewGame() {
        // create new game
        GameControl.createNewGame(Blackout.getPlayer());
        
        //display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayGameMenuView();
    }

    private void saveGame() {
        System.out.println("\n*** saveGame() function called ***");
    }

    private void loadGame() {
        System.out.println("\n*** loadGame() function called ***");
    }

    private void helpMenu() {
       // display help menu
       HelpMenuView helpMenu = new HelpMenuView();
       helpMenu.displayHelpMenuView();
    }

    private void quitGame() {
        System.out.println("\n*** quitMenu() function called ***");
    }
    
}
