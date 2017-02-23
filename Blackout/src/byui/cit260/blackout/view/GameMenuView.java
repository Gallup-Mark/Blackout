
package byui.cit260.blackout.view;

import java.util.Scanner;

/**
 *
 * @author mgallup
 */
public class GameMenuView {

    private final String promptMessage = "\nPlease enter an option:";
    private final String menu;
    
    public GameMenuView() {
        this.menu = "\n"
                + "\n----------------------------------------------------------"
                + "\n | Game Menu"
                + "\n----------------------------------------------------------"
                + "\nM - Move to New Location ((Player can enter N,E,S,W"
                + "\nV - View Map"
                + "\nS - Status"
                + "\nB - Backpack Menu"
                + "\nE - Examine"
                + "\nT - Talk"
                + "\nA - Antidote Amount"
                + "\nP - Phone"
                + "\nQ - Back to Main Menu"
                + "\n-----------------------------------------------------------";
    }

    public void displayGameMenuView() {
        boolean done = false; // set flag to not done
        do {
                // prompt for and get players name
                String menuOption = this.getMenuOption();
                if (menuOption.toUpperCase().equals("Q"))  { //user wants to quit
                    //MainMenuView mainMenu = new MainMenuView();
                    //mainMenu.displayMainMenuView();
                    return;
                }
                    
                    // do the requested action and display the next view
                   done = this.doAction(menuOption);
                   
                   
        } while (!done);

    }

    private String getMenuOption() {
                System.out.println(menu);

        
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
                case "M" : //create start new game
                    this.moveLocation();
                    break;
                case "V" : // create save game
                    this.viewMap();
                    break;
                case "S" : // Load game
                    this.viewStatus();
                    break;
                case "E" : //view examine
                    this.viewExamine();
                    break;
                case "T" : //view talk
                    this.talk();
                    break;
                case "A" : //Amount of Antidote
                   this.viewAntidoteAmount();
                   break;
                case "B" : //Amount of Antidote
                   this.viewBackPack();
                   break;
                case "P" : //PhonePasswordView
                   this.viewPhonePassword();
                   break;
                default :
                    System.out.println("\n*** Invalid selection, try again");
                    break;
            }
            return false;
    }
    
    
    private void viewBackPack() {
        BackpackMenuView backpack = new BackpackMenuView();
        backpack.displayBackpackMenuView();
        
    }

    private void moveLocation() {
        System.out.println("\n*** moveLocation() function called ***");
    }

    private void viewMap() {
        System.out.println("\n*** viewMap() function called ***");    }

    private void viewStatus() {
        System.out.println("\n*** viewStatus() function called ***");
    }

    private void viewExamine() {
        System.out.println("\n*** viewExamine() function called ***");
    }

    private void talk() {
        //System.out.println("\n*** viewTalk() function called ***");
        
        //Added by Matt
        TalkMenuView talkMenu = new TalkMenuView();
        talkMenu.displayTalkMenuView();
    }

    //private void mainMenu() {
      //  System.out.println("\n*** mainMenu() function called ***");
  //  }

    private void viewAntidoteAmount() {
        AntidoteView antidoteView = new AntidoteView();
        antidoteView.displayAntidoteView();

        //System.out.println("\n*** viewAntidoteAmount() function called ***");
    }

    private void viewPhonePassword() {
        PhonePasswordView phonepassword = new PhonePasswordView();
        phonepassword.displayPhonePasswordView();

    }

    
}
