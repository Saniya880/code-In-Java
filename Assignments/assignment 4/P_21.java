//21) 1,	4,	9,	16,	25	...
import java.util.Scanner;
class P_21{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter any number- ");
        int n=sc.nextInt();

        int i=1, b=3;
        while(i<=n){
            System.out.println(i);
            i+=b;
            b+=2;
        }
    }
}