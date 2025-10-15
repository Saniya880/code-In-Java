import java.util.Scanner;
class Pattern{
    public static void main(String[]args){
    Scanner sc = new Scanner (System.in);

    System.out.println("Enter any character");
    char n = sc.next().charAt(0);

    System.out.println(n);

    for(char i=n; i>='A'; i--){
         
    for(char j='A'; j<=i; j++){
    System.out.print(i);
    }
    System.out.println();
    }



    }
}