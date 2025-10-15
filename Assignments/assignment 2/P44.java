import java.util.Scanner;
class P44{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        // Find the sum of n terms of an ArithmeticProgression
        int n ,a1,a2, an, sum;
        System.out.println("Enter number of terms in AP- ");
        n= sc.nextInt();
        System.out.println("Enter first term of AP- ");
        a1= sc.nextInt();
        System.out.println("Enter second term of AP-");
        a2= sc.nextInt();
        int d=a2-a1;
        an= a1+ (n-1)*d;
        System.out.println(+n +"  th  term of AP is " +an);

    }}