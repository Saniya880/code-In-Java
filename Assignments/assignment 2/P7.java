import java.util.Scanner;
 class P7{
    public static void main(String[]args){         
Scanner sc= new Scanner(System.in);
double area,breadth, height;
System.out.println("Enter the breadth of triangle- ");
breadth = sc.nextDouble();
System.out.println("Enter the Area of triangle- ");
area = sc.nextDouble();
height=(2*area)/breadth;
System.out.println("Height of triangle - " +height);
    }
 }
