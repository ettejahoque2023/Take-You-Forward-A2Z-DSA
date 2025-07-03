// the function printNumber which takes an integer input from the user and prints it on the screen.
import java.util.*;
public class UserIO {
    public static void main(String[] args) {
      Scanner input =new Scanner (System.in);  
      int a = input.nextInt();
      System.out.println(a);
      input.close();
    }
}
