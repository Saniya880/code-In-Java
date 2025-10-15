//WAP to check wheather number is even or odd
import java.util.Scanner;
class Q23{
    public static void main(String[]args){
        Scanner sc= new Scanner (System.in);
        int num;
        System.out.println("Enter the number 1 : ");
        num = sc.nextInt();
        if (num%2==0)
        System.out.println(" Given Number is even");
        else
        System.out.println("Given Number is odd");
    }
}