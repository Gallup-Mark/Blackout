
package byui.cit260.blackout.view;

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
                    return; // exit the game
                    
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
                System.out.println("\nInvalid value: value can not be blank");
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
        System.out.println("\n*** startNewGame() function called ***");
    }

    private void saveGame() {
        System.out.println("\n*** saveGame() function called ***");
    }

    private void loadGame() {
        System.out.println("\n*** loadGame() function called ***");
    }

    private void helpMenu() {
       System.out.println("\n*** helpMenu() function called ***");
    }

    private void quitGame() {
        System.out.println("\n*** quitMenu() function called ***");
    }
    
}
