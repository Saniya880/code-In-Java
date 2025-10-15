import java.util.Scanner;
class Pattern{
    public static void main(String[]args){
    Scanner sc= new Scanner(System.in);

    System.out.println("Enter number-");
    int n=sc.nextInt();

    for(int i=1; i<=n; i++){
        for(int j=1; j<=2*i-1; j++){
            System.out.print(i);
        }
        System.out.println();
    }
    }
}