import java.util.Scanner;

public class ConditionalStatement {

   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      //taking input for age1
      System.out.println("Give input for age1:");
      int age1 = input.nextInt();

      //IF STATEMENT
      if (age1 >= 18) {
         System.out.println(" She is eligible for vote");
      }

      System.out.println("Give input for age2:");
      int age3 = input.nextInt();
      //IF - ELSE STATEMENT
      if (age3 >= 18) {
         System.out.println("She is eligible for vote");
      } else {
         System.out.println("She is not eligible for vote");
      }

      //IF -ELSE IF - ELSE STATEMENT
      System.out.println("Enter your marks::");
      int marks = input.nextInt();
      if (marks>80){
         System.out.println("A");
      }
      else if(marks >70){
         System.out.println("B");

      }else if(marks>60){
         System.out.println("C");
      }else{
         System.out.println("Fail");
      }

      //NESTED IF- ELSE
      System.out.println("Enter any number::");
      int n = input.nextInt();
      if(n<10){
         if(n==5){
            System.out.println("Its okey");
         }else{
            System.out.println("Its nott okey");
         }
      }else{
         if(n==15){
            System.out.println("Its 15,Okkkkkkk but");
         }else{
            System.out.println("its not 15,not okkkkkkkkk17");
         }
      }


      input.close();
   }
}

