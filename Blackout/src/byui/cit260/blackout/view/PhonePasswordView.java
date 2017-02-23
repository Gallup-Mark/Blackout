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
    
    private final String banner;
    private String promptMessage = "Please enter the password:";
    private String promptMessage2 = "Please enter a value from 0 to 9:";
    private String promptMessage3 = "Please enter another value from 0 to 9:";
    private int password;
    private int phonePassword;
    
    public PhonePasswordView() {
        this.banner = "\n"
                + "\n------------------------------------------"
                + "\nYou will now have an opportunity to unlock your phone."
                + "\nPlease pay close attention to the following"
                + "\nAnd input what you are asked for and nothing else."
                + "\n------------------------------------------";
            System.out.println(banner);
    }
    
    public void displayPhonePasswordView(){
    
        int firstLetter = this.getFirstLetter();
        int secondLetter = this.getSecondLetter();
        int thirdLetter = this.getThirdLetter();
        int fourthLetter = this.getFourthLetter();
    
        password = PhoneControl.callPassword(firstLetter, secondLetter, thirdLetter, fourthLetter);
    
        phonePassword = this.getPhonePassword();
        
        this.checkPassword();

    }
    
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
    
    public void checkPassword(){
        if (password == phonePassword){
            System.out.println("The password is correct");
            //return for use when other code is finished
            //return true;
        }
        else {
            System.out.println("Incorrect Password");
            //return for use when other code is finished
            //return false;
        }
    }
}

