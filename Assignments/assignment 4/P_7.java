//7) WAP to check whether entered number is prime or not.
import java.util.Scanner;
class P_7{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n, i=2;
        boolean condition=false;
        System.out.println("Enter any number");
        n=sc.nextInt();
        while(i<=n/2){
            if(n%i==0){
                condition=true;
                break;
            }i++;
        }
        if(condition && n>1)
            System.out.println(n+" is a not a prime number,");
        else
        System.out.println(n+" is a prime number.");
    }
}