/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.blackout.control;

/**
 *
 * @author Matthew
 */
public class PhoneControl {
    
    public static int callPassword(int firstLetter, int secondLetter, int thirdLetter, int fourthLetter){
    
        //firstletter validation
        if (firstLetter < 0){
            return -1;
        }
       
        if (firstLetter > 9){
            return -1;
        }
        
        //secondletter validation
        if (secondLetter < 0){
            return -1;
        }
        
        if (secondLetter > 9){
            return -1;
        }
        
        //thirdletter validation
        if (thirdLetter < 0){
            return -1;
        }
        
        if (thirdLetter > 9){
            return -1;
        }
        
        //fourthletter validation
        if (fourthLetter < 0){
            return -1;
        }
        
        if (fourthLetter > 9){
            return -1;
        }
        
        //password calculation
        int difference = firstLetter - secondLetter;
        double differenceTwo = Math.sqrt(difference);
        double differenceThree = Math.pow(differenceTwo, 2);
        int differenceFour = thirdLetter - fourthLetter;
        double differenceFive = Math.pow(differenceFour, 2);
        double password = differenceThree + differenceFive;
        
        return (int) password;
        
    }
    
}
