package Mario.Printers;

import Mario.Print;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by Nick on 4/24/2016.
 */
public class PrintToFile implements Print {
    private File file;
    private BufferedWriter bw;
    private int row_length;
    private String pyramid;

    public PrintToFile(int row_length) {
        this.file = new File("mario.txt");
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
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file.getAbsoluteFile(), true));
        PrintWriter out = new PrintWriter(bw)) {
          buildPyramid();
          bw.write(pyramid);
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }

}
