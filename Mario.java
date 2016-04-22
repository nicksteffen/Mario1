import java.util.Scanner;

public class Mario {
  public static void main (String[] args) {
    Scanner in = new Scanner(System.in);
    int row_length;
    do {
      row_length = in.nextInt();
    }
    while(0 > row_length || row_length  > 23);

  for(int i = 0; i < row_length; i++) {
    int num_hashes = i + 2;
    int num_spaces = row_length + 1 - num_hashes;
    StringBuilder level = new StringBuilder();
    for (int j = 0; j < num_spaces; j++) {
      level.append(" ");
    }
    for (int j = 0; j < num_hashes; j++) {
      level.append("#");
    }
    System.out.println(level.toString());
  }
  }

}
