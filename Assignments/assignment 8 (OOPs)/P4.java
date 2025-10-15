//Write a Java program to create a class called "Circle" with a radius attribute. You can access and modify this attribute. Calculate the area and circumference of the circle.
import java.util.Scanner;
class Circle{
    private float radius;

    public Circle(float radius){
        this.radius = radius;
    }
    public void setData(float radius){
        this.radius = radius;
    }
    public float getdata(){
        return radius;
    }
    public float area(){
        return 3.14f*radius*radius;
    }
    public float circumference(){
        return 2*3.14f*radius;
    }
    public void display(){
        System.out.println("Area of circle = "+this.area()+"\n Circumference of circle = "+this.circumference());
    }
}
class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of circel- ");
        float r = sc.nextFloat();
        Circle obj = new Circle(r);
         obj.display();
    }
}