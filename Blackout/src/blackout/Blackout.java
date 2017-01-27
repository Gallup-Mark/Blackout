
package blackout;

import byui.cit260.blackout.model.Backpack;
import byui.cit260.blackout.model.Game;
import byui.cit260.blackout.model.Location;
import byui.cit260.blackout.model.Map;
import byui.cit260.blackout.model.NonPlayer;
import byui.cit260.blackout.model.Player;
import byui.cit260.blackout.model.Scene;


public class Blackout {


    public static void main(String[] args) {
        
        Game game = new Game();
        
        game.setTotalTime(300);
        game.setStartTime(1);
        
        String gameInfo = game.toString();
        System.out.println(gameInfo);
        
        Map map = new Map();
        
        map.setColumnCount(5);
        map.setRowCount(5);
        map.setCurrentColumn(3);
        map.setCurrentRow("D");
        map.setCurrentScene("subway");
        
        String mapInfo = map.toString();
        System.out.println(mapInfo);
        
        Location location = new Location();
        
        location.setColumn(3);
        location.setRow("E");
        location.setDescription("Apartment");
        
        String locationInfo = location.toString();
        System.out.println(locationInfo);
        
        
        
        Backpack backpack = new Backpack();
        
        backpack.setItems("phone");
        
        String backpackItems = backpack.toString();
        System.out.println(backpackItems);
        
        Player playerOne = new Player();
        
        playerOne.setName("Fred Flinstone");
        playerOne.setStartStrength(100);
        playerOne.setStrenghth(25);
        playerOne.setTalk("Welcome to Blackout");
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
        
        
        
        //added by Brian
        
        //non player 1 stuff
        NonPlayer theNonPlayer = new NonPlayer();
        theNonPlayer.setClue("Go Over There");
        theNonPlayer.setName("Joe Bob");
        theNonPlayer.setLevel(2);
        
        String theNonPlayerInfo = theNonPlayer.toString();
        System.out.println(theNonPlayerInfo);
        
        
        //Scene 
        Scene sceneOne = new Scene();
        sceneOne.setDescription("Boring Old Subway care");
        sceneOne.setMapSymbol("#");
        sceneOne.setNumberItems(3);
        sceneOne.setNonPlayer(theNonPlayer);
        sceneOne.setType("subway");
        
        String theSceneOneInfo = sceneOne.toString();
        System.out.println(theSceneOneInfo);
        
        
        
        
    }
    
}
