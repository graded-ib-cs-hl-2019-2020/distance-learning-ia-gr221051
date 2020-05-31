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
    private static int result = 0;
    
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
    
//    public static diceRolls(){
//                count++;
//        gui.setButtonText("Pressed " + count + " times!");
//    }
}
