/*Problem 4: Banking System 🏦


Abstract class BankAccount:

accountNumber, balance fields

abstract methods: deposit(), withdraw()

concrete method showBalance()

Subclasses:

SavingsAccount (cannot withdraw below ₹1000)

CurrentAccount (no min balance required)

Interface LoanEligible with method checkLoanEligibility().

Only SavingsAccount is loan eligible.*/
interface LoanEligible{
    public void checkLoanEligibility();
}
abstract class BankAccount{
    private String account;
    private float balance;

    public BankAccount(String account, float balance){
        this.account = account;
        this.balance = balance;
    }
    public String getAccount(){
        return account;
    }
    public float getBalance(){
        return balance;
    }
    public void setBalance(){
        this.balance = balance;
    }

    abstract public void deposit();
    abstract public void withdraw();

    public String showBalance(){
        return "Account type- "+this.getClass().getName()+"  \n Account Number: "+this.getAccount()+" Balance- "+this.getBalance();

    }
}
class SavingAccount extends BankAccount implements LoanEligible{
    public BankAccount(String a,float b){
        super(a,b);
    }
    public void withdraw(){
        if(this.getBalance() < 1000 ){
            System.out.println("Can't Withdraw...amount should be (1000 + )"); }
        else{
           System.out.println("Withdraw succesfull...");
           }
    }
    public void deposit(){
        System.out.println("Deposit succesfull...");
    }
    public void checkLoanEligibility(){
        System.out.println(this.getClass().getName()+ " are eligible for Loan.");
    }
}
class CurrentAccount extends BankAccount{
    public void CurrentAccount(String a,float b ){
        super(a,b);
    }
    class SavingAccount extends BankAccount implements LoanEligible{
    public BankAccount(String a,float b){
        super(a,b);
    }
    public void withdraw(){
        if(this.getBalance() < 1000 ){
            System.out.println("Can't Withdraw...amount should be (1000 + )"); }
        else{
           System.out.println("Withdraw succesfull...");
           }
    }
    public void deposit(){
        System.out.println("Deposit succesfull...");
    }
}}
class Main{
    public static void main
}
