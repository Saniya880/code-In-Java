//38) WAP to check whether entered number is Armstrong or not
import java.util.Scanner;
class Series{
    public static void main(String[]args){
    Scanner sc= new Scanner (System.in);

    System.out.println("Enter any number- ");
    int num= sc.nextInt();

    int length=0, temp=num;
    while(temp!=0){
        temp=temp/10;
        length= leng
        th+1;
    }

    int temp2=num,rem=0, arm=0,multi=1;;
    while(temp2!=0){
       
        for(int i=1; i<=length; i++){
            multi= rem*multi;
        }
        temp=temp2/10;
        arm=arm+multi;
    }
    if(arm == multi)
        System.out.println("Number is Armstrong.");
        else
        System.out.println("Number is not Armstrong.");
    

    /*int n=9474,digit=1,sum=0,temp=n;
    while(n!=0){
        digit=n%10;
        digit=digit*digit*digit*digit;
        sum+=digit;
        n/=10;
    }
    if(sum == temp)
    System.out.println(temp+" is an armstrong.");
    else
    System.out.println(temp+" isn't an armstrong.");*/
    }}