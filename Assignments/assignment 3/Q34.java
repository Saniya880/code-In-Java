//W.A.P to check whether the traingle is equilateral, scalene, or isosceles.
import java.util.Scanner;
class Q34{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter the 3 sides of triangle-  ");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        if ((a==b) && (a==c) || (b!=c)) {
        System.out.println("This is a IQsosceles triangle");}
        else if ((a!=b) && (b!=c) && (c!=a)){
        System.out.println("This is a Scalene triangle");}
        else if ((a==b) && (b==c)&& (c==a)){
        System.out.println("This is Equilateral triangle");}
    }
}