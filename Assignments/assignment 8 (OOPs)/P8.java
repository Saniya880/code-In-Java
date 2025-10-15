//Write a Java program to create class called "TrafficLight" with attributes for color and duration, and methods to change the color and check for red or green.
class TrafficLight{

    private int duration;
    private String colour;

    public TrafficLight(){
        this.duration = 00;
        this.colour = red;
    }
    public void setColour(String colour){
        this.colour = colour;
    }
    public void setDuration(int duration){
        this.duration = duration;
    }
    public String getColour(){
        return colour;
    }
    public int getDuration(){
        return duration;
    }
    public TrafficLight(){}
    public void changeColour(int duration, String colour){

        if(colour.equalsIgnoreCase("red") && duration <= 120)
        System.out.println("the signal is - "+colour+" STOP for  "+duration+" seconds."); 

        if(colour.equalsIgnoreCase("green") && duration <= 120)
        System.out.println("The signal is - "+colour+" you can go within  "+duration+" seconds."); 

         if(colour.equalsIgnoreCase("yellow") && duration <= 120)
        System.out.println("The signal is - "+colour+" you need to wait for it to change in  "+duration+" seconds."); 
}}
class Main{
    public static void main(String[]args){

        TrafficLight tlight = new TrafficLight();
        tlight.changeColour(120,"green");
        
    }
}
