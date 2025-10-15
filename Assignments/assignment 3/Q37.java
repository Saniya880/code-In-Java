// Write a Java program to count total number of notes in given amount. 
import java.util.Scanner;
class Q37{
    public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    
        System.out.println("Enter amount");
        int amount = sc.nextInt();

        if (amount >=2000){
            int note = amount / 2000;
            amount = amount - 2000*note;
            System.out.println(note+" note of 2000");
        }
         if(amount >=1000){
            int n = amount / 1000;
            amount = amount - 1000*n;
            System.out.println(n+" note of 1000");
        }
         if(amount >=500 ){
            int n1 = amount/500;
             amount = amount - 500*n1;
             System.out.println(n1+" note of 500");}
         if (amount >=200){
            int n2= amount / 200;
            amount = amount - 200*n2;
            System.out.println(n2+ " note of 200");}
          if (amount >= 100){
            int n3 = amount / 100;
            amount = amount-100*n3;
            System.out.println(n3+ " note of 100");}
         if (amount >=50){
                int n4 = amount /50;
                amount = amount - 50*n4;
                System.out.println(n4+ " note of 50");
            }
          if(amount >=20){
                int n5 = amount / 20;
                amount = amount - 20*n5;
                System.out.println(n5+ " note of 20");
            }
         if(amount >=10){
                int n6 = amount / 10;
                amount = amount -10*n6;
                System.out.println(n6+ " note of 10");
            }
          if(amount < 10 && amount > 0){
                System.out.println(amount+ "  remaining as coins");
            }            
        }
        }
    




    


    



