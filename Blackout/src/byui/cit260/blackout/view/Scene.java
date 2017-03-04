
package byui.cit260.blackout.view;

/**
 *
 * @author Brian
 */
public class Scene extends View {
    public String description;
    public String mapSymbol;
    public int numItems;
    public String nonPlayers;
    
    
    
    public Scene() {
        
        
        super( "\n"
                + "\n----------------------------------------------------------"
                + "\n | Locations Menu"
                + "\n----------------------------------------------------------"
                + "\nI - View Number of Items"
                + "\nN - View non Players"
                + "\nD - View Location Description"
                + "\nQ - Return to Locations Menu"
                + "\n-----------------------------------------------------------");
        
        
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMapSymbol() {
        return mapSymbol;
    }

    public void setMapSymbol(String mapSymbol) {
        this.mapSymbol = mapSymbol;
    }

    public int getNumItems() {
        return numItems;
    }

    public void setNumItems(int numItems) {
        this.numItems = numItems;
    }

    public String getNonPlayers() {
        return nonPlayers;
    }

    public void setNonPlayers(String nonPlayers) {
        this.nonPlayers = nonPlayers;
    }
    
    public void displayMapSymbol(){
        System.out.println(getMapSymbol());
        
    }
    
    public void displayNumbersOfItems(){
        
          
        System.out.println(getNumItems());
    }
    
    public void displayNonPlayers(){
        
        System.out.println(getNonPlayers());
        
    }
    @Override    
public boolean doAction(String choice) {

            choice = choice.toUpperCase(); //convert choice to upper case
            
            switch (choice) {
                case "I" : //item list
                    showItemNumber();
                    break;
                case "N" : //non players
                    showNonPlayers();
                    break;
                case "D" : //Des of Scene
                    showDescription();
                    break;
                
                
                default :
                    System.out.println("\n*** Invalid selection, try again");
                    break;
            }
            return false;
    }

    private void showItemNumber(){
         System.out.println("\n"
                + "\n----------------------------------------------------------"
                + "\n | Number of Items"
                + "\n----------------------------------------------------------"); 
        System.out.println(getNumItems());
        
        System.out.println(menu);
        
    }
    
    private void showNonPlayers(){
        
        
        System.out.println("\n"
                + "\n----------------------------------------------------------"
                + "\n |Non Player"
                + "\n----------------------------------------------------------");
        System.out.println(getNonPlayers());
         System.out.println(menu);
    }
    
    private void showDescription(){
        
        System.out.println("\n"
                + "\n----------------------------------------------------------"
                + "\n |Lcoation Description"
                + "\n----------------------------------------------------------");
        System.out.println(getDescription());
         System.out.println(menu);
        
    }
}
    