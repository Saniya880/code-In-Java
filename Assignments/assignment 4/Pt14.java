import java.util.Scanner;
class Pattern{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
     
        System.out.println("Enter the numbers you want to print- ");
        int n= sc.nextInt();
        int num=1;

        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(num);
                num++;
            }System.out.println();
        }
    }
}