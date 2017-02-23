
 

package byui.cit260.blackout.control;

import byui.cit260.blackout.model.Item;
import java.util.Stack;






public class BackPackControl {
    
    private static Stack itemList = new Stack();
    private static Stack clueList = new Stack();
    
    public static Stack getItemList(){  
        return itemList;
   
    }
    
    public static void addItemToList(String itemName){
        
       //make temp item and add it to the itemList
        Item item = new Item();
        item.setName(itemName);
        itemList.push(item);
        
        
    }
    
    public static void addClueToList(String itemName){
        
       //make temp item and add it to the itemList
        Item item = new Item();
        item.setName(itemName);
        itemList.push(item);
        
        
    }
    
    public static Stack getClueList(){
        
         return clueList;
        
    }
    
    
}
