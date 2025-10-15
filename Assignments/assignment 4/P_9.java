//9) WAP to print N even numbers.
import java.util.Scanner;
class P_9{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
            System.out.println("Enter any number");
            int n=sc.nextInt();
            int i=0;
            while(i<=n){
                System.out.println(i);
                i=i+2;
            }
        }
    }
