//36)WAP to reverse a number
import java.util.Scanner;
class Series{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter any number - ");
        int n=sc.nextInt();

        int reverse=0;
        while(n!=0){
            reverse = reverse*10 + n%10;
            n=n/10;
        }
        System.out.println(reverse);
    }
}