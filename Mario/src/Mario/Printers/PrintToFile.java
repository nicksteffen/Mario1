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
    private String level;
    private File file;
    private BufferedWriter bw;

    public PrintToFile(String level) {
        this.file = new File("mario.txt");
        this.level = level;
    }

    public void printOut() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file.getAbsoluteFile(), true));
        PrintWriter out = new PrintWriter(bw)) {
            bw.write(level);
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }

}
