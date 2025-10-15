import java.util.Scanner;
class Q43{
public static void main(String[ ]args){
Scanner sc =  new Scanner (System.in);
System.out.println("enter your salary ");
double salary= sc.nextDouble();
if(salary<=10000){
double HRA=salary*20/100;
double DA=salary* 80/100;
System.out.println("gross salary-   "+ (salary+HRA+DA));
}
else if(salary<=20000){
double HRA= salary*25/100;
double DA= salary*90/100;
System.out.println("gross salry-   "+(salary+HRA+DA));
}
else if(salary>20000){      
double HRA= salary*30/100;
double DA= salary*90/100;
System.out.println("gross salry- "+(salary+HRA+DA));
}
}
}
