
package byui.cit260.blackout.control;

import byui.cit260.blackout.model.Player;

/**
 *
 * @author mgallup
 */
public class GameControl {
    
    public static Player createPlayer(String name) {
        
        if (name ==  null) {
            return null;
        }
        
        
        Player player = new Player();
        player.setName(name);
        
        //Blackout.setPlayer(player);
        
        return player;
    }

    public static void createNewGame(Player player) {
        System.out.println("\n*** createNewGame stub function called ***");
    }
    
}
