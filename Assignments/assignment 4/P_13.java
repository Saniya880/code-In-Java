// WAP to print N natural number in reverse order.
import java.util.Scanner;
class P_13{
    public static void main(String[]args){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter any number");
        int n=sc.nextInt();
        int i=n;
        while(i>0){
            System.out.println(i);
            i--;
        }
    }
}