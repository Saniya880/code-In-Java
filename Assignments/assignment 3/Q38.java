//Write a Java program to input day number and print week day. 
import java.util.Scanner;
class Q38{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number (0-6)");
        int num= sc.nextInt();
        switch(num){
            case 0:
                System.out.println("Sunday");
            break;
            case 1:
                System.out.println("Monday");
            break;
            case 2 :
                System.out.println("Tuesday");
            break;
            case 3 :
                System.out.println("Wednesday");
            break;
            case  4:
                System.out.println("Thursday");
            break;
            case 5 :
                System.out.println("Friday");
            break;
            case 6 :
                System.out.println("Saturday");
            break;
            default:
                System.out.println("Enter valid number.");

        }
    }
}