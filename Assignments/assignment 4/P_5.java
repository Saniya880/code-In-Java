// WAP to find out the factorial of a number.
import java.util.Scanner;
class P_5{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number to find out factorial-");
        int n=sc.nextInt();
        int f=1;
        while(n>0){
            f=f*n;
            n--;
        }System.out.println("factorial of number is - "+f);
    }
}