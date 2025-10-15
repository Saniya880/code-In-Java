/* Create a class to calculate Area of circle with one data member to store the radius and another to store area value. Create method members
init - to input radius from user
calc - to calculate area
display- to display area
*/
import java.util.Scanner;
class Calculate{
    private float radius;
    private float result;

    public Calculate(){}

    public void init(){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter radius of circle-");
    this.radius = sc.nextFloat();
    }

    public void  calc(){
     this.result = 3.14f*radius*radius;
    }
    public void display(){
    System.out.println("Area of circle = "+result);
    }
    }
class Main{
    public static void main(String[]args){
        Calculate c = new Calculate();
        c.init();
        c.calc();
        c.display();

    }
}