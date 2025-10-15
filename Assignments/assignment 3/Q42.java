import java.util.Scanner;
class Q42{
public static void main(String[ ]args){
Scanner sc =  new Scanner (System.in);
System.out.println("enter your physics marks(1-100)");
double phyMarks=sc.nextDouble();
System.out.println("enter your chemistry marks(1-100)");
double cheMarks= sc.nextDouble();
System.out.println("enter your biology marks (1-100)");
double bioMarks= sc.nextDouble();
System.out.println("enter your Mathematics marks(1-100)");
double mathmarks=sc.nextDouble();
System.out.println("enter your Computer marks(1-100)");
double comMarks= sc.nextDouble();
double total=(phyMarks+cheMarks +comMarks+mathmarks+bioMarks);
double  Percentage=total/5f;
System.out.println("Percentage= "+Percentage);
	if (Percentage >= 90)
System.out.println("Grade A ");
	else if (Percentage >= 80) 
    System.out.println("Grade B ");
	else if (Percentage >= 70)
System.out.println("Grade C ");
	else if(Percentage >= 60) 
    System.out.println("Grade D ");
	else if (Percentage >= 40)
     System.out.println("Grade E ");
	else if (Percentage < 40) 
    System.out.println("Grade F");
}
}
