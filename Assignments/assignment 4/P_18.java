//18) 1	2	2	4	8	32	…… n terms
import java.util.Scanner;
class P_18{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter number of term- ");
        int n=sc.nextInt();

        System.out.print("1");
        System.out.print(" 2");

        int a=2,b=4,f=1,i=1;
        while(i<=n){
        System.out.print(" "+a);
        a = b;
        f = a*b;
        b = f;
        i++;
    }
    }
}