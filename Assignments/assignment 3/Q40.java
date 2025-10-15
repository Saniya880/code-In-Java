//Write a Java program to count total number of notes in given amount.   
import java.util.Scanner;
class Q40{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the amount");
        int amount = sc.nextInt();
         int a = amount /2000;
         amount= amount-(a*2000);
         int b = amount / 500;
         amount= amount- (b*500);
         int c= amount /100;
         amount=amount-(c*100);
         int d= amount /50;
         amount=amount-(d*50);
         int e= amount /10;
         amount=amount-(e*10);
         System.out.println("Number of 2000 notes is "+a);
System.out.println("Number of 500 notes is "+b);
System.out.println("Number of 100 notes is "+c);
System.out.println("Number of 50 notes is "+d);
System.out.println("Number of 10 notes is "+e);
    }
}