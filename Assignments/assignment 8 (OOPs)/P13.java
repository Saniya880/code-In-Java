import java.util.ArrayList;
// 13. Write a Java program to create a class called "Inventory" with a collection of products and methods to add and remove products, and to check for low inventory.
class Inventory{
    ArrayList<String>products=new ArrayList<String>();;

//  public Inventory(){}
//  public Inventory(String products){
    

//  }
 public void addProduct(String product1){
    products.add(product1);
 }
 public void removeProduct(String product1){
    products.remove(product1);
 }
 public void Display(){
    System.out.println(products);
    // for(String pr:products){
    //     System.out.println(products);
    // }
 }
 public void lowinventory(){
    if(products.size()<10){
        System.out.println(" low inventory...");

    }else{
        System.out.println("not in low inventory...");
    }
 }

}
class Test{
    public static void main(String args[]){
        Inventory inven=new Inventory();
        inven.addProduct("soap");
        inven.addProduct("oil");
        inven.addProduct("phone");
        inven.addProduct("book");
        inven.Display();
        inven.removeProduct("oil");
        inven.Display();
        inven.lowinventory();
    }
}
