
package byui.cit260.blackout.view;

import byui.cit260.blackout.control.BackPackControl;
import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Brian
 */
public class BackpackMenuView extends View {
    
    //private String promptMessage = "";
    //private String menu = "";
    
    //private Stack itemList = BackPackControl
    
    public BackpackMenuView(){
        super( "\n"
                + "\n----------------------------------------------------------"
                + "\n | Backpack Menu"
                + "\n----------------------------------------------------------"
                + "\nS - Show List of Items"
                + "\nC - Show Clue List"
                + "\nA - Add Item to Backpack"
                + "\nD - Add Clue to Clue List"
                + "\nQ - Return to Game Menu"
                + "\n-----------------------------------------------------------");
    }
        
    
        
    @Override    
    public boolean doAction(String choice) {

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
                    //this.console.println("\n*** Invalid selection, try again");
                    ErrorView.display(this.getClass().getName(), "Invalid input. Invalid selection, try again" );
                
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
            
            this.console.println(displayMessage);

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
            
            this.console.println(displayMessage);

        }
        
        private String itemInputValue(){
            //Scanner keyboard = new Scanner(System.in); // get infile for keyboard
            String value = ""; //value to be returned
            boolean valid = false; // intialize to not valid
        
            String displayMessage =  "\n"
                + "\n----------------------------------------------------------"
                + "\n | Please enter the Name of the Item You want to Add to the BackPack"
                + "\n----------------------------------------------------------";
            
            while (!valid) { // loop while an invalid va;lue is entered
                this.console.println("\n" + displayMessage);
            
                try {
                    value = keyboard.readLine(); // get next line typed on keyboard
                } catch (IOException ex) {
                    //System.out.println("\n Error Reading Input: " + ex.getMessage());
                    ErrorView.display(this.getClass().getName(), "Error Reading Input: " + ex.getMessage());
                
                    //Logger.getLogger(BackpackMenuView.class.getName()).log(Level.SEVERE, null, ex);
                }
                value = value.trim(); // trim off leading and trailing blanks
            
                if (value.length() < 1) { // only one charachter
                    //System.out.println("\nInvalid Item Name Please enter Longer Item Name");
                    ErrorView.display(this.getClass().getName(), "Invalid Item Name Please enter Longer Item Name ");
                
                    continue;
                }
            
                break;  // end then loop
            }
            return value;
            
        }
    
        
        private void addItemToBackPack(String itemName){
            
            BackPackControl.getItemList().push(itemName);
            this.console.println("\n Added item "  + itemName + " to item List");
            
            
        }
        
        private void addClueToBackPack(String clueName){
            
            BackPackControl.getClueList().push(clueName);
            this.console.println("\n Added item "  + clueName + " to item List");
            
            
        }
    
    
}
