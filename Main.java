import java.util.Scanner;
/**
 * Makes a square of stars
 * @jacoe0850 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //make scanner for input
    Scanner input = new Scanner(System.in);
    // ask for number and make variable
    System.out.println("Please enter a number between 1 and 10");
    int num = input.nextInt();
// for loop calculates how large will be and prints it
    for(int i=1; i<= num; i++){
      for(int j=1; j<= num; j++){
      System.out.print("*");
    }
    System.out.println();
  }
  }
}
