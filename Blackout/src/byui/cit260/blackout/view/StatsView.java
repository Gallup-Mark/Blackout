/*
 * After the player inputs the stats key from the Game Menu the program will display
 * the percentage of clues found, the total number of locations visited, and the time
 * remaining to find the antidote. Then it will redisplay the Game Menu.
 */
package byui.cit260.blackout.view;

/**
 *
 * @author Matt
 */
public class StatsView extends View {

    public StatsView() {
        super("\n"
                + "\n----------------------------------------------------------"
                + "\nCURRENT STATS"
                + "\n"
                + "\nPress S at anytime for Stats"
                + "\nPress Q at anytime to return to the Game Menu"
                + "\n----------------------------------------------------------");
    }
 
    
    @Override
    public boolean doAction(String value) {
        
        value = value.toUpperCase();
        
        switch(value) {
            case "S":
                this.statistics();
                break;
            case "Q":
                this.display();
                break;
            default:
                System.out.println("\n*** Invalid selection, try again");
                    break;
        }
        
/*        System.out.println("\nPercentage of Clues Found"
                            + "\n-------------------------");
        int percentOfClues = this.percentageOfClues();
        System.out.println(percentOfClues);
        
        
        System.out.println("\nNumber of Locations Visited"
                            + "\n---------------------------");
        int numLocationsVisited = this.numLocationsVisited();
        System.out.println(numLocationsVisited);
        
        
        System.out.println("\nTime Remaining to Find Antidote"
                            + "\n-------------------------------");
        int timeRemaining = this.timeRemaining();
        System.out.println(timeRemaining);*/
        
        
        return false; //temporary
    }
    
    private void statistics() {
        
        System.out.println("\nPercentage of Clues Found"
                           + "\n-------------------------");
        int percentOfClues = this.percentageOfClues();
        System.out.println(percentOfClues);
        
        
        System.out.println("\nNumber of Locations Visited"
                           + "\n---------------------------");
        int numLocationsVisited = this.numLocationsVisited();
        System.out.println(numLocationsVisited);
        
        
        System.out.println("\nTime Remaining to Find Antidote"
                           + "\n-------------------------------");
        int timeRemaining = this.timeRemaining();
        System.out.println(timeRemaining);
    }

    private int percentageOfClues() {
        System.out.println("***percentageOfClues method called***");
         return 1;
    }
    
    private int numLocationsVisited() {
         System.out.println("***numLocationsVisited method called***");
         return 1;
    }

    private int timeRemaining() {
         System.out.println("***timeRemaining method called***");
         return 1;
    }

    
    
}