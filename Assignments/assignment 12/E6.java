/*6. Finally Block Practice

👉 Open a Scanner, read an input, and always close the scanner in finally (show that finally always executes).*/
import java.util.Scanner;
import java.util.InputMismatchException;
class TestMain{
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);

	System.out.println("Enter any number");
	int a= sc.nextInt(); 		//inputMismatchException can occur
   /* try{
        System.out.println("Enter number");
        int n = sc.nextInt();
    }
    catch (InputMismatchException e){
        System.out.println(e);
    }*/
    finally{
        System.out.println("Entered in finally block...");
        sc.close();
    }
 System.out.println("Enter your name");
  String name = sc.next();
    }
}
