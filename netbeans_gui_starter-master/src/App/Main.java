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
    
    public static void main(String[] args) {
        /* Create and display the GUI */
        gui = new GUI();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                gui.setVisible(true);
            }
        });
    }
    
    public static void btnTheButtonPressed() {
        count++;
        gui.setButtonText("Pressed " + count + " times!");
    }
    
}
