//Print number between 1 to 5 in word format 
import java.util.Scanner;
class Q25{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter any number between (1-5) ");
        int number= sc.nextInt();
        if(number==1)
        System.out.println("One");
         else if(number==2){
        System.out.println("Two");}
        else if (number==3){
         System.out.println("Three");}
        else if (number==4){
        System.out.println("Four");}
        else if(number==5){
         System.out.println("five");
        }
        else{ 
         System.out.println("Invalid Number");
            }
                    
                
            
        }
    }
