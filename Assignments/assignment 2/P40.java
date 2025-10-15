import java.util.Scanner;
class P40{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        double height,radius;
        System.out.println("Enter the height");
        height = sc.nextDouble();
        System.out.println("Enter the radius");
        radius= sc.nextDouble();
        double volume=3.14*radius*radius*height;
        System.out.println("Volume of Cylinder   "+volume);
    }
}