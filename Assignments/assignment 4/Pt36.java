import java.util.Scanner;
class Pattern{
    public static void main(String[]args){
    Scanner sc= new Scanner (System.in);

    System.out.println("Enter the number");
    int n= sc.nextInt();

    
    for(int i=1; i<=n; i++){
        char ch='A';
    for(int j=1; j<=n; j++){
        if((i==1|| j==1) || i+j==6){
        System.out.print(ch);}
        else{
        System.out.print(" ");}
        ch++;
    }   
    System.out.println();
    }

    }
}