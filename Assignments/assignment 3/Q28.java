//Program to perform arithmetic operation using switch case
import java.util.Scanner;
class Q28{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your choice-  ");
        System.out.println("Enter 1 for Addition");
        System.out.println("Enter 2 for Subtraction ");
        System.out.println("Enter 3 for  Multiplication");
        System.out.println("Enter 4 for Division ");
        System.out.println("Enter 5 for  Modulus(reminder) ");
        int choice = sc.nextInt();
        switch(choice){
        case 1:
            System.out.println("Enter two numbers");
           double a=sc.nextDouble();
           double b= sc.nextDouble();
           System.out.println("Addition of two number is -  "+(a+b));
           break;
           case 2:
            System.out.println("Enter two numbers");
            a=sc.nextDouble();
            b= sc.nextDouble();
           if(a>b)
           System.out.println("Subtraction of two number is -  "+(a-b));
           else 
           System.out.println("Subtraction of two number is -  "+(b-a));
           break;
           case 3:
            System.out.println("Enter two numbers");
            a=sc.nextDouble();
            b= sc.nextDouble();
           System.out.println("Multiplication of two number is -  "+(a*b));
           break;
           case 4:
            System.out.println("Enter two numbers");
            a=sc.nextDouble();
            b= sc.nextDouble();
           if(a>b)
           System.out.println("Division of two number is -  "+(a/b));
           else
            System.out.println("Division of two number is -  "+(b/a));
           break;
           case 5:
            System.out.println("Enter two numbers");
            a=sc.nextDouble();
            b= sc.nextDouble();
           if(a>b)
           System.out.println("Modulus of two number is -  "+(a%b));
           else
            System.out.println("Modulus of two number is -  "+(b%a));
           break;
            default :
            System.out.println("Enter correct choice");
        }
    }
}