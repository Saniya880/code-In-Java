import java.util.Scanner;
class Q45{
public static void main(String[]args){
Scanner sc =  new Scanner (System.in);

System.out.println("Enter your choice");
System.out.println(" Enter '+' for addition");
System.out.println("Enter '>' for compare two number");
System.out.println("Enter '==' check equality");
String choice= sc.nextLine();

switch(choice){

case "+" : 
System.out.println("Enter two number");
double a=sc.nextDouble();
double b=sc.nextDouble();
System.out.println("addition  "+(a+b));
break;

case ">" :
System.out.println("Enter two number");
a=sc.nextDouble();
b=sc.nextDouble();
if(a>b)
System.out.println("A is greater");
else
System.out.println("B is greater");
break;

case "==" : 
System.out.println("Enter two number");
a=sc.nextDouble();
b=sc.nextDouble();
if(a==b)
System.out.println("Both  given numbers are equal");
else
System.out.println("Given numbers are not equal");
break;

default:
    System.out.println("Enter correct sign");
}
}
}
