import java.util.Scanner;
class P10{
    public static void main(String[]args){
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter side of triangle- ");
        double side= sc.nextDouble();
        double area = (0.5*side*side);
        System.out.println("Area of isosceles triangle is "+area+ " cm square.");
    }
}
    
