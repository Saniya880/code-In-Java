// 12. Write a Java program to create a class called "Airplane" with a flight number, destination, and departure time attributes, and methods to check flight status and delay.
import java.util.ArrayList;
import java.util.Scanner;
class Airplane{
    private String flightNumber;
    private Boolean status;
    private String destination;
    private String depaturetime;

    public Airplane(String flightNumber,String destination,String depaturetime){
        this.flightNumber=flightNumber;
        this.destination=destination;
        this.depaturetime=depaturetime;
        this.status=false;
    }
    public  void isDelay(){
        if(status){
            System.out.println("your flight is delay ....");

        }else{
            System.out.println("your flight is on time ....");
        }

    }
 
 public void Delay(){
this.status=true;
 }

public void display(){
 System.out.println("flight number  "+flightNumber+"  d
 estination:-"+destination+"   depature time of flight:-"+depaturetime);
}
}
class Test{
    public static void main(String args[]){
        Airplane a=new Airplane("1234","indore","10:30");
        a.isDelay();
        a.display();
        a.Delay();
         a.isDelay();
    }
}
