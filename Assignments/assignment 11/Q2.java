/*  Payment Gateway System 💳

Create an abstract class Payment with:

amount field

abstract method pay()

concrete method paymentDetails()

Subclasses:

CreditCardPayment

DebitCardPayment

UPIPayment

Create an interface Refundable with processRefund() method.

Only CreditCardPayment and UPIPayment should implement Refundable.

In main class, create different payments and process refund where applicable.  */
abstract class Payment{
    private double amount;

    public Payment(double amount){
    this.amount= amount;
    }
    public double getAmount(){
        return amount;
    }
    abstract public void pay();
    public String paymentDetails(){
    return this.getClass().getName()+" : "+this.getAmount();
    }
}
interface Refundable {
    public void processRefund();
}
class CreditCardPayment extends Payment implements Refundable{

    public CreditCardPayment(double amount){
        super(amount);
    }
    public void pay(){
        System.out.println(this.paymentDetails()+"    \n pay amount succesfull...");
    }
    public void processRefund(){
        System.out.println("payment by "+this.paymentDetails()+"  refund succesfull...");
    }
}
class DebitCardPayment extends Payment {

    public DebitCardPayment(double amount){
        super(amount);
    }
    public void pay(){
        System.out.println(this.paymentDetails()+"    \n pay amount succesfull...");
    }
}
class UPIPayment extends Payment implements Refundable{

    public UPIPayment(double amount){
        super(amount);
    }
    public void pay(){
        System.out.println(this.paymentDetails()+"    \n pay amount succesfull...");
    }
    public void processRefund(){
        System.out.println("payment by "+this.paymentDetails()+"  refund succesfull...");
    }
}
class Main{
    public static void main(String[]args){
        Payment obj = new CreditCardPayment(20000);
        obj.pay();
        new CreditCardPayment(20000).processRefund();

        DebitCardPayment debit = new DebitCardPayment(25000);
        debit.pay();

        UPIPayment upi = new UPIPayment(30000);
        upi.pay();
        upi.processRefund();
    }

}

