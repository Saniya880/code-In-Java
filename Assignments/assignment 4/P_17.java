//1 2 4 7 11 16 .... n terms
import java.util.Scanner;
class P_17{
    public static void main(String[]args){
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter number of terms- ");
        int n=sc.nextInt();
        int a=1, b=0;
        while(a<=n){
             a=a+b;
            System.out.println(a);
            b++;

                }
        }
    }
