/*Smart Home System 🏠💡

Abstract class Appliance:

name, power

abstract methods turnOn(), turnOff()

concrete method showStatus()

Subclasses:

Fan

Light

WashingMachine

Interface SmartDevice with method connectWifi().

Only Light and WashingMachine are smart devices.

In main method, turn on/off appliances and connect smart ones to WiFi.*/
interface SmartDevice{
    public void connectWifi();
 }
abstract class Appliance{
    private String name;
    private boolean  power;
                    

    public Appliance(String name, boolean power){
        this.name = name;
        this.power= power;
    }
    public String getName(){
        return name;
    }
    public boolean getPower(){
        return power;
    }
    abstract public void turnOn();
    abstract public void turnOff();
    public String showStatus(){
        if(this.getPower()==true)
        return this.getClass().getName()+" : "+this.getName()+"  is ON. ";
        else
        return this.getClass().getName()+" : "+this.getName()+"  is OFF. ";
    }
}
class Fan extends Appliance{

        public Fan(String n, boolean p){
        super(n,p);
    }
    public void turnOn(){
        
        if(getPower()==true)
        System.out.println(showStatus());
    }
    public void turnOff(){
         if(getPower()==false)
           System.out.println(showStatus());   
    }
}
class Light extends Appliance implements SmartDevice{

        public Light(String n, boolean p){
        super(n,p);
    }
    public void turnOn(){
        if (getPower()==true)
        System.out.println(showStatus());
    }
    public void turnOff(){
        if(getPower()==false)
           System.out.println(showStatus());   
    }
    public void connectWifi(){
        System.out.println(showStatus()+ "Can connect this with wifi...");
    }
}
class WashingMachine extends Appliance implements SmartDevice{

        public WashingMachine(String n, boolean p){
        super(n,p);
    }
    public void turnOn(){
        if (getPower()==true)
        System.out.println(showStatus());
    }
    public void turnOff(){
        if(getPower()==false)
           System.out.println(showStatus());   
    }
     public void connectWifi(){
        System.out.println(showStatus()+"Can connect this with wifi...");
    }
}


class Main{
    public static void main(String[]args){
        Appliance obj =  new Fan("bajaj",true);
        obj.turnOn();
        obj.turnOff();
        //System.out.println(obj.showStatus());
    

    Light l = new Light("CFL" ,true);
    l.turnOn();
    l.turnOff();
    l.connectWifi();
   // System.out.println(l.showStatus());

    WashingMachine w = new WashingMachine("Goodrej",false);
    w.turnOn();
    w.turnOff();
    w.connectWifi();
   // System.out.println(w.showStatus());
    
}}