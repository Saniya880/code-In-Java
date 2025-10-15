//3) WAP to find out the sum of N natural number.
import java.util.Scanner;
class P_3{
    public static void main(String[]args){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter number ");
        int n=sc.nextInt();
        int i=1, sum=0;
        while(i<=n){
            System.out.println(i);
            sum= sum+i;
            i++;
        }System.out.println("Sum of  "+n+ " natural number is-  "+sum);
    }
}