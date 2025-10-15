// Write a Java program to calculate profit or loss. 
import java.util.Scanner;
class Q39{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Selling Price");
        double sp=sc.nextDouble();
         System.out.println("Enter Cost Price");
        double cp=sc.nextDouble();
        if(sp>cp){
            double profit= sp-cp;
            System.out.println("Profit : "+profit +"\n Profit in % : "+(profit/cp)*100);
        }
        else if (cp>sp){
            double loss= cp-sp;
            double losspercent= (loss/cp)*100;
            System.out.println("Loss : "  + loss + "\n Loss in % : "+losspercent);
            }
            else
            System.out.println("No profit NO loss");
    }
}