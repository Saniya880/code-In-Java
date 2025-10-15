// WAP to check whether entered number is strong or not
import java.util.Scanner;
class Series{
    public static void main(String[]args){
    Scanner sc= new Scanner (System.in);
     
     System.out.println("Enter the number-");
     int number= sc.nextInt();

     int n=0, temp=number,sum=0;
     while(number!=0){
         int f=1;
        n=number%10;
     for(int i=n; i>=1; i--){
        f=f*i;
        }
        sum+=f;
        number=number/10;}

      if(sum == temp)
        System.out.println(temp+"  is a strong number.");
      else
        System.out.println(temp+"  is not a strong number.");
    }
}