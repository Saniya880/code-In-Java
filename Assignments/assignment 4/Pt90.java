import java.util.Scanner;
class Pattern{
    public static void main(String[]args){
     Scanner sc= new Scanner (System.in);

     System.out.println("Enter the number- ");
     int n= sc.nextInt();

     for(int i=1; i<=n; i++){
        for(int space=1; space<=n-i; space++){
            System.out.print(" ");
        }
        for(int j=1; j<=(2*i-1); j++){
            if( j%2==0)
            System.out.print("0");
            else
            System.out.print("1");
        }System.out.println();
     }
    
    }
}