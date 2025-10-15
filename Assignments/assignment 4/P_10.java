//WAP to print Even numbers upto N
import java.util.Scanner;
class P_10{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number upto which even number are be printed ");
        int n=sc.nextInt();
        int i=1, a=0 ;
        while (i<=n){
            System.out.println(a);
            a=a+2;
            i++;
        }
   
   

    }

}