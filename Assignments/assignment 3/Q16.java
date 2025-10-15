//Area of circle
import java.util.Scanner;
class Q16{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        float radius;
        System.out.println("Enter the radius");
        radius = sc.nextFloat();
        float area= 3.14f*radius*radius;
        System.out.println("Area of circle is  "+ area);
    }
}