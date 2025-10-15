//building a transportation system for a logistics company.
abstract class Vehicle{
    private String ragister_no;

    Vehicle(String rNumber){
        ragister_no = rNumber;
    }
    public String getNumber(){
        return ragister_no;
    }
     public String display(){
        return this.getClass().getName()+" Register number - "+this.getNumber();
    }
    
   abstract  public void start();
   abstract  public void stop();
}interface Chargeble{
    public void chargeBattery();
}
class Car extends Vehicle{
    public Car(String s){
        super(s);
    }
    public void start(){  
    System.out.println(this.display()+"  starting with petrol engine...");
    }
    public void stop(){
    System.out.println(this.display()+" stoped...");
    }
}
class Truck extends Vehicle{
    public Truck(String n){
        super(n);
    }
    public void start(){  
    System.out.println(this.display()+" starting with diesel engine...");
    }
    public void stop(){
    System.out.println(this.display()+"  stoped...");
    }
}
class ElectricBike extends Vehicle implements Chargeble{
    public ElectricBike(String s){
        super(s);
    }
    public void chargeBattery(){
        System.out.println(this.getNumber()+" battery  charging....");
    }
    public void start(){  
    System.out.println(this.display()+" starting silently...");
    }
    public void stop(){
    System.out.println(this.display()+" stopped...");
    }
}
class ElectricCar extends Vehicle implements Chargeble{
    public ElectricCar(String s){
        super(s);
    }
     public void chargeBattery(){
        System.out.println("Electric Car "+this.getNumber()+"  battery  charging....");
    }
       public void start(){  
    System.out.println(this.display()+" starting silently...");
    }
    public void stop(){
    System.out.println(this.display()+" stopped...");
    }
}
class TransportSystem{
    
    public static void main(String[]args){
    Car obj = new Car("RV456N2");
    obj.start();
    obj.stop();
    Truck t = new Truck("PV456N3");
    t.start();
    t.start();
    ElectricBike ebike = new ElectricBike("SW3456N8");
    ebike.start();
    ebike.stop();
    ebike.chargeBattery();
    ElectricCar ecar = new ElectricCar("PM3428M6");
    ecar.start();
    ecar.stop();
    ecar.chargeBattery();
    
    }
}

