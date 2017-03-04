
package byui.cit260.blackout.view;

import java.util.Scanner;

/**
 *
 * @author mgallup
 */
public class GameMenuView extends View {

    //private final String promptMessage = "\nPlease enter an option:";
    //private final String menu;
    
    public GameMenuView() {
        super( "\n"
                + "\n----------------------------------------------------------"
                + "\n | Game Menu"
                + "\n----------------------------------------------------------"
                + "\nM - Move to New Location"
                + "\nV - View Map"
                + "\nS - Status"
                + "\nB - Backpack Menu"
                + "\nE - Examine"
                + "\nT - Talk"
                + "\nA - Antidote Amount Needed"
                + "\nP - Phone"
                + "\nQ - Back to Main Menu"
                + "\n-----------------------------------------------------------");
    }


    @Override
    public boolean doAction(String choice) {

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
                case "B" : //View Backpack contents
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
        backpack.display();
                System.out.println(menu);

        
    }

    private void moveLocation() {
        
        LocationMenuView locationMenuView = new LocationMenuView();
        locationMenuView.display();
         System.out.println(menu);
        
        
    }

    private void viewMap() {
        System.out.println("\n*** viewMap() function called ***");    }

    private void viewStatus() {
        StatsView statsView = new StatsView();
        statsView.display();
        System.out.println(menu);
    }

    private void viewExamine() {
        //System.out.println("\n*** viewExamine() function called ***");
        ExamMenu examMenu = new ExamMenu();
        examMenu.display();
                System.out.println(menu);

                }

    private void talk() {
        //System.out.println("\n*** viewTalk() function called ***");
        
        //Added by Matt
        TalkMenuView talkMenu = new TalkMenuView();
        talkMenu.display();
                System.out.println(menu);

    }

    //private void mainMenu() {
      //  System.out.println("\n*** mainMenu() function called ***");
  //  }

    private void viewAntidoteAmount() {
        AntidoteView antidoteView = new AntidoteView();
        antidoteView.displayAntidoteView();
                System.out.println(menu);


        //System.out.println("\n*** viewAntidoteAmount() function called ***");
    }

    private void viewPhonePassword() {
        PhonePasswordView phonepassword = new PhonePasswordView();
        phonepassword.displayPhonePasswordView();
                System.out.println(menu);

    }

    
}
