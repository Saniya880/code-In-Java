//34) WAP to check whether entered number is perfect or not
import java.util.Scanner;
class Series{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter number to check wheather it is perfect or not -");
        int n=sc.nextInt();

        int i=1, sum=0;;
        while(i<=n/2){
            if(n%i==0){
            sum=sum+i;}
            i++;
        }
    
        if(sum==n){
            System.out.println("The given number is perfect- ");
        }else
        System.out.println("The given number is not perfect.");
    }
}