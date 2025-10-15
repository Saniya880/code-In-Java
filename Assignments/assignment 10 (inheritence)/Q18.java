/*Create class Product (pid, price, quantity) with parameterized constructor.Create a main function in different class (say XYZ) and perform following task:
Accept five product information from user and store in an array
Find Pid of product with highest price.
Create method (with array of product’s object as argument) in XYZ class to calculate and return total amount spent on all products. (amount spent on single product=price of product * quantity of product).*/
import java.util.Scanner;
import java.util.ArrayList;
class Function{

    public  float calculate(Product p[]){
         float total=0.0f;
        for(Product products : p){
        //total_price += products.getQuantity() * products.getPrice();
        total +=products.gettotal();
        }
        return total;}
        }
    
class Product{

    private int pid;
    private float price;
    private float quantity;
    private float total_price;
    
    public Product(int pid, float price, float quantity){
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
    }
    public float getPrice(){
        return price;
    }
    public float getQuantity(){
        return quantity;
    }
    public int getId(){
        return pid;
    }
    public float gettotal(){
     total_price = price*quantity;
     return total_price;
    }
    
}
class Main{
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);

    Product obj[] = new Product[3];

    for(int i=0; i<obj.length; i++){
    
    System.out.println("Enter product id- ");
    int pid = sc.nextInt();
    System.out.println("Enter price of product -");
    float price = sc.nextFloat();
    System.out.println("Enter quantity of product- ");
    float quantity = sc.nextFloat();
    obj[i] = new Product(pid,price,quantity);
    }

    Function f = new Function();
   float amount =  f.calculate(obj);
   System.out.println("Total Amount = "+amount);

    int highestPriceId =0;
    float max = obj[0].getPrice();
    for(int i=0; i<obj.length; i++){
        if(obj[i].getPrice()> max){
             highestPriceId = obj[i].getId();
             max = obj[i].getPrice();
        }
    }
    System.out.println(" Hightest price product id- "+highestPriceId);


    }  
    }  

    

