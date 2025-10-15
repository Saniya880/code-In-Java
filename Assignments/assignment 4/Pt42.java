
import java.util.Scanner;
class Pattern{
    public static void main (String[]args){
       

        Method obj = new Method ();
        int x = obj.input();
        System.out.println(x);

        for(int i=x; i>=1; i--){
        for(int j=x; j>=x-i+1; j--){
            System.out.print(j);
        }System.out.println();
    }

}}
class Method{

    public int input(){
         Scanner sc = new Scanner (System.in);
        System.out.println("ENter any number ");
        int n= sc.nextInt();
        return n;
    }
}
