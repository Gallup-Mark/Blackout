package byui.cit260.blackout.view;

import byui.cit260.blackout.control.GameControl;
import byui.cit260.blackout.model.Map;
import byui.cit260.blackout.control.MapControl;
import byui.cit260.blackout.model.Game;
import byui.cit260.blackout.model.Location;
import java.util.Scanner;

/**
 *
 * @author mgallup
 */
public class GameMenuView extends View {

    //private final String promptMessage = "\nPlease enter an option:";
    //private final String menu;
    public GameMenuView() {
        super("\n"
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
            case "M": //create start new game
                this.moveLocation();
                break;
            case "V": // create save game
                this.viewMap();
                break;
            case "S": // Load game
                this.viewStatus();
                break;
            case "E": //view examine
                this.viewExamine();
                break;
            case "T": //view talk
                this.talk();
                break;
            case "A": //Amount of Antidote
                this.viewAntidoteAmount();
                break;
            case "B": //View Backpack contents
                this.viewBackPack();
                break;
            case "P": //PhonePasswordView
                this.viewPhonePassword();
                break;
            default:
                System.out.println("\n*** Invalid selection, try again");
                break;
        }
        return false;
    }

    private void viewBackPack() {
        BackpackMenuView backpack = new BackpackMenuView();
        backpack.display();
        //System.out.println(menu);

    }

    private void moveLocation() {

        LocationMenuView locationMenuView = new LocationMenuView();
        locationMenuView.display();
        System.out.println(menu);

    }

    private void viewMap() {

        Location[][] locations = Map.getLocations();

        //Map map = new Map(5, 5);
        String title = "    The Map, I'm the Map! \n";
        String rowDivider = "---------------------------";
        String columnDivider = "|";
        System.out.println("" + title);

        String linePrintout = " ";
        for (int i = 0; i < 5; i++) {

            linePrintout = linePrintout + " " + (i + 1) + "   ";

        }

        System.out.println(linePrintout);
        System.out.println(rowDivider);

        for (int i = 0; i < 5; i++) {

            linePrintout = (i + 1) + columnDivider;

            for (int ii = 0; ii < 5; ii++) {

                //shows if the location has been visited or not
                if (locations[i][ii].isVisited()) {
                    linePrintout = linePrintout + locations[i][i].getScene().getMapSymbol() + "  ";

                } else {

                    linePrintout = linePrintout + " ?? ";
                }
                linePrintout = linePrintout + columnDivider;

                // System.out.println(linePrintout);
            }

            System.out.println(linePrintout);
            System.out.println(rowDivider);
            //System.out.println("\n");
        }
    }

    private void viewStatus() {
        StatsView statsView = new StatsView();
        statsView.display();
        //System.out.println(menu);
    }

    private void viewExamine() {
        //System.out.println("\n*** viewExamine() function called ***");
        ExamMenu examMenu = new ExamMenu();
        examMenu.display();
        //System.out.println(menu);

    }

    private void talk() {
        //System.out.println("\n*** viewTalk() function called ***");

        //Added by Matt
        TalkMenuView talkMenu = new TalkMenuView();
        talkMenu.display();
        //System.out.println(menu);

    }

    //private void mainMenu() {
    //  System.out.println("\n*** mainMenu() function called ***");
    //  }
    private void viewAntidoteAmount() {
        AntidoteView antidoteView = new AntidoteView();
        antidoteView.displayAntidoteView();
        //System.out.println(menu);

        //System.out.println("\n*** viewAntidoteAmount() function called ***");
    }

    private void viewPhonePassword() {
        PhonePasswordView phonepassword = new PhonePasswordView();
        phonepassword.displayPhonePasswordView();
        //System.out.println(menu);

    }

}
