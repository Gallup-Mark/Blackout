
package blackout;

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
        
        //Antidote
        
        Antidote theAntidote = new Antidote();
        theAntidote.setDescription("The Bottle of Dr Pepper");
        theAntidote.setName("Dr Pepper");
        theAntidote.setType("The Antidote");
        theAntidote.setWeightInPounds(176);
        theAntidote.setWeighInKilo(79.8323);
        
        String theAntidoteInfo = theAntidote.toString();
        System.out.println(theAntidoteInfo);
        
        //added by Matthew for the second time
        
        //Item
        Item itemOne = new Item();
            itemOne.setDescription("Joe Bob's Soda");
            itemOne.setName("Root Beer");
            itemOne.setType("Soda");
            
            String sodaOne = itemOne.toString();
            System.out.println(sodaOne);
        
        
        //ItemType
        ItemType antidote = new ItemType();
        ItemType phone = new ItemType();
        ItemType soda = new ItemType();
        ItemType money = new ItemType();
        ItemType coat = new ItemType();
        ItemType wallet = new ItemType();
        ItemType candy = new ItemType();
        
        String mainAntidote = antidote.toString();
            System.out.println(mainAntidote);
        
        //Phone
        Phone cell = new Phone();
            cell.setContactList("Wife");
            cell.setPassword("JoeBobsPhone");
            cell.setPictures("Picture of Wife");
            
            String cellphone = cell.toString();
            System.out.println(cellphone);
        
        //Door
        Door doorOne = new Door();
            doorOne.setKeyType("Skeleton Key");
            doorOne.setHaveKey(false);
            doorOne.setLocked(true);
            doorOne.setUnlocked(false);
            doorOne.setWindow(true);
            
            String levelOneDoor = doorOne.toString();
            System.out.println(levelOneDoor);
            
            
            
    }   
            
    
}
