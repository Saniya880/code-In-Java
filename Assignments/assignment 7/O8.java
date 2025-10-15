/*Mobile Phone Store
Create a class Mobile with fields: brand, model, price.
Use setters to set values. Create a method to check if phone is affordable (price < 20000).*/
class Mobile{
    private String brand;
    private String model;
    private int price;

    public void setData(String brand, String model, int price){
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public void check(){
        if(price < 20000)
        System.out.println("Phone is affordable");
        else
        System.out.println("Phone is not affordable");
    }
}
class Main{
    public static void main(String[]args){
    Mobile obj= new Mobile ();

    obj.setData("Vivo", "Y75", 19000);
    obj.check();
    }
}
