package App;

/**
 *
 * @author novac
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static GUI gui;
    private static int count = 0;
    private static int numDice = 1;
    private static int numSides = 2;
    private static int results[];
    private static String list = "";

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
        if (numDice > 1) {
            numDice--;
            gui.setDiceCount("" + numDice);
        }
    }

    public static void moreSides() {
        numSides++;
        gui.setSideCount("" + numSides);
    }

    public static void lessSides() {
        if (numSides > 2) {
            numSides--;
            gui.setSideCount("" + numSides);
        }
    }

    public static void displayResult() {
        //Since count, list, and results[] will change later in this function, 
        //I need to reset them in the start to make it so the next time my client
        //clicks roll!, the answer box will clear and a new set of numbers will appear.
        count = 0;
        list = "";
        results = null;
        gui.setResultBox("");
        results = new int[10000];           //length set to large number, allowing a large number of rolls. 

        while (count < numDice) {
            int maxSides = numSides;
            int min = 1;
            int range = maxSides - min + 1;        //range not necessary, but could be used in other situations when the minumum is more than 1.

            for (int i = 0; i < maxSides; i++) {
                int rand = (int) (Math.random() * range) + min;
                results[count] = rand;             //filling results array w/ random numbers
                count++;
            }
        }
        count = 0;
        while (count < numDice) {
            if (count != numDice - 1) {
                list += results[count] + ", ";
            } else {
                list += results[count] + ".";
            }
            count++;
            //fills list String with each random number in array, seperated by commas, ending in a period.
        }
        gui.setResultBox(list);   //places list inside answer box
    }
}
