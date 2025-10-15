/*Bank Account
Create a class BankAccount with fields: accountNumber, holderName, balance.
Use setters to assign values. Add a method to display balance.*/
class BankAccount{
    private String accountNum;
    private String holderName;
    private int balance;

    public void setA(String a){
        accountNum = a;
    }
    public void setH(String n){
        holderName = n;
    }
    public void setB(int b){
        balance = b;
    }
    public void display(){
        System.out.println("Account Number- "+accountNum);
        System.out.println("Holder Name- "+holderName);
        System.out.println("Balance- "+balance);
    }
}
class Main{
    public static void main(String[]args){
        BankAccount obj= new BankAccount();
        obj.setA("A23R4560891");
        obj.setH("SANIYA KHAN ");
        obj.setB(10000);
        obj.display();
    }
}