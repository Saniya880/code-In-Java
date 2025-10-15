// A	b	C	d	E	f	G	h	…… n terms 
import java.util.Scanner;
class Series{
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter number of term-");
    int n= sc.nextInt();

    int i=1;
    char ch='A', ch2='b';
    while(i<=n){
    if(i%2==0){
        System.out.print(" "+ch2);
        ch2=(char)(ch2+2);}
    else{
    System.out.print(" "+ch);
    }
    ch=(char)(ch+1);
    i++;
    }
    }
    }
