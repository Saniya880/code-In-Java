// WAP to print N odd numbers
import java.util.Scanner;
class P_11{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("How many odd numbers you want ?");
        int n= sc.nextInt();
        int i=1;
        while(i<=n){
            System.out.println(i);
            i=i+2;
        }
    }
}