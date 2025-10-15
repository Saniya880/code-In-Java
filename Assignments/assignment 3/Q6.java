import java.util.Scanner;   //find absolute value
class Q6{
    public static void main(String[]args){
        Scanner sc= new Scanner (System.in);
int number;
System.out.println("Enter any non negative number  ");
number= sc.nextInt();
if (number > 0){
    System.out.println("Number- "+number);
}
else if (number< 0){
    System.out.println("Number- "+(number*-1));
}else if (number==0)
system.out.println("Enter valid number");
    }
}