/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.blackout.control;

import byui.cit260.blackout.model.MessageList;
import byui.cit260.blackout.model.PhoneMessage;

/**
 *
 * @author Matthew
 */
public class PhoneControl {
    
    private static String messageBanner;
    private static final int NUM_MESSAGES = PhoneControl.createMessageList().length;
    private static PhoneMessage[] messageList;
    
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
    
//    public PhoneMessage[] displayMessagesView() {
//        
//        this.messageBanner = "\n----------------------------------------------------"
//                + "\nYour have " + numMessages + " messages"
//                +"\n---------------------------------------------------";
//        
//        System.out.println(messageBanner);
//        
//        messageList = PhoneControl.createMessageList();
//        
//        return messageList;
//    }
    
//    public PhoneMessage[] displayMessagesView() {
//        PhoneControl.messageBanner = "\n----------------------------------------------------"
//            + "\nYour have " + numMessages + " messages"
//            +"\n---------------------------------------------------";
//        
//        System.out.println(messageBanner);
//        
//        messageList = PhoneControl.createMessageList();
//        
//        
//        for(PhoneMessage message: messageList) {
//            
//            System.out.println(message);
//        }
//        
//        return messageList;
//        }

    public static PhoneMessage[] createMessageList() {
        
        PhoneMessage[] messageList = new PhoneMessage[3];
        
        PhoneMessage message1 = new PhoneMessage();
        message1.setFrom("Mom");
        message1.setMessage("Please don't forget to stop by the Pharmacy to pick up my meds");
        messageList[MessageList.message1.ordinal()] = message1; 
        
        PhoneMessage message2 = new PhoneMessage();
        message2.setFrom("The Wife");
        message2.setMessage("Don't forget to pick up your wallet at Bob's apartment.");
        messageList[MessageList.message2.ordinal()] = message2; 
        
        PhoneMessage message3 = new PhoneMessage();
        message3.setFrom("Bob");
        message3.setMessage("Hey man. I have your wallet.  Your forgot it here after the game");
        messageList[MessageList.message3.ordinal()] = message3; 
        
        
        
//        PhoneControl.messageBanner = "\n----------------------------------------------------"
//                + "\nYour have " + numMessages + " messages"
//                +"\n---------------------------------------------------";
//        
//        System.out.println(messageBanner);
//        
//        messageList = PhoneControl.createMessageList();
//        
//        
//        for(PhoneMessage message: messageList) {
//            
//            System.out.println(message);
//        }
//        
//        return messageList;
//        return messageList;
        return messageList;
        
        
        
    }
    
        public static PhoneMessage[] displayMessages() {
        PhoneControl.messageBanner = "\n----------------------------------------------------"
            + "\nYour have " + NUM_MESSAGES + " messages"
            +"\n---------------------------------------------------";
        
        System.out.println(messageBanner);
        
        messageList = PhoneControl.createMessageList();
        
        
        for(PhoneMessage message: messageList) {
            
            System.out.println(message);
        }
        
        return messageList;
        }


}
