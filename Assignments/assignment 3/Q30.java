//WAP to check given year is a leap year or not
import java.util.Scanner;
class Q30{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter any year");
        int year= sc.nextInt();
        if ((year%4==0) && (year%100!=0) || (year%400==0))
        System.out.println("this is a leap year");
        else
        System.out.println("this is not a leap year");
    }
}