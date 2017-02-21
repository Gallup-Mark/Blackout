/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.blackout.view;
import java.util.Scanner;

/**
 *
 * @author Matt
 */
public class TalkMenuView {
    
    private final String menu;
    private final String promptMessage = "\nPlease enter an option:";
    
    public TalkMenuView() {
        this.menu = "\n"
                + "\n------------------------------------------"
                + "\n |Talk Menu"
                + "\n------------------------------------------"
                + "\nT - Talk"
                + "\nY - Yell"
                + "\nA - Ask Question"
                + "\nW - Whisper"
                + "\nQ - Quit Menu"
                + "\n------------------------------------------";
            System.out.println(menu);
    }
    
    public void displayTalkMenuView() {
        boolean done = false;
        do {
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("Q")) {//user want to exit menu
                    GameMenuView gameMenu = new GameMenuView();
                    gameMenu.displayGameMenuView();
                    return;
            }
            
            done = this.doAction(menuOption);
            
        }  while (!done);    
    }

    private String getMenuOption() {
        Scanner keyboard = new Scanner(System.in);
        String value = "";
        boolean valid = false;
        
        while (!valid) {
            System.out.println("\n" + this.promptMessage);
            
            value = keyboard.nextLine();
            value = value.trim();
            
            if (value.length() > 1) {
                System.out.println("\nInvalid value: Choose a correct value");
                continue;
            }
            break;
        }
        return value;
    }
    
    private boolean doAction (String choice) {
        choice = choice.toUpperCase();
        
        switch (choice) {
            case "T" :
                this.talk();
                break;
            case "Y" :
                this.yell();
                break;
            case "A" :
                this.askQuestion();
                break;
            case "W" :
                this.whisper();
                break;
            case "Q" :
                this.quitMenu();
                break;
            default :
                System.out.println("\n*** Invalid selection. Please try again.***");
                break;
        }
        return false;
    }

    private void talk() {
        System.out.println("\n*** talk() function called ***");
    }

    private void yell() {
        System.out.println("\n*** yell() function called ***");
    }

    private void askQuestion() {
        System.out.println("\n*** askQuestion() function called ***");
    }

    private void whisper() {
        System.out.println("\n*** whisper() function called ***");
    }

    private void quitMenu() {
        System.out.println("\n*** quitMenu() function called ***");
    } 
    
}
