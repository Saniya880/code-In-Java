//WAP to print odd numbers upto N
import java.util.Scanner;
class P_12{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number upto which odd numbers are be print- ");
        int n=sc.nextInt();
        int i=1, a=1;
        while(i<=n){
            System.out.println(a);
            a+=2;
            i++;
        }
    }

}
