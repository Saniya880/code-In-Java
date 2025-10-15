import java.util.Scanner;
class Pattern{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any number-");
         int n = sc.nextInt();
         
        for(int i=1; i<=n ; i++){
            for(int j=1 ; j<=2*i-1; j++){
        
                System.out.print(j);
                
            }
            System.out.println();
        }
    }
}