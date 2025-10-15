//8) WAP to print Fibonacci series.
import java.util.Scanner;
class P_8{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number");
        int num=sc.nextInt();
int f,a=0, b=1, i=0;
while(i<=num){
    System.out.println(a);
    f=a+b;
    a=b;
    b=f;
    i++;
}
    }
}