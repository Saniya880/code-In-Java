// WAP to find greater among two number 
import java.util.Scanner;
class Q21{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        int num1, num2;
        System.out.println("Enter the number 1 : ");
        num1 = sc.nextInt();
        System.out.println("Enter the number 2: ");
        num2 = sc.nextInt();
        if (num1>num2)
        System.out.println("Number 1:   "+num1 + "is greater.");
        else
        System.out.println("Number 2:  "+num2+ "is greater.");
    }}     