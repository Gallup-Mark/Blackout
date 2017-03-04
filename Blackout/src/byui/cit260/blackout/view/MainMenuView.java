
package byui.cit260.blackout.view;

import blackout.Blackout;
import byui.cit260.blackout.control.GameControl;
import java.util.Scanner;

/**
 *
 * @author Team Blackout
 */
public class MainMenuView extends View {
    
    //private final String promptMessage = "\nPlease enter an option:";
   // private final String menu;
    
    public MainMenuView() {
        super( "\n"
                + "\n----------------------------------------------------------"
                + "\n | Main Menu"
                + "\n----------------------------------------------------------"
                + "\nN - New Game"
                + "\nS - Save Game"
                + "\nL - Load Game"
                + "\nH - Help Menu"
                + "\nQ - Quit Game"
                + "\n-----------------------------------------------------------");
    }

 

    @Override
    public boolean doAction(String value) {

            value = value.toUpperCase(); //convert choice to upper case
            
            switch (value) {
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
        gameMenu.display();
        System.out.println(menu);
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
       helpMenu.display();
    }

    private void quitGame() {
        System.out.println("\n*** quitMenu() function called ***");
    }
    
}
