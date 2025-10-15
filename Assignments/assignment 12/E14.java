/*4. E-commerce Discount Calculation
Suppose you are dividing total amount by quantity to get per item price. If quantity = 0, what happens?
Which exception will occur?  Ans- Arithmetic Exception
How will you ensure the program continues and doesn’t stop execution? Ans- yes, i will handle it by using try/catch/finally*/  

import java.util.Scanner;
import java.util.InputMismatchException;

class Test{
        public void calculatePrice(){

        Scanner sc = new Scanner(System.in);

        try{
            int amount = sc.nextInt();
            int quantity= sc.nextInt();
            int price = amount/quantity;
            
            System.out.println("Price = "+price);
        }
        catch(ArithmeticException  | InputMismatchException e){
            System.out.println("OOPs! something went wrong try again...");
        }
	finally{
System.out.println(" execution succesfull...);}
    }
}
class TestMain{
    public static void main(String[]args){

        Test t = new Test();
        t.calculatePrice();

        System.out.println("Execution success...");
    }
}
