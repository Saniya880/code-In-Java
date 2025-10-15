//7. Write a Java program to create a class called "Bank" with a collection of accounts and methods to add and remove accounts, and to deposit and withdraw money. Also define a class called "Account" to maintain account details of a particular customer.
import java.util.ArrayList;
class Bank{
    ArrayList <Account> al = new ArrayList <Account> ();
    public void addAccount(Account account){
        al.add(account);
    }
    public void removeAccount(Account account){
        al.remove(account);
    }
    public void deposit(String contact,float amount){
        for(Account account : al ){
        if(account.getcontact().equals(contact) && (amount >= 0) ){
        account.setBalance(account.getBalance() - amount);
        System.out.println("Success...\n balance- "+account.getBalance());
        }}
    }
    public void withdraw(String contact, float amount){
       for(Account account : al){ if ( account.getcontact().equals(contact)){
            if (account.getBalance() < amount){
        System.out.println("Insufficient balance- ");}
        else{
        account.setBalance(account.getBalance()+amount);
        System.out.println("Success...\nBalance "+account.getBalance());}}}
    }
    public void displayDetails( ){
        for(Account account : al){
        System.out.println(account.getDetails());}
    }
}
class Account{
    private String holderName;
    private String contact;
    private float balance;

    public Account(String holderName, String contact, float balance){
        this.holderName = holderName;
        this.contact = contact;
        this.balance = balance;
    }
    public String getcontact(){
        return contact;
    }
    
    public String getDetails(){
        return holderName+" : "+contact+" : "+balance;
    }
    public float getBalance(){
        return balance;
    }
    public void setHolderName(String holderName){
        this.holderName = holderName;
    }
    public void setContact(String contact){
        this.contact = contact;
    }
    public void setBalance(float balance){
        this.balance = balance;
    }
}
class Main{
    public static void main(String[]args){
    
    Account obj[] = new Account [4];
    obj [0] = new Account ("Saniya", "S1452", 500000f);
    obj [1] = new Account ("Arshin", "A2528", 520000f);
    obj [2] = new Account ("Sara", "S545", 550000f);
    obj [3] = new Account ("Mariyam", "M121", 540000f);

    Bank obj2 = new Bank();
    obj2.addAccount(obj[0]);
     obj2.addAccount(obj[1]);
      obj2.addAccount(obj[2]);
       obj2.addAccount(obj[3]);
       obj2.displayDetails();
     obj2.deposit("S545",10000);
     obj2.withdraw("S1452",100000);
   obj2.displayDetails();
    }
    }