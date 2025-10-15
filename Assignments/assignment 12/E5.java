/*5. Multiple Catch Blocks

👉 Take two integers and perform division. Handle both ArithmeticException and InputMismatchException separately.*/
import java.util.Scanner;
import java.util.InputMismatchException;
class TestMain{
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    try{
        
        System.out.println("Enter number 1 ");
        int num1 = sc.nextInt();
        System.out.println("Enter number 2 ");
        int num2 = sc.nextInt();

        int result = num1 / num2;
        System.out.println(result);
    }
    catch(ArithmeticException e){
        System.out.println("Error: divisible by zero ...");
    }
    catch (InputMismatchException e){
        System.out.println("Error: number must be integer...");
    }
    }
}

