import java.util.Scanner;
class Pattern{
    public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    
    System.out.println("Enter number");
    int n= sc.nextInt();

        int num=1;
    for(int i=1; i<=n; i++){
    for(int j=1; j<=n; j++){
        if( j==5 || i==5)
        System.out.print(num);
        else
        System.out.print(" ");
        }
        System.out.println();
        num++;
    }
    }
}