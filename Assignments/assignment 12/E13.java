/*Online Exam System
A student enters their roll number (integer), but by mistake they enter "abc".
Which exception will occur?
How can you catch it and ask them to re-enter?
Can you use a loop to keep asking until they enter valid input?*/
import java.util.Scanner;
import java.util.InputMismatchException;
class TestMain{

    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
    
      boolean valid = false;
      while(!valid){
        try{
            System.out.println("Enter roll number-");
            int roll = sc.nextInt();
            System.out.println("Roll number = "+roll);
            valid = true;
        }
        catch (InputMismatchException e){
            System.out.println("Error- Enter correct roll number ");
            sc.next();
            valid = false;
        }
      }
      System.out.println("execution succesfull...");

      }}
     /*class Test{
      
      public int  input(){

        Scanner sc = new Scanner(System.in);

        try{
          
          int roll = sc.nextInt();
          return roll;

        }
        catch(InputMismatchException e){
          System.out.println("Enter correct number.");
          return input();
        }
      }
      public static void main(String[]args){
        Test obj = new Test();
        System.out.println(obj.input());
      }
     }*/
