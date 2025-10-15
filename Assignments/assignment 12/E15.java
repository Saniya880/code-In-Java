/* ATM PIN Validation
If the user enters a wrong PIN 3 times, throw a custom exception AccountLockedException.
Which exception handling mechanism will you use?     Ans- we have 2 option either write try/catch or throws exception.
Should it be checked (force the programmer to handle) or unchecked? Ans- It should be unchecked */ 

import java.util.Scanner;
import java.util.InputMismatchException;
class AccountLockedException extends Exception{
   public  AccountLockedException(String msg){
            super(msg);
    }
}
    class Test{
    public void checkPin() throws AccountLockedException {

    boolean status = false;
    int count = 0;
    int pin = 0;
    Scanner sc = new Scanner(System.in);

    while(count<=3){
    try{
        System.out.println("Enter pin - ");
         pin = sc.nextInt();
        System.out.println(pin);
    }
    catch(InputMismatchException e){
        count++;
        if(count == 3 ) throw new AccountLockedException(" Invalid pin - Account locked");
    
        System.out.println("you entered wrong pin");
        sc.next();}
    }
    }
    }
class TestMain{
    public static void main(String[]args){

        Test obj = new Test();
        try{
            obj.checkPin();
        }
        catch(AccountLockedException e){
            System.out.println(e.getMessage());
        }
    }
}
