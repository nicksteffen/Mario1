package Mario;

import Mario.Printers.PrintToFile;
import Mario.Printers.PrintToTerminal;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Mario {
  public static void main (String[] args) {
    System.out.println("Enter 1 to print to file or 2 to print to terminal");
    Scanner in = new Scanner(System.in);
    int choice = in.nextInt();
    System.out.println("Choice the height of the half-pyramid");
    int row_length;
    do {
      row_length = in.nextInt();
    }
    while (0 > row_length || row_length > 23);

    for (int i = 0; i < row_length; i++) {
      int num_hashes = i + 2;
      int num_spaces = row_length + 1 - num_hashes;
      StringBuilder level = new StringBuilder();
      for (int j = 0; j < num_spaces; j++) {
        level.append(" ");
      }
      for (int j = 0; j < num_hashes; j++) {
        level.append("#");
      }
      level.append("\n");
      String this_level = level.toString();
      if (choice == 1) {
        PrintToFile print1 = new PrintToFile(this_level);
        print1.printOut();

      }
      else if (choice == 2) {
        PrintToTerminal print2 = new PrintToTerminal(this_level);
        print2.printOut();

      }
    }

  }
}
