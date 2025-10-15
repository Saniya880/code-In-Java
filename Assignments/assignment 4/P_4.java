//4) WAP to print table of a number.
import java.util.Scanner;
class P_4{
    public static void main(String[]args){
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter the number  you want to print table of- ");
        int n=sc.nextInt();
        int i=1;
        while(i<=10){
            System.out.println(n+  " * "+i+ " = " +n*i);
            i++;
        }
      /* int i=n;
       while(i<=n*10){
        System.out.println(i);
        i=i+n;
       }*/
    }
}