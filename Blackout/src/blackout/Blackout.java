/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackout;

import byui.cit260.blackout.model.Backpack;
import byui.cit260.blackout.model.Player;

/**
 *
 * @author Matthew
 */
public class Blackout {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
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
        
    }
    
}
