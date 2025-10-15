import java.util.Scanner;
class Pattern{
    public static void main(String[]args){
    Scanner sc= new Scanner(System.in);

    System.out.println("Enter the number- ");
    int n = sc.nextInt();
    
    
    for(int i=n; i>0; i--){
        for(int j=1; j<=i; j++){
            if(i%2== 0)
            System.out.print(j);
            else 
            {
                int k = i ;
                while(k>0){
                    System.out.print(k);
                    k--;
                }
            }
        }
        System.out.println();
    }    }
}
/*import java.util.Scanner;
class Pattern {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in );
    
    System.out.println("enter the number of rows ");
    int n = sc.nextInt();
    for(int i = n ; i>0 ;i--){
        for(int j = 1; j<=i ;j++){
            if (i%2 != 0)
            System.out.print(j);
            else 
            System.out.print(i);
        }
        System.out.println();
    
    }} 
}*/