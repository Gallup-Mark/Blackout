package byui.cit260.blackout.view;

import blackout.Blackout;
import static blackout.Blackout.outFile;
import byui.cit260.blackout.control.GameControl;
import byui.cit260.blackout.model.Map;
import byui.cit260.blackout.control.MapControl;
import byui.cit260.blackout.control.PhoneControl;
import byui.cit260.blackout.exceptions.AntidoteControlException;
import byui.cit260.blackout.exceptions.GameControlExceptions;
import byui.cit260.blackout.model.Game;
import byui.cit260.blackout.model.Location;
import byui.cit260.blackout.model.PhoneMessage;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.Integer.parseInt;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

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
                + "\nC - Phone Message Report"
                + "\nD - Door Menu"
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
            case "D": //view door
                this.viewDoor();
                break;
            case "T": //view briantalk
                this.talk();
                break;
            //updated by Mark 3/18/17
            case "A": {
            try {
                //Amount of Antidote
                this.viewAntidoteAmount();
            } catch (AntidoteControlException ex) {
               //System.out.println("\nInvalid input. Please enter a valid letter");
               ErrorView.display(this.getClass().getName(), "Invalid Value Entered" + ex.getMessage());
            }
        }
                break;
            case "B": //View Backpack contents
                this.viewBackPack();
                break;
            case "P": //PhonePasswordView
                this.viewPhonePassword();
                break;
            case "C": {
            try {
                //Phone message report
                this.phoneMessageReport();
            } catch (GameControlExceptions ex) {
                ErrorView.display(this.getClass().getName(), "Error creating report" + ex.getMessage());
            }
        }
                break;
            default:
                //ErrorView.display(this.getClass().getName(), "*** Invalid selection, try again");
                this.console.println("\n*** Invalid selection, try again");
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

        //LocationMenuView locationMenuView = new LocationMenuView();
        //locationMenuView.display();
        //System.out.println(menu);
       int x = -1; 
       int y = -1;
       try {
             x = parseInt(getInput("Enter X value on Map"));
       } catch(NumberFormatException e){
           ErrorView.display(this.getClass().getName(), "*** Invalid Value Entered" + e.getMessage());
           //System.out.println("Invalid Value entered");
        
        }
       try {
            y = parseInt(getInput("Enter Y value on Map"));
       } catch(NumberFormatException e){
           ErrorView.display(this.getClass().getName(), "*** Invalid Value Entered" + e.getMessage());
           
           //System.out.println("Invalid Value Entered");
       }
       if(x >= 0 && y >= 0){
            MapControl.movePlayer(Blackout.getCurrentGame().getMap(), x, y);
       } else {
           
           this.console.println("Cannot Move to invalid location");
       }
    }

    private void viewMap() {

        Location[][] locations = Blackout.getCurrentGame().getMap().getLocations();
        //Location[][] locations = Map.getLocations();

        //Map map = new Map(5, 5);
        String title = "    The Map, I'm the Map! \n";
        String rowDivider = "---------------------------";
        String columnDivider = "|";
        this.console.println("" + title);

        String linePrintout = " ";
        for (int i = 0; i < 5; i++) {

            linePrintout = linePrintout + " " + (i) + "   ";

        }

        this.console.println(linePrintout);
        this.console.println(rowDivider);

        for (int i = 0; i < 5; i++) {

            linePrintout = (i) + columnDivider;

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

            this.console.println(linePrintout);
            this.console.println(rowDivider);
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
    private void viewAntidoteAmount() throws AntidoteControlException {
        AntidoteView antidoteView = new AntidoteView();
        antidoteView.displayAntidoteView();
        this.console.println(menu);

        //System.out.println("\n*** viewAntidoteAmount() function called ***");
    }

    private void viewPhonePassword() {
        PhonePasswordView phonepassword = new PhonePasswordView();
        phonepassword.displayPhonePasswordView();
        //System.out.println(menu);

    }

    private void viewDoor() {
        
        DoorView doorView = new DoorView();
        doorView.display();
        
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void phoneMessageReport() throws GameControlExceptions {
        
        
//        this.console.println("\nPlease enter a file name to save your report:");

        String filePath = this.getInput("\n\nEnter the file you want to save the report to: ");
        PhoneMessage[] messageList = PhoneControl.createMessageList();
        
        
        try (PrintWriter out = new PrintWriter(filePath)) {
            
            out.println("\n\n                             Phone Messages                       ");
            out.printf("%n%-10s%30s", "From", "Message");
            out.printf("%n%-10s%30s", "----", "-------");
            
            for(PhoneMessage message: messageList) {
            
                out.printf("%n%-10s%30s", message.getFrom()
                                        , message.getMessage());
            }
//            GameControl.saveGame(Blackout.getCurrentGame(), filePath);
        } catch(IOException ex){
            ErrorView.display(this.getClass().getName(), "Error generating report: " + ex.getMessage());
//        } finally {
//            if (out != null) {
//                try {
//                    out.close();
//                } catch (IOException ex2) {
//                    ErrorView.display(this.getClass().getName(), "Error closing report: " + ex2.getMessage());
//                }
            }
        this.console.println("Your " + filePath + " report was successfully generated!");
        
        }
        
    }
        

