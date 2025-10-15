/*Car Info Manager
Create a class Car with fields: brand, model, and year.
Use setters to assign values. Create a method to print full car info.*/
class Car{
    
    private String brand;
    private String model;
    private int year;

    public void setB(String b){
        brand = b;
    }
    public void setM(String m){
        model= m;
    }
    public void setY(int y){
        year=y;
    }
    public void display(){
        System.out.println("Brand Name - "+brand);
        System.out.println("Model Name- "+model);
        System.out.println("year - "+year);
    }
}
class Main{
    public static void main(String[]args){
        Car obj= new Car();
        obj.setB("BMW");
        obj.setM("M5");
        obj.setY(2024);
        obj.display();
    }
}
