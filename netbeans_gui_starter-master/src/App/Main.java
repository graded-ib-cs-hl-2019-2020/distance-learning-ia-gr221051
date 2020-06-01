package App;

/**
 *
 * @author novac
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    private static GUI gui;
    private static int count = 0;
    private static int numDice = 0;
    private static int numSides = 0;
    private static int results[];
    //private static int rand;
    
    
    public static void main(String[] args) {
        /* Create and display the GUI */
        gui = new GUI();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                gui.setVisible(true);
            }
        });
    }

    public static void moreDice() {
        numDice++;
        gui.setDiceCount("" + numDice);
    }

    public static void lessDice() {
        if(numDice > 0){
        numDice--;
        gui.setDiceCount("" + numDice);
        }
    }

    public static void moreSides() {
        numSides++;
        gui.setSideCount("" + numSides);
    }

    public static void lessSides() {
        if(numSides >0){
        numSides--;
        gui.setSideCount("" + numSides);
        }
    }
    
    public static void displayResult() {
        results = new int[numDice + 1];

        while(count < numDice) {
            int maxSides = numSides;
            int min = 1;
            int range = maxSides - min + 1;

            for (int i = 0; i < maxSides; i++) {
                int rand = (int) (Math.random() * range) + min;
                results[count] = rand;
                count++;
            }
        }
        //Table goes here
    }
}
