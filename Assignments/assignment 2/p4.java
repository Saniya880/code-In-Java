import java.util.Scanner;
 class P4{
    public static void main(String[]args){
Scanner sc= new Scanner(System.in);
double l,b,area;
int cost =6;
System.out.println("Enter the length = ");
l= sc.nextDouble();
System.out.println("Enter the breadth = ");
b= sc.nextDouble();
area= l*b;
System.out.println("Area of plot = "+ area);
System.out.println("Cost of plot =  " + (area*cost));

    }
}