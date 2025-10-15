//Area of rectangle
import java.util.Scanner;
class Q17{
    public static void main(String[]args){
        Scanner sc= new Scanner (System.in);
        double length, breadth, area;
        System.out.println("Enter length : ");
        length= sc.nextDouble();
        System.out.println("Enter breadth : ");
        breadth=sc.nextDouble();
        area= length*breadth;
        System.out.println("Area of rectangle is - "+area);

    }
}