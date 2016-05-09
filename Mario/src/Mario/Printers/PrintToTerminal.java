package Mario.Printers;

import Mario.Print;


/**
 * Created by Nick on 4/24/2016.
 */
public class PrintToTerminal implements Print {
    private int row_length;
    private String pyramid;


    public PrintToTerminal(int row_length) {
      this.row_length = row_length;
    }

    public String buildLine(int row_length, int row_number) {
        StringBuilder level = new StringBuilder();
        int num_hashes = row_number + 2;
        int num_spaces = row_length + 1 - num_hashes;
        for (int j = 0; j < num_spaces; j++) {
            level.append(" ");
        }
        for (int j = 0; j < num_hashes; j++) {
            level.append("#");
        }
        level.append("\n");
        String this_level = level.toString();
        return this_level;
    }

    public void buildPyramid() {
        StringBuilder temp = new StringBuilder();
        for (int i = 0; i < row_length; i++) {
            temp.append(buildLine(row_length, i));
        }
        pyramid = temp.toString();
    }
    public void printOut() {
      buildPyramid();
      System.out.println(pyramid);
    }
}
