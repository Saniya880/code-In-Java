import java.util.Scanner;
class P8{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        double area,h;
        System.out.println("Enter the height of triangle- ");
        h=sc.nextDouble();
        System.out.println("Enter the area of the triangle- ");
        area= sc.nextDouble();
        double base = (area*2)/h;
        System.out.println("Base of triangle- " +base);
    }
}

    
