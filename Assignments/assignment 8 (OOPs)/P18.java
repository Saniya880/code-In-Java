//Write a Java program to create a class called "Restaurant" with attributes for menu items, prices, and ratings, and methods to add and remove items, and to calculate average rating.
import java.util.ArrayList;
class Restaurant{
    
    private int rating;
    public Restaurant(int rating ){
        this.rating=rating;
    }
    
}
class Menu{
   ArrayList<String>item;
   ArrayList<String>price;

   public Menu(int price){
    this.item=new ArrayList<String>();
    this.price=new ArrayList<String>();
    // this.rating=rating;
   }
   public Menu(){};
   public void additem(String item1){
    item.add(item1);
   }
   public void removeitem(String item1){
    item.remove(item1);
   }
   public void addprice(String price1){
    price.add(price1);

   }
   public void removeprice(String  price1){
    price.remove(price1);
   }
   public void display(){
    System.out.println("item="+item);
    // System.out.println("rating="+rating);
    System.out.println("price ="+price);
   }
}
class Test{
    public static void main(String args[]){
        Menu m=new Menu(5);
        Restaurant r=new Restaurant()
        m.additem("ice");
        m.addprice("400");
        m.additem("pizza");
        m.addprice("350");
        m.additem("burger");
        m.addprice("400");
        m.display();
        m.removeitem("pizza");
        m.removeprice("350");
        m.display();
    }

}

