
package byui.cit260.blackout.view;

import byui.cit260.blackout.control.BackPackControl;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author mgallup
 */
public class BackpackMenuView {
    
    private String promptMessage = "";
    private String menu = "";
    
    //private Stack itemList = BackPackControl
    
    public BackpackMenuView(){
        this.menu = "\n"
                + "\n----------------------------------------------------------"
                + "\n | Backpack Menu"
                + "\n----------------------------------------------------------"
                + "\nS - Show List of Items"
                + "\nC - Show Clue List"
                + "\nA - Add Item to Backpack"
                + "\nD - Add Clue to Clue List"
                + "\nQ - Return to Game Menu"
                + "\n-----------------------------------------------------------";
    }
        
    public void displayBackpackMenuView() {
        boolean done = false; // set flag to not done
        do {
                // prompt for and get players name
                String menuOption = this.getMenuOption();
                if (menuOption.toUpperCase().equals("Q")) { //user wants to quit
                    
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
                case "S" : //display list of items
                    
                    showListOfItems();
                    break;
                case "C" : // display clues
                    showListOfClues();
                    break;
                case "A" : //add item to backpack
                    addItemToBackPack(itemInputValue());
                    break;
                case "D" : //add clue to list
                    addClueToBackPack(itemInputValue());
                    break;
                
                default :
                    System.out.println("\n*** Invalid selection, try again");
                    break;
            }
            return false;
    }
        
        
        private void showListOfItems(){
            
            
            //checks the number of items in item list
           // int sz = BackPackControl.
           
           int sz = BackPackControl.getItemList().size();
           
           
            //int sz = itemList.size();
            
            String displayMessage =  "\n"
                + "\n----------------------------------------------------------"
                + "\n | Item List"
                + "\n----------------------------------------------------------";
            
            if(sz == 0){   
                displayMessage += "\n No Items In List";
            } else {
                
                Object[] theItems = BackPackControl.getItemList().toArray();
                
                
                for(int i =0; i < sz; i++){
                    
                    displayMessage += "\n " + (i + 1)  + " ";
                    displayMessage += theItems[i].toString();
                   
                }
                
            }
            //this displays the item lists
            //System.out.println(itemList);
            
            System.out.println(displayMessage);

        }
        
         private void showListOfClues(){
            
            
            //checks the number of items in item list
           // int sz = BackPackControl.
           
           int sz = BackPackControl.getClueList().size();
           
           
            //int sz = itemList.size();
            
            String displayMessage =  "\n"
                + "\n----------------------------------------------------------"
                + "\n | Clue List"
                + "\n----------------------------------------------------------";
            
            if(sz == 0){   
                displayMessage += "\n No Clues In List";
            } else {
                
                Object[] theItems = BackPackControl.getClueList().toArray();
                
                
                for(int i =0; i < sz; i++){
                    
                    displayMessage += "\n " + (i + 1)  + " ";
                    displayMessage += theItems[i].toString();
                   
                }
                
            }
            //this displays the item lists
            //System.out.println(itemList);
            
            System.out.println(displayMessage);

        }
        
        private String itemInputValue(){
            Scanner keyboard = new Scanner(System.in); // get infile for keyboard
            String value = ""; //value to be returned
            boolean valid = false; // intialize to not valid
        
            String displayMessage =  "\n"
                + "\n----------------------------------------------------------"
                + "\n | Please enter the Name of the Item You want to Add to the BackPack"
                + "\n----------------------------------------------------------";
            
            while (!valid) { // loop while an invalid va;lue is entered
                System.out.println("\n" + displayMessage);
            
                value = keyboard.nextLine(); // get next line typed on keyboard
                value = value.trim(); // trim off leading and trailing blanks
            
                if (value.length() < 1) { // only one charachter
                    System.out.println("\nInvalid Item Name Please enter Longer Item Name");
                    continue;
                }
            
                break;  // end then loop
            }
            return value;
            
        }
    
        
        private void addItemToBackPack(String itemName){
            
            BackPackControl.getItemList().push(itemName);
            System.out.println("\n Added item "  + itemName + " to item List");
            
            
        }
        
        private void addClueToBackPack(String clueName){
            
            BackPackControl.getClueList().push(clueName);
            System.out.println("\n Added item "  + clueName + " to item List");
            
            
        }
    
    
}
