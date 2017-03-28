package byui.cit260.blackout.control;

import blackout.Blackout;
import byui.cit260.blackout.exceptions.GameControlExceptions;
import byui.cit260.blackout.model.Backpack;
import byui.cit260.blackout.model.Game;
import byui.cit260.blackout.model.Item;
import byui.cit260.blackout.model.ItemList;
import byui.cit260.blackout.model.Location;
import byui.cit260.blackout.model.Map;
import byui.cit260.blackout.model.Phone;
import byui.cit260.blackout.model.Player;
import byui.cit260.blackout.model.Scene;
import byui.cit260.blackout.model.SceneType;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;

/**
 *
 * @author mgallup
 */
public class GameControl {
    
    public static int[] itemLocationXY = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24};
    
    public static int min = 1;
    public static int max = 24;

    public static Player createPlayer(String name) {

        if (name == null) {
            return null;
        }

        Player player = new Player();
        player.setName(name);
        // player.setWeight(200);
        //  player.setForce(20.3);

        //Blackout.setPlayer(player);
        return player;
    }

    public static void createNewGame(Player player) {
        //System.out.println("\n*** createNewGame stub function called ***");

        Game game = new Game();
        Blackout.setCurrentGame(game);
        game.setPlayer(player);

        Item[] itemList = GameControl.createItemList();
        game.setItem(itemList);

        Backpack backpack = new Backpack();
        game.setBackpack(backpack);

        Phone phone = new Phone();
        game.setPhone(phone);

        Map map = MapControl.createMap();
        game.setMap(map);

    }
   
//create random int values to assign items to map locations     
    public static int getRandomInt(int min, int max) {
        min = (int) Math.ceil(min);
        max = (int) Math.floor(max);
        int randomValue = (int) (Math.floor(Math.random() * (max - min)) + min);
        
        return randomValue;
    }

    public static Item[] createItemList() {
        Item[] itemList = new Item[5];

        Item antidote = new Item();
        antidote.setDescription("The antidote needed to live!");
        antidote.setName("The Antidote");
        antidote.setLocationX(itemLocationXY[(GameControl.getRandomInt(min, max))]);
        antidote.setLocationY(itemLocationXY[(GameControl.getRandomInt(min, max))]);
        itemList[ItemList.antidote.ordinal()] = antidote;

        Item phone = new Item();
        phone.setDescription("Your cell phone");
        phone.setName("Android");
        phone.setLocationX(itemLocationXY[(GameControl.getRandomInt(min, max))]);
        phone.setLocationY(itemLocationXY[(GameControl.getRandomInt(min, max))]);
        itemList[ItemList.phone.ordinal()] = phone;

        Item wallet = new Item();
        wallet.setDescription("Your wallet");
        wallet.setName("Leather wallet");
        wallet.setLocationX(itemLocationXY[(GameControl.getRandomInt(min, max))]);
        wallet.setLocationY(itemLocationXY[(GameControl.getRandomInt(min, max))]);
        itemList[ItemList.wallet.ordinal()] = wallet;

        Item coat = new Item();
        coat.setDescription("Your coat");
        coat.setName("Leather coat");
        coat.setLocationX(itemLocationXY[(GameControl.getRandomInt(min, max))]);
        coat.setLocationY(itemLocationXY[(GameControl.getRandomInt(min, max))]);
        itemList[ItemList.coat.ordinal()] = coat;

        Item magicDoor = new Item();
        magicDoor.setDescription("The Magic Door");
        magicDoor.setName("Magic Door");
        magicDoor.setLocationX(itemLocationXY[(GameControl.getRandomInt(min, max))]);
        magicDoor.setLocationY(itemLocationXY[(GameControl.getRandomInt(min, max))]);
        itemList[ItemList.magicDoor.ordinal()] = magicDoor;

        return itemList;

    }

    static void assignScenesToLocations(Map map, Scene[] scenes) {
        Location[][] locations = map.getLocations();

        locations[0][0].setScene(scenes[SceneType.subwayOne.ordinal()]);
        locations[0][1].setScene(scenes[SceneType.subwayTwo.ordinal()]);
        locations[0][2].setScene(scenes[SceneType.subwayThree.ordinal()]);
        locations[0][3].setScene(scenes[SceneType.subwayFour.ordinal()]);
        locations[0][4].setScene(scenes[SceneType.subwayFive.ordinal()]);

        locations[1][0].setScene(scenes[SceneType.streetOne.ordinal()]);
        locations[1][1].setScene(scenes[SceneType.streetTwo.ordinal()]);
        locations[1][2].setScene(scenes[SceneType.streetThree.ordinal()]);
        locations[1][3].setScene(scenes[SceneType.streetFour.ordinal()]);
        locations[1][4].setScene(scenes[SceneType.streetFive.ordinal()]);

        locations[2][0].setScene(scenes[SceneType.apartmentOne.ordinal()]);
        locations[2][1].setScene(scenes[SceneType.apartmentTwo.ordinal()]);
        locations[2][2].setScene(scenes[SceneType.apartmentThree.ordinal()]);
        locations[2][3].setScene(scenes[SceneType.apartmentFour.ordinal()]);
        locations[2][4].setScene(scenes[SceneType.apartmentFive.ordinal()]);

        locations[3][0].setScene(scenes[SceneType.pharmacyOne.ordinal()]);
        locations[3][1].setScene(scenes[SceneType.pharmacyTwo.ordinal()]);
        locations[3][2].setScene(scenes[SceneType.pharmacyThree.ordinal()]);
        locations[3][3].setScene(scenes[SceneType.pharmacyFour.ordinal()]);
        locations[3][4].setScene(scenes[SceneType.pharmacyFive.ordinal()]);

        locations[4][0].setScene(scenes[SceneType.hospitalOne.ordinal()]);
        locations[4][1].setScene(scenes[SceneType.hospitalTwo.ordinal()]);
        locations[4][2].setScene(scenes[SceneType.hospitalThree.ordinal()]);
        locations[4][3].setScene(scenes[SceneType.hospitalFour.ordinal()]);
        locations[4][4].setScene(scenes[SceneType.hospitalFive.ordinal()]);
    }

    public static void saveGame(Game game, String filepath) throws GameControlExceptions{
        
        try( FileOutputStream fops = new FileOutputStream(filepath)) {
            ObjectOutputStream output = new ObjectOutputStream(fops);
            
            output.writeObject(game);
        }
        
        catch(Exception e){
            throw new GameControlExceptions(e.getMessage());
        }
        
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void getSavedGame(String filePath) throws GameControlExceptions{
        
        Game game = null;
        
        try ( FileInputStream fips = new FileInputStream(filePath)){
            ObjectInputStream input = new ObjectInputStream(fips);
            
            game = (Game) input.readObject();
        }
        
        catch(Exception e){
            throw new GameControlExceptions(e.getMessage());
        }
        
        Blackout.setCurrentGame(game);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    

}
