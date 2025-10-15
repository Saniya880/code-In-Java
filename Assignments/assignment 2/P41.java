import java.util.Scanner;
class P41{
    public static void main(String[]args){
        Scanner sc= new Scanner (System.in);
        double height,radius,volume;
        System.out.println("Enter the height - ");
        height= sc.nextDouble();
        System.out.println("Enter the radius- ");
        radius = sc.nextDouble();
        volume= (3.14*radius*radius);
        System.out.println("Volume of Cylinder- "+volume + " centimeter cube");
    }
}