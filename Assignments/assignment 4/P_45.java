//45) WAP to find out the sum of all the digits of a number
import java.util.Scanner;
class Series{
    public static void main(String[]args){
    Scanner sc= new Scanner(System.in);

    System.out.println("Enter any number- ");
    int n=sc.nextInt();

    int digit=0, sum=0;
    while(n!=0){
        digit= n%10;
        sum+=digit;
        n/=10;
    }
    System.out.println("Sum of digit of a number is "+sum);
    }
}