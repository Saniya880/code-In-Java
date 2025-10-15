//19) 1	+	1/2	+	1/3	+	1/4	+	1/5	….. n terms(find out sum)
import java.util.Scanner;
class P_19{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        float  a,sum=0;
        System.out.println("Enter number of terms - ");
        int n=sc.nextInt();
        int i=1;
        while(i<=n){
             a=1/i;
            System.out.print("1/"+i + " + ");
            sum=sum+a;
            i++;
        }System.out.println("\n Sum= "+sum);
    }
}