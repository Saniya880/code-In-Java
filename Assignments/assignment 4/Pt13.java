/*1
  01
  101
  0101
  10101*/
  import java.util.Scanner;
  class Pattern{
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter any number-");
    int n=sc.nextInt();
    
    for(int i=1; i<=n; i++){
        for(int j=1; j<=i; j++){
            if(i==j)
            System.out.print("1");
            else
            System.out.print("0");
        }
        System.out.println();
    }
    }
  }

