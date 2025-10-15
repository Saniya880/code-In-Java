/*31. Banking System – Insufficient Balance

You are building a banking system. A user tries to withdraw more money than available in their account.

Which exception would you throw?

Will you use a checked or unchecked exception? Why?

Write a custom exception InsufficientBalanceException.*/
import java.util.Scanner;
class InsufficientBalanceException extends RuntimeException{
    public InsufficientBalanceException(){
        System.out.println("Insufficient amount...");
    }
}
class BankingSystem{

    private int balance;

        public BankingSystem(int balance){
            this.balance = balance;
        }
    public void deposit(int amount){
        balance = balance + amount;
        System.out.println("balance- "+balance);
    }
    public void withdraw(int amount){
        try{
        if(balance >= amount)
            balance = balance- amount ;
        else
        throw new InsufficientBalanceException();
        }
        catch (InsufficientBalanceException e){
            e.printStackTrace();
        }
         }  
}
class TestMain{
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);

    BankingSystem obj = new BankingSystem(20000);

    System.out.println("Enter amount ");
    int amount = sc.nextInt();
        //obj.deposit(amount);
     obj.withdraw(amount);
    System.out.println("End...");
    }
}
