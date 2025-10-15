//WAP to check wheater number is positive or negative
import java.util.Scanner;
class Q24{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        double number;
        System.out.println("Enter the number");
        number = sc.nextDouble();
        if (number>0)
            System.out.println("Given number is positive");
        if(number<0)
        System.out.println("Given number is negative");
        if(number==0)
        System.out.println("Enter valid number");
    }
}