/*Product Inventory
Create a class Product with fields: productId, name, quantity, price.
Use setters to assign values. Add a method to calculate total value (quantity * price).*/
class Product{

    private String productId;
    private String name;
    private int quantity;
    private int price;
    private int total;

    public void setPI(String p){
        productId = p;
    }
    public void setN(String n){
        name = n;
    }
    public void setQ(int q){
        quantity = q;
    }
    public void setP(int price){
        this.price=price;
    }
    public void calculate(){

        total= quantity*price;

        System.out.println("Product id- "+productId);
        System.out.println(" Name- "+name);
        System.out.println("Quantity- "+quantity);
        System.out.println("Price- "+price);
        System.out.println("total-  "+total);
    }
}
class Main{
    public static void main(String[]args){

        Product obj= new Product();

        obj.setPI("PI101");
        obj.setN("SANIYA KHAN ");
        obj.setQ(4);
        obj.setP(300);
        obj.calculate();
    }
}