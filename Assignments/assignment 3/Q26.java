//Find even odd using switch case 
import java.util.Scanner;
class Q26{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        int num ;
        System.out.println("Enter any number");
        num= sc.nextInt();
        switch(num % 2){
            case 0: 
            System.out.println("Given number is even");
             break;
            case 1:
            System.out.println("Given number is odd");
            break;
            default :
            System.out.println("Invalid Input-");
        }
    }
}