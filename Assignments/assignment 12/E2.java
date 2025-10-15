/*2. InputMismatchException

👉 Ask the user to enter an integer. If the user enters text instead, catch the exception.

// Expected
Enter an integer: abc
java.util.InputMismatchException caught*/
import java.util.Scanner;
import java.util.InputMismatchException;
class TestMain{
    public static void main(String[]args){

    Scanner sc = new Scanner(System.in);

    try{
    System.out.println("Enter 1st number- ");
    int num1 = sc.nextInt();
    System.out.println("Enter 2nd number- ");
    int num2 = sc.nextInt();
    }
    catch(InputMismatchException e){
        e.printStackTrace();
    }
    finally{
        System.out.println("Finally block executed ");
    }
}}
