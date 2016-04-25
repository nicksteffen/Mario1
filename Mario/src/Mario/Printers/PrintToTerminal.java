package Mario.Printers;

import Mario.Print;


/**
 * Created by Nick on 4/24/2016.
 */
public class PrintToTerminal implements Print {

    private String level;

    public PrintToTerminal( String level) {
        this.level = level;
    }

    public void printOut() {
        System.out.println(level);
    }
}
