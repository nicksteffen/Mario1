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
    if (choice == 1) {
      PrintToFile print1 = new PrintToFile(row_length);
      print1.printOut();
    }
    else if (choice == 2) {
      PrintToTerminal print2 = new PrintToTerminal(row_length);
      print2.printOut();
    }
  }
}
