//W.A.P to check whether given number is even or odd Without using % operator.
import java.util
.Scanner;
class Q33{
    public static void main(String[]args){
    Scanner sc = new Scanner (System.in);

    System.out.println("ENter any number- ");
    int num = sc.nextInt();
    int  k= num & 1;

    if(k == 0)
    System.out.println(num+ " is even.");
    else
    System.out.println(num+" is odd");
    }
}