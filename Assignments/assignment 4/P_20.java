//20) 0	7	14	21	28	35	…..
import java.util.Scanner;
class P_20{
    public static void main(String[]args){
        Scanner sc= new Scanner (System.in);

        System.out.println("ENter number-");
        int n=sc.nextInt();

        int i=1,a=0;
        while(i<=n){
            System.out.println(a);
            a+=7;
            i++;
        }
    }
}