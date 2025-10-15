import java.util.Scanner;
 class Pattern {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter number of rows ");
        int n = sc.nextInt();
        for (int i = 1 ; i <= n ; i++){
            for(int j = 1 ; j <=  i ; j++){
                if(i==j || j==1 || i == n ){
                    if(j%2 != 0)
                    System.out.print("1");
                    else
                    System.out.print("0");
                }
                else 
                System.out.print(" ");
            }
            System.out.println();
        }
        sc.close();
    }
 }