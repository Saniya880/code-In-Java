import java.util.Scanner;
class Pattern {
    public static void main(String[]args){
    Scanner sc= new Scanner (System.in);
    int n = sc.nextInt();

        for(int i=n; i>=1; i--){
            for(int space = 1; space<i; space++){
                
                for(int j=n; j>i; j--){
                    System.out.print(j);
                }
            }System.out.println();
        }
    
    }
}
