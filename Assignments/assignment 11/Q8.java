/* E-commerce Order System 🛒

Abstract class Order:

orderId, amount

abstract methods processOrder(), cancelOrder()

concrete method orderSummary()

Subclasses:

OnlineOrder

StorePickupOrder

Interface DiscountApplicable with applyDiscount() method.

Only OnlineOrder gets discount.*/


interface DiscountApplicable{
   public void  applyDiscount();
}
abstract class Order{
    private String orderId;
    private float amount;

    public Order(String orderId, float amount){
        this.orderId = orderId;
        this.amount = amount;
    }
    public String getId(){
        return orderId;
    }
    public float getAmount(){
        return amount;
    }

    abstract public void processOrder();
    abstract public void cancelOrder();

    public String orderSummary(){
        return this.getClass().getName()+" : "+this.getId()+" - "+this.getAmount();
    }
}
class OnlineOrder extends Order implements DiscountApplicable{
    public OnlineOrder(String orderId, float amount){
        super(orderId,amount);
    }
    public void processOrder(){
        System.out.println("Order by "+orderSummary()+" is confirmed.");
    }
    public void cancelOrder(){
        System.out.println("Order is cancel");
    }
    public void applyDiscount(){
        System.out.println("Got discount 4% at given order.");
    }

}
class StorePickUp extends Order{
    public StorePickUp(String orderId, float amount){
        super(orderId,amount);
    }
    public void processOrder(){
        System.out.println("Order by "+orderSummary()+" is confirmed.");
    }
    public void cancelOrder(){
        System.out.println("Order is cancel");
    }
}
class Main{
    public static void main(String[]args){
        OnlineOrder od = new OnlineOrder("45690rk",45.0f);
        od.processOrder();
        od.applyDiscount();
         //od.cancelOrder();

        StorePickUp sd = new StorePickUp("88568pq", 90.0f);
                sd.processOrder();
               // sd.cancelOrder();

    }
}