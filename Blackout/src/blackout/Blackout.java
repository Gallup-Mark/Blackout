
package blackout;

import byui.cit260.blackout.model.Game;
import byui.cit260.blackout.model.Player;
import byui.cit260.blackout.view.StartProgramView;

/*
import byui.cit260.blackout.model.Antidote;
import byui.cit260.blackout.model.Backpack;
import byui.cit260.blackout.model.Door;
import byui.cit260.blackout.model.Game;
import byui.cit260.blackout.model.Item;
import byui.cit260.blackout.model.ItemType;
import byui.cit260.blackout.model.Location;
import byui.cit260.blackout.model.Map;
import byui.cit260.blackout.model.NonPlayer;
import byui.cit260.blackout.model.Phone;
import byui.cit260.blackout.model.Player;
import byui.cit260.blackout.model.Scene;
import byui.cit260.blackout.model.SceneType;
*/



public class Blackout {
    
    private static Game currentGame = null;

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        Blackout.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        Blackout.player = player;
    }
    private static Player player = null;


    public static void main(String[] args) {
        
       //create StartProgramViewOrig and display the start program view
       StartProgramView startProgramView = new StartProgramView();
       startProgramView.displayStartProgramView();
                
    }

}
