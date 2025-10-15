//Write a Java program to calculate profit or loss. 
import java.util.Scanner;
class Q41{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        int cp,sp,profit,loss;
        System.out.println("Enter cost price: ");
        cp=sc.nextInt();
        System.out.println("ENter selling price");
        sp=sc.nextInt();
        if(sp>cp){
            profit= sp-cp;
            System.out.println("Profit : "+profit);
        }
        else if (cp>sp){
            loss = cp-sp;
            System.out.println("loss : "+loss);
        }
        else if (sp==cp)
        System.out.println("No Profit No Loss");
    }
}