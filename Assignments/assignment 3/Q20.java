// WAP to exchange value of two variable without using third variable and arithmetic operator
// WAP to exchange value to two variable with third variable and without third variable
import java.util.Scanner;
class Q20{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a, b;
        System.out.println("Enter value of a ");
        a=sc.nextInt();
        System.out.println("Enter value of b ");
        b=sc.nextInt();
        System.out.println("Before swapping values of a = "+a+ "and b =  "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swapping Values of a = "+a + "and b=  "+b);

    }
}