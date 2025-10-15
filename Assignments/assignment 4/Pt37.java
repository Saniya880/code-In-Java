import java.util.Scanner;
class Pattern{
    public static void main(String[]args){
    Scanner sc = new Scanner (System.in);

    System.out.println("Enter any number-");
    int n = sc.nextInt();

    for(int i=n; i>0; i--){
    for(int j=1; j<=i; j++){
        if(i%2!=0){
            System.out.print("*");
        }
        else{
            System.out.print("#");
        }
    }System.out.println();
    }
    }
}