/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.blackout.control;

/**
 *
 * @author Brian
 */
public class DoorUnLockControl {
    
    
       public double unLockDoorWithCode(int keyCode, double playLbs, int doorNo){
        
        //let all the function agruemnts double becuase don't want to deal with parsing/rounding issues
        
        
        //check for invlaid playerLbs
        if(playLbs <= 50){
            return -1;
        }
        
        //check for invalid keyCode
        if(keyCode < 0 || keyCode >= 10){
            return -2;
        }
        
        
        //check for invalid door
        //options are doors 1 through 25
        if(doorNo <= 0 || doorNo >= 26){
            return -3;
        }
        
        //let all the function agruemnts double becuase don't want to deal with parsing/rounding issues
        if( (keyCode * Math.PI)  / playLbs >= ( Math.abs( Math.sqrt(doorNo)) - 23) ){
            return 1;
        } else {
            return 0;
        }
        
    }
}
