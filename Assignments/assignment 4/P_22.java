//22) 1	8	27	64	125	…..
import java.util.Scanner;
class P_22{
    public static void main(String[]args){
        Scanner sc= new Scanner (System.in);

        System.out.println("Enter any number-");
        int n= sc.nextInt();

        int a=1, b=1, i=1;
        while(i<=n){
            System.out.print(a+" ");
            b++;
            a=b*b*b;
            i++;
        }
    }
}