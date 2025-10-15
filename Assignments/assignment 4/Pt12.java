import java.util.Scanner;
class Pattern{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
    
        for(int i=97; i<=105; i++){
            for(int j=97; j<=i; j++){
                System.out.print(" "+(char)j);
                
            }System.out.println();
        }
  
    }
}