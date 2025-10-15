import java.util.Scanner;
class Pattern{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
    System.out.println("ENter any number- ");
    int n= sc.nextInt();
        int v=65;

        
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=i; j++)
                {
                System.out.print(" "+(char)v);
                }
                 v++;
            System.out.println();
        }
  
    }
}