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
        
        Scene subwayOne = new Scene();
        subwayOne.setDescription("Crummy old subway where there was a crash One");
        subwayOne.setMapSymbol("; )");
        subwayOne.setNonPlayer(NonPlayer.Thug1);
        subwayOne.setNumberItems(2);
        //update ascii art  here
        
        subwayOne.setArtForScreen(" " 
 + "\n          ~~~~ ____   |~~~~~~~~~~~~~|"
 + "\nY_,___|[]|   | Subway Car   |"
 + "\n{|_|_|_|PU|_,_|_____________|"
+" \n//oo---OO=OO     OOO     OOO"
         );
        
        scenes[SceneType.subwayOne.ordinal()] = subwayOne;
        
        
        
        Scene subwayTwo = new Scene();
        subwayTwo.setDescription("Crummy old subway where there was a crash Two");
        subwayTwo.setMapSymbol("; )");
        subwayTwo.setNonPlayer(NonPlayer.Thug1);
        subwayTwo.setNumberItems(2);
        scenes[SceneType.subwayTwo.ordinal()] = subwayTwo;
        
        Scene subwayThree = new Scene();
        subwayThree.setDescription("Crummy old subway where there was a crash Three");
        subwayThree.setMapSymbol("; )");
        subwayThree.setNonPlayer(NonPlayer.Thug1);
        subwayThree.setNumberItems(2);
        scenes[SceneType.subwayThree.ordinal()] = subwayThree;
        
        Scene subwayFour = new Scene();
        subwayFour.setDescription("Crummy old subway where there was a crash Four");
        subwayFour.setMapSymbol("; )");
        subwayFour.setNonPlayer(NonPlayer.Thug1);
        subwayFour.setNumberItems(2);
        scenes[SceneType.subwayFour.ordinal()] = subwayFour;
        
        Scene subwayFive = new Scene();
        subwayFive.setDescription("Crummy old subway where there was a crash Five");
        subwayFive.setMapSymbol("; )");
        subwayFive.setNonPlayer(NonPlayer.Thug1);
        subwayFive.setNumberItems(2);
        scenes[SceneType.subwayFive.ordinal()] = subwayFive;
        
        
        Scene apartmentOne = new Scene();
        apartmentOne.setDescription("Billy Redneck Suites One");
        apartmentOne.setMapSymbol("; (");
        apartmentOne.setNonPlayer(NonPlayer.PoliceManJoe);
        apartmentOne.setNumberItems(1);
        scenes[SceneType.apartmentOne.ordinal()] = apartmentOne;
        
        Scene apartmentTwo = new Scene();
        apartmentTwo.setDescription("Billy Redneck Suites Two");
        apartmentTwo.setMapSymbol("; (");
        apartmentTwo.setNonPlayer(NonPlayer.PoliceManJoe);
        apartmentTwo.setNumberItems(1);
        scenes[SceneType.apartmentTwo.ordinal()] = apartmentTwo;
        
        Scene apartmentThree = new Scene();
        apartmentThree.setDescription("Billy Redneck Suites Three");
        apartmentThree.setMapSymbol("; (");
        apartmentThree.setNonPlayer(NonPlayer.PoliceManJoe);
        apartmentThree.setNumberItems(1);
        scenes[SceneType.apartmentThree.ordinal()] = apartmentThree;
        
        Scene apartmentFour = new Scene();
        apartmentFour.setDescription("Billy Redneck Suites Four");
        apartmentFour.setMapSymbol("; (");
        apartmentFour.setNonPlayer(NonPlayer.PoliceManJoe);
        apartmentFour.setNumberItems(1);
        scenes[SceneType.apartmentFour.ordinal()] = apartmentFour;
        
        Scene apartmentFive = new Scene();
        apartmentFive.setDescription("Billy Redneck Suites Five");
        apartmentFive.setMapSymbol("; (");
        apartmentFive.setNonPlayer(NonPlayer.PoliceManJoe);
        apartmentFive.setNumberItems(1);
        scenes[SceneType.apartmentFive.ordinal()] = apartmentFive;
        
        
        
        Scene streetOne = new Scene();
        streetOne.setDescription("Main Street One");
        streetOne.setMapSymbol("; 0");
        streetOne.setNonPlayer(NonPlayer.Thug3);
        streetOne.setNumberItems(1);
        scenes[SceneType.streetOne.ordinal()] = streetOne;
        
        Scene streetTwo = new Scene();
        streetTwo.setDescription("Main Street Two");
        streetTwo.setMapSymbol("; 0");
        streetTwo.setNonPlayer(NonPlayer.Thug3);
        streetTwo.setNumberItems(1);
        scenes[SceneType.streetTwo.ordinal()] = streetTwo;
        
        Scene streetThree = new Scene();
        streetThree.setDescription("Main Street Three");
        streetThree.setMapSymbol("; 0");
        streetThree.setNonPlayer(NonPlayer.Thug3);
        streetThree.setNumberItems(1);
        scenes[SceneType.streetThree.ordinal()] = streetThree;
        
        Scene streetFour = new Scene();
        streetFour.setDescription("Main Street Four");
        streetFour.setMapSymbol("; 0");
        streetFour.setNonPlayer(NonPlayer.Thug3);
        streetFour.setNumberItems(1);
        scenes[SceneType.streetFour.ordinal()] = streetFour;
        
        Scene streetFive = new Scene();
        streetFive.setDescription("Main Street Five");
        streetFive.setMapSymbol("; 0");
        streetFive.setNonPlayer(NonPlayer.Thug3);
        streetFive.setNumberItems(1);
        scenes[SceneType.streetFive.ordinal()] = streetFive;
        
        
        Scene pharmacyOne = new Scene();
        pharmacyOne.setDescription("Old Joe's Drugs One");
        pharmacyOne.setMapSymbol("; P");
        pharmacyOne.setNonPlayer(NonPlayer.Thug2);
        pharmacyOne.setNumberItems(0);
        scenes[SceneType.pharmacyOne.ordinal()] = pharmacyOne;
        
        Scene pharmacyTwo = new Scene();
        pharmacyTwo.setDescription("Old Joe's Drugs Two");
        pharmacyTwo.setMapSymbol("; P");
        pharmacyTwo.setNonPlayer(NonPlayer.Thug2);
        pharmacyTwo.setNumberItems(0);
        scenes[SceneType.pharmacyTwo.ordinal()] = pharmacyTwo;
        
        Scene pharmacyThree = new Scene();
        pharmacyThree.setDescription("Old Joe's Drugs Three");
        pharmacyThree.setMapSymbol("; P");
        pharmacyThree.setNonPlayer(NonPlayer.Thug2);
        pharmacyThree.setNumberItems(0);
        scenes[SceneType.pharmacyThree.ordinal()] = pharmacyThree;
        
        Scene pharmacyFour = new Scene();
        pharmacyFour.setDescription("Old Joe's Drugs Four");
        pharmacyFour.setMapSymbol("; P");
        pharmacyFour.setNonPlayer(NonPlayer.Thug2);
        pharmacyFour.setNumberItems(0);
        scenes[SceneType.pharmacyFour.ordinal()] = pharmacyFour;
        
        Scene pharmacyFive = new Scene();
        pharmacyFive.setDescription("Old Joe's Drugs Five");
        pharmacyFive.setMapSymbol("; P");
        pharmacyFive.setNonPlayer(NonPlayer.Thug2);
        pharmacyFive.setNumberItems(0);
        scenes[SceneType.pharmacyFive.ordinal()] = pharmacyFive;
        
        Scene hospitalOne = new Scene();
        hospitalOne.setDescription("St. Granny Crack Memorial Hospital One");
        hospitalOne.setMapSymbol("; X");
        hospitalOne.setNonPlayer(NonPlayer.PoliceManJoe);
        hospitalOne.setNumberItems(1);
        scenes[SceneType.hospitalOne.ordinal()] = hospitalOne;
        
        Scene hospitalTwo = new Scene();
        hospitalTwo.setDescription("St. Granny Crack Memorial Hospital Two");
        hospitalTwo.setMapSymbol("; X");
        hospitalOne.setNonPlayer(NonPlayer.PoliceManJoe);
        hospitalTwo.setNumberItems(1);
        scenes[SceneType.hospitalTwo.ordinal()] = hospitalTwo;
        
        Scene hospitalThree = new Scene();
        hospitalThree.setDescription("St. Granny Crack Memorial Hospital Three");
        hospitalThree.setMapSymbol("; X");
        hospitalThree.setNonPlayer(NonPlayer.PoliceManJoe);
        hospitalThree.setNumberItems(1);
        scenes[SceneType.hospitalThree.ordinal()] = hospitalThree;
        
        Scene hospitalFour = new Scene();
        hospitalFour.setDescription("St. Granny Crack Memorial Hospital Four");
        hospitalFour.setMapSymbol("; X");
        hospitalFour.setNonPlayer(NonPlayer.PoliceManJoe);
        hospitalFour.setNumberItems(1);
        scenes[SceneType.hospitalFour.ordinal()] = hospitalFour;
        
        Scene hospitalFive = new Scene();
        hospitalFive.setDescription("St. Granny Crack Memorial Hospital Five");
        hospitalFive.setMapSymbol("; X");
        hospitalFive.setNonPlayer(NonPlayer.PoliceManJoe);
        hospitalFive.setNumberItems(1);
        scenes[SceneType.hospitalFive.ordinal()] = hospitalFive;
        
        return scenes;
        
        
    
    }
    
    public static void movePlayerToStartingLocation(Map map) {
     // If starting location is not supposed to be 0,0 then use the correct values here.
        movePlayer(map, 0, 0);
    }


    public static void movePlayer(Map map, int row, int column) {
        map.setCurrentLocation(map.getLocations()[row][column]);
        map.getCurrentLocation().setVisited(true);
        map.setCurrentRow(row);
        map.setCurrentColumn(column);

    }
    
}
