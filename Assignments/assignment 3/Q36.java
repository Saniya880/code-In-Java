//Java program to check whether the triangle is valid or not if angles are given
import java.util.Scanner;
class Q36{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
int a,b,c;
System.out.println("Enter angle of triangle");
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
if (a+b+c==180){
    System.out.println("This is a valid triangle");}
    else
    System.out.println("This triangle is not  valid ");
}
}