
package byui.cit260.blackout.view;

/**
 *
 * @author mgall
 */
public class Scene extends View {
    public String description;
    public String mapSymbol;
    public int numItems;
    public String nonPlayers;
    
    public Scene() {
        
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
    @Override    
    public boolean doAction(String choice) {
        return true;
            
    }
}
    