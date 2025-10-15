//-6 -3 0 3 6 9 .......n terms
import java.util.Scanner;
class P_16{
    public static void main(String[]args){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter numbers of terms- ");
        int n= sc.nextInt();
        int term,i;
        term=n*3;
        i=term*-1;
        while(i<=term){
              System.out.println(i);
               i=i+3;
        }
    }
}