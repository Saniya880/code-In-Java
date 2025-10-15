// WAP to convert binary number into decimal number
import java.util.Scanner;
class Series{
    public static void main(String[]args){
    Scanner sc= new Scanner(System.in);

    System.out.println("Enter the binary number-");
    int binary = sc.nextInt();      //1010

    int digit=0,i=1,decimal=0;

    while(binary!=0){

    digit=binary%10;               //digit=0
    for(int j=1; j<i; j++){       //i=1,2,3,4  j=1,2,3
        digit*=2;
    }
        decimal+=digit;         //0+2+0+8
        i++;
        binary/=10;
    }
    System.out.println(decimal);  //10
    }
}