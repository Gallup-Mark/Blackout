
package byui.cit260.blackout.control;

import blackout.Blackout;
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

/**
 *
 * @author mgallup
 */
public class GameControl {
    
    public static Game game;
    
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
        //System.out.println("\n*** createNewGame stub function called ***");
        
        game = new Game();
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
   

    public static Item[] createItemList() {
        Item[] itemList = new Item[5];
        
        Item watch = new Item();
        watch.setDescription("Broken watch time: 12:00 am");
        watch.setName("Apple Watch");
        watch.setClue("Crash in subway");
        itemList[ItemList.watch.ordinal()] = watch;
        
        
        Item newsPaper = new Item();
        newsPaper.setDescription("Yesterday's Paper");
        newsPaper.setName("Washington Post");
        newsPaper.setClue("Poison outbreak");
        itemList[ItemList.newsPaper.ordinal()] = newsPaper;
        
        Item hat = new Item();
        hat.setDescription("Ball cap");
        hat.setName("NY Giants");
        hat.setClue("Initials: A.B.C.");
        itemList[ItemList.hat.ordinal()] = hat;
        
        Item wallet = new Item();
        wallet.setDescription("Duct Tape Wallet");
        wallet.setName("Pink fluffy unicorn ducktape wallet");
        wallet.setClue("Happy Birthday Daddy 2015");
        itemList[ItemList.wallet.ordinal()] = wallet;
        
        Item note = new Item();
        note.setDescription("Note");
        note.setName("Paper note");
        note.setClue("Meet me at apartment 3");
        itemList[ItemList.note.ordinal()] = note;
        
        return itemList;
        
        
    }

    static void assignScenesToLocations(Map map, Scene[] scenes) {
        Location[][] locations = map.getLocations();
        
        locations[0][0].setScene(scenes[SceneType.subway.ordinal()]);
        locations[0][1].setScene(scenes[SceneType.subway.ordinal()]);
        locations[0][2].setScene(scenes[SceneType.subway.ordinal()]);
        locations[0][3].setScene(scenes[SceneType.subway.ordinal()]);
        locations[0][4].setScene(scenes[SceneType.subway.ordinal()]);
        
        locations[1][0].setScene(scenes[SceneType.street.ordinal()]);
        locations[1][1].setScene(scenes[SceneType.street.ordinal()]);
        locations[1][2].setScene(scenes[SceneType.street.ordinal()]);
        locations[1][3].setScene(scenes[SceneType.street.ordinal()]);
        locations[1][4].setScene(scenes[SceneType.street.ordinal()]);
        
        locations[2][0].setScene(scenes[SceneType.apartment.ordinal()]);
        locations[2][1].setScene(scenes[SceneType.apartment.ordinal()]);
        locations[2][2].setScene(scenes[SceneType.apartment.ordinal()]);
        locations[2][3].setScene(scenes[SceneType.apartment.ordinal()]);
        locations[2][4].setScene(scenes[SceneType.apartment.ordinal()]);
        
        locations[3][0].setScene(scenes[SceneType.pharmacy.ordinal()]);
        locations[3][1].setScene(scenes[SceneType.pharmacy.ordinal()]);
        locations[3][2].setScene(scenes[SceneType.pharmacy.ordinal()]);
        locations[3][3].setScene(scenes[SceneType.pharmacy.ordinal()]);
        locations[3][4].setScene(scenes[SceneType.pharmacy.ordinal()]);
        
        locations[4][0].setScene(scenes[SceneType.hospital.ordinal()]);
        locations[4][1].setScene(scenes[SceneType.hospital.ordinal()]);
        locations[4][2].setScene(scenes[SceneType.hospital.ordinal()]);
        locations[4][3].setScene(scenes[SceneType.hospital.ordinal()]);
        locations[4][4].setScene(scenes[SceneType.hospital.ordinal()]);
    }
    
    
}
