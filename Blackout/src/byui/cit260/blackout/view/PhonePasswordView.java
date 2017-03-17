/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.blackout.view;

import byui.cit260.blackout.control.PhoneControl;
import byui.cit260.blackout.exceptions.PhoneControlException;
import byui.cit260.blackout.model.PhoneMessage;
import static java.lang.Integer.parseInt;
import java.util.Scanner;

/**
 *
 * @author Matt
 */
public class PhonePasswordView {

    private final String banner;
    private final String promptMessage = "Please enter the password:";
    private final String promptMessage2 = "Please enter a value from 0 to 9:";
    private final String promptMessage3 = "Please enter another value from 0 to 9:";
    private int password;
    private int phonePassword;
    private PhoneMessage[] messageList;
//    private String messageBanner;
//    private final int numMessages = PhoneControl.createMessageList().length;
//    private PhoneMessage[] messageList;

    public PhonePasswordView() {
        this.banner = "\n"
                + "\n------------------------------------------"
                + "\nYou will now have an opportunity to unlock your phone."
                + "\nPlease pay close attention to the following"
                + "\nAnd input what you are asked for and nothing else."
                + "\n------------------------------------------";
        System.out.println(banner);
    }

    public void displayPhonePasswordView() {

        int firstLetter;
        try {
            firstLetter = this.getFirstLetter();
        } catch (PhoneControlException ex) {
            System.out.println(ex.getMessage());
            return;
        } catch (Throwable te) {
            System.out.println(te.getMessage());
            return;
        }

        int secondLetter;
        try {
            secondLetter = this.getSecondLetter();
        } catch (PhoneControlException ex) {
            System.out.println(ex.getMessage());
            return;
        } catch (Throwable te) {
            System.out.println(te.getMessage());
            return;
        }

        int thirdLetter;
        try {
            thirdLetter = this.getThirdLetter();
        } catch (PhoneControlException ex) {
            System.out.println(ex.getMessage());
            return;
        } catch (Throwable te) {
            System.out.println(te.getMessage());
            return;
        }

        int fourthLetter;
        try {
            fourthLetter = this.getFourthLetter();
        } catch (PhoneControlException ex) {
            System.out.println(ex.getMessage());
            return;
        } catch (Throwable te) {
            System.out.println(te.getMessage());
            return;
        }

        try {
            password = PhoneControl.callPassword(firstLetter, secondLetter, thirdLetter, fourthLetter);
        } catch (PhoneControlException ex) {
            System.out.println(ex.getMessage());
            return;
        } catch (Throwable te) {
            System.out.println(te.getMessage());
            te.printStackTrace();
            return;
        }

        try {
            phonePassword = this.getPhonePassword();
        } catch (PhoneControlException ex) {
            System.out.println(ex.getMessage());
            return;
        } catch (Throwable te) {
            System.out.println(te.getMessage());
            return;
        }

        this.checkPassword();

        if (password == phonePassword) {
            messageList = PhoneControl.createMessageList();
        }

    }

    private int getPhonePassword() throws PhoneControlException {
        Scanner keyboard = new Scanner(System.in);
        String value;
        int number = 0;
        boolean valid = false;

        while (!valid) {
            System.out.println("\n" + this.promptMessage);

            value = keyboard.next();

            try {
                number = parseInt(value);
            } catch (NumberFormatException nf) {
                System.out.println("\nInvalid input. Please enter a number between 0 and 9 inclusive:");
                continue;
            }

            if (number < 0) {
                System.out.println("\nInvalid value: Choose a correct value");
                continue;
            }
            break;
        }
        return number;
    }

//    {
//        Scanner keyboard = new Scanner(System.in);
//        int value = 0;
//        boolean valid = false;
//        
//        while (!valid) {
//            System.out.println("\n" + this.promptMessage);
//            
//            value = keyboard.nextInt();
//            
//            if (value < 0) {
//                System.out.println("\nInvalid value: Choose a correct value");
//                continue;
//            }
//            break;
//        }
//        return value;
//    }
    private int getFirstLetter() throws PhoneControlException {
        Scanner keyboard = new Scanner(System.in);
        String value;
        int number = 0;
        boolean valid = false;

        while (!valid) {
            System.out.println("\n" + this.promptMessage2);

            value = keyboard.next();

            try {
                number = parseInt(value);
            } catch (NumberFormatException nf) {
                System.out.println("\nInvalid input. Please enter a number between 0 and 9 inclusive:");
                continue;
            }

            if (number < 0 || number > 9) {
                System.out.println("\nInvalid value: Choose a correct value");
                continue;
            }
            break;
        }
        return number;
    }

    private int getSecondLetter() throws PhoneControlException {
        Scanner keyboard = new Scanner(System.in);
        String value;
        int number = 0;
        boolean valid = false;

        while (!valid) {
            System.out.println("\n" + this.promptMessage3);

            value = keyboard.next();

            try {
                number = parseInt(value);
            } catch (NumberFormatException nf) {
                System.out.println("\nInvalid input. Please enter a number between 0 and 9 inclusive:");
                continue;
            }

            if (number < 0 || number > 9) {
                System.out.println("\nInvalid value: Choose a correct value");
                continue;
            }
            break;
        }
        return number;
    }

    private int getThirdLetter() throws PhoneControlException {
        Scanner keyboard = new Scanner(System.in);
        String value;
        int number = 0;
        boolean valid = false;

        while (!valid) {
            System.out.println("\n" + this.promptMessage3);

            value = keyboard.next();

            try {
                number = parseInt(value);
            } catch (NumberFormatException nf) {
                System.out.println("\nInvalid input. Please enter a number between 0 and 9 inclusive:");
                continue;
            }

            if (number < 0 || number > 9) {
                System.out.println("\nInvalid value: Choose a correct value");
                continue;
            }
            break;
        }
        return number;
    }

    private int getFourthLetter() throws PhoneControlException {
        Scanner keyboard = new Scanner(System.in);
        String value;
        int number = 0;
        boolean valid = false;

        while (!valid) {
            System.out.println("\n" + this.promptMessage3);

            value = keyboard.next();

            try {
                number = parseInt(value);
            } catch (NumberFormatException nf) {
                System.out.println("\nInvalid input. Please enter a number between 0 and 9 inclusive:");
                continue;
            }

            if (number < 0 || number > 9) {
                System.out.println("\nInvalid value: Choose a correct value");
                continue;
            }
            break;
        }
        return number;
    }

    public void checkPassword() {
        if (password == phonePassword) {
            System.out.println("The password is correct"
                    + "\n You may now read your messages");
            messageList = PhoneControl.displayMessages();
            //return for use when other code is finished
            //return true;
        } else {
            System.out.println("Incorrect Password");
            //return for use when other code is finished
            //return false;
        }
    }

//    private void displayMessagesView() {
//        
//        this.messageBanner = "\n----------------------------------------------------"
//                + "\nYour have " + numMessages + " messages"
//                +"\n---------------------------------------------------";
//        
//        System.out.println(messageBanner);
//        
//        messageList = PhoneControl.createMessageList();
//        
//        
//    }
}
