import java.util.Scanner;
class P42{
    public static void main(String[]args){
        Scanner sc= new Scanner (System.in);
        double height, radius, volume;
        System.out.println("Enter height - ");
        height = sc.nextDouble();
        System.out.println("Enter Radius -    ");
        radius= sc.nextDouble();
        volume= (3.14*radius*radius*height);
        System.out.println("Volume of Cylinder-  "+volume);
    }
}