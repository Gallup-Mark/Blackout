/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.blackout.view;
import byui.cit260.blackout.control.PhoneControl;
import java.util.Scanner;

/**
 *
 * @author Matt
 */
public class PhonePasswordView {
    
    private final String promptMessage = "Please enter the password:";
    private final String promptMessage2 = "Please enter a value from 0 to 9:";
    private final String promptMessage3 = "Please enter another value from 0 to 9:";
    
    int firstLetter = this.getFirstLetter();
    int secondLetter = this.getSecondLetter();
    int thirdLetter = this.getThirdLetter();
    int fourthLetter = this.getFourthLetter();
    
    int password = PhoneControl.callPassword(firstLetter, secondLetter, thirdLetter, fourthLetter);
    
    int phonePassword = this.getPhonePassword();
    
    private int getPhonePassword() {
        Scanner keyboard = new Scanner(System.in);
        int value = 0;
        boolean valid = false;
        
        while (!valid) {
            System.out.println("\n" + this.promptMessage);
            
            value = keyboard.nextInt();
            
            if (value < 0) {
                System.out.println("\nInvalid value: Choose a correct value");
                continue;
            }
            break;
        }
        return value;
    }

    private int getFirstLetter() {
        Scanner keyboard = new Scanner(System.in);
        int value = 0;
        boolean valid = false;
        
        while (!valid) {
            System.out.println("\n" + this.promptMessage2);
            
            value = keyboard.nextInt();
            
            if (value < 0 || value > 9) {
                System.out.println("\nInvalid value: Choose a correct value");
                continue;
            }
            break;
        }
        return value;
    }

    private int getSecondLetter() {
        Scanner keyboard = new Scanner(System.in);
        int value = 0;
        boolean valid = false;
        
        while (!valid) {
            System.out.println("\n" + this.promptMessage3);
            
            value = keyboard.nextInt();
            
            if (value < 0 || value > 9) {
                System.out.println("\nInvalid value: Choose a correct value");
                continue;
            }
            break;
        }
        return value;
    }

    private int getThirdLetter() {
        Scanner keyboard = new Scanner(System.in);
        int value = 0;
        boolean valid = false;
        
        while (!valid) {
            System.out.println("\n" + this.promptMessage3);
            
            value = keyboard.nextInt();
            
            if (value < 0 || value > 9) {
                System.out.println("\nInvalid value: Choose a correct value");
                continue;
            }
            break;
        }
        return value;
    }

    private int getFourthLetter() {
        Scanner keyboard = new Scanner(System.in);
        int value = 0;
        boolean valid = false;
        
        while (!valid) {
            System.out.println("\n" + this.promptMessage3);
            
            value = keyboard.nextInt();
            
            if (value < 0 || value > 9) {
                System.out.println("\nInvalid value: Choose a correct value");
                continue;
            }
            break;
        }
        return value;
    }
}
