//6) WAP to find out the factors of a number.
import java.util.Scanner;
class P_6{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n,i=1;
        System.out.println("Enter any nummber to find factors-  ");
        n=sc.nextInt();
        while(i<=n/2){    
            if (n%i==0)
            System.out.println(i);
            i++;
        }
        System.out.println(n);
    }
}