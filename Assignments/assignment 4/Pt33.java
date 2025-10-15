import java.util.Scanner;
class Pattern{
    public static void main(String[]args){
    Scanner sc = new Scanner (System.in);

    System.out.println("Enter number- ");
    int n = sc.nextInt();

    
    for(int i=n; i>0; i--){
        char  ch='A';
    for(int j=1; j<=i; j++){
        
        System.out.print(ch);
        ch++;
    }System.out.println();
    }
    }
}