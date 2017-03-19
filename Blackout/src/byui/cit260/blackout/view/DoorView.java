package byui.cit260.blackout.view;

import byui.cit260.blackout.control.DoorControl;
import byui.cit260.blackout.control.DoorUnLockControl;
import byui.cit260.blackout.exceptions.DoorControlException;
import byui.cit260.blackout.exceptions.DoorUnLockControlException;
import byui.cit260.blackout.model.Player;
import static java.lang.Integer.parseInt;
//import java.text.ParseException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
//import java.util.logging.Level;
//import java.util.logging.Logger;

/**
 *
 * @author Team Blackout
 */
public class DoorView extends View {

    public DoorView() {
        super("\n"
                + "\n----------------------------------------------------------"
                + "\n | Door Menu"
                + "\n----------------------------------------------------------"
                + "\nK - Kick Door Open"
                + "\nU - Unlock Door"
                + "\nQ - Quit Menu"
                + "\n-----------------------------------------------------------");
    }

    @Override
    public boolean doAction(String choice) {

        choice = choice.toUpperCase(); //convert choice to upper case

        switch (choice) {
            case "K": {
                try {
                    //display Kick
                    this.displayKick();
                } catch (DoorControlException ex) {
                    //Logger.getLogger(DoorView.class.getName()).log(Level.SEVERE, null, ex);
                    System.out.println("\nYou must enter a valid number. Try again or enter Q to quit.");
                }
            }
            break;
            case "U": {
            try {
                // display Unlock
                this.displayUnlock();
            } catch (DoorUnLockControlException ex) {
                System.out.println(ex);
                
                //Logger.getLogger(DoorView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
                break;

            default:
                System.out.println("\n*** Invalid selection, try again");
                break;
        }
        return false;

    }

    private void displayKick() throws DoorControlException {

        //double playerWeight = Player.getWeight();
        //double playerForce = Player.getForce();
        //System.out.println("Enter player weight");
        kickDoorInput();
        //DoorControl.breakDoorOpen(playerWeight, playerForce, 5, 3, 7);

    }

    private void displayUnlock() throws DoorUnLockControlException {
        
        //unLockDoorWithCode(int keyCode, double playLbs, int doorNo)
        int keyCode = -1;
        double playLbs = -1;
        int doorNo = -1;
        
        try {
            keyCode = parseInt(getInput("Enter Keycode"));
            
         } catch (NumberFormatException nf) {
                System.out.println("You must enter a valid number ");
                
         }
         try {
                playLbs = Double.parseDouble(getInput("Enter Player lbs"));
         } catch (NumberFormatException e){
             
             System.out.println("You must enter a valid number ");
         }
         
         try {
              doorNo = parseInt(getInput("Enter Door Number"));
         } catch (NumberFormatException e2) {
             System.out.println("You must enter a valid number ");
         }
         
         double unlock = DoorUnLockControl.unLockDoorWithCode(keyCode, playLbs, doorNo);
         if(unlock == 0){
             System.out.println("You Did No Unlock the door");
         } else {
             System.out.println("You Unlocked the Door");
         }
        
        
        //System.out.println("\n*** displayUnlock stub function called ***");
    }

    public void kickDoorInput() throws DoorControlException {

        
        Scanner keyboard = new Scanner(System.in); // get infile for keyboard
        double value = 0; //value to be returned
        boolean valid = false; // intialize to not valid
        String inputValue = "";

        while (!valid) { // loop while an invalid value is entered
            System.out.println("Enter player weight in pounds:");
            //System.out.println("\n" + this.promptMessage);

            inputValue = keyboard.nextLine(); // get next line typed on keyboard
            inputValue = inputValue.trim(); // trim off leading and trailing blanks

            try {
                value = Double.parseDouble(inputValue);
                if (value >= 0) {
                    valid = true;
                    break;  // end the loop
                }
            } catch (NumberFormatException nf) {
                System.out.println("You must enter a valid number dork");
            }

        }
        Player.setWeight(value);
        System.out.println("Enter player force");
        inputValue = "";
        valid = false;
        while (!valid) { // loop while an invalid va;lue is entered
            //System.out.println(menu);
            //System.out.println("\n" + this.promptMessage);

            inputValue = keyboard.nextLine(); // get next line typed on keyboard
            inputValue = inputValue.trim(); // trim off leading and trailing blanks

            try {
                value = Double.parseDouble(inputValue);
                if (value >= 0) {
                    valid = true;
                    break;  // end the loop
                }

            } catch (NumberFormatException nf) {
                System.out.println("You must enter a valid number dork");
            }

        }
        Player.setForce(value);
        DoorControl.breakDoorOpen(Player.getWeight(), Player.getForce(), 5, 3, 7);
    }

}
