/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.blackout.control;

import byui.cit260.blackout.model.Item;
import byui.cit260.blackout.model.ItemList;
import byui.cit260.blackout.model.Map;
import byui.cit260.blackout.model.NonPlayer;
import byui.cit260.blackout.model.Scene;
import byui.cit260.blackout.model.SceneType;

/**
 *
 * @author Matthew
 */
public class MapControl {

    //public static Map map;
    
    static Map createMap() {
       Map map = new Map(5, 5);
        
        Scene[] scenes = createScenes();
        
        GameControl.assignScenesToLocations(map, scenes);
        
        //System.out.println("\n***creatMap()***");
        
        return map;
    }

    private static Scene[] createScenes() {
        
        Scene[] scenes = new Scene[SceneType.values().length];
        
//        subway,
//    appartment,
//    street,
//    pharmacy,
//    hospital
        
        Scene subway = new Scene();
        subway.setDescription("Crummy old subway where there was a crash");
        subway.setMapSymbol("; )");
        subway.setNonPlayer(NonPlayer.Thug1);
        subway.setNumberItems(2);
        scenes[SceneType.subway.ordinal()] = subway;
        
        
        Scene apartment = new Scene();
        apartment.setDescription("Billy Redneck Suites");
        apartment.setMapSymbol("; (");
        apartment.setNonPlayer(NonPlayer.PoliceManJoe);
        apartment.setNumberItems(1);
        scenes[SceneType.apartment.ordinal()] = apartment;
        
        Scene street = new Scene();
        street.setDescription("Main Street");
        street.setMapSymbol("; 0");
        street.setNonPlayer(NonPlayer.Thug3);
        street.setNumberItems(1);
        scenes[SceneType.street.ordinal()] = street;
        
        Scene pharmacy = new Scene();
        pharmacy.setDescription("Old Joe's Drugs");
        pharmacy.setMapSymbol("; P");
        pharmacy.setNonPlayer(NonPlayer.Thug2);
        pharmacy.setNumberItems(0);
        scenes[SceneType.pharmacy.ordinal()] = pharmacy;
        
        Scene hospital = new Scene();
        hospital.setDescription("St. Granny Crack Memorial Hospital");
        hospital.setMapSymbol("; X");
        hospital.setNonPlayer(NonPlayer.PoliceManJoe);
        hospital.setNumberItems(1);
        scenes[SceneType.hospital.ordinal()] = hospital;
        
        return scenes;
        
        
    
    }
    
}
