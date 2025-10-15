//Write a C program to input electricity unit charges and calculate total electricity bill according to the given condition: For first 50 units Rs. 0.50/unit For next 100 units Rs. 0.75/unit For next 100 units Rs. 1.20/unit For unit above 250 Rs. 1.50/unit An additional surcharge of 20% is added to the bil
import java.util.Scanner;
class Q44{
    public static void main(String[]args){
    Scanner sc = new Scanner (System.in);

    System.out.println("ENter the previous unit- ");
    float previous_unit = sc.nextFloat();
    
    System.out.println("Enter the current unit - ");
    float current_unit = sc.nextFloat();
    float total_units=0;

    if (current_unit > previous_unit)
     total_units = current_unit - previous_unit  ;
    else
    System.out.println("Enter correct unit...");
    System.out.println(total_units);

float units1 = 0, units2 = 0, units3 = 0, units4 = 0;

if (total_units <= 50) {
    units1 = total_units;
} else if (total_units <= 150) {
    units1 = 50;
    units2 = total_units - 50;
} else if (total_units <= 250) {
    units1 = 50;
    units2 = 100;
    units3 = total_units - 150;
} else {
    units1 = 50;
    units2 = 100;
    units3 = 100;
    units4 = total_units - 250;
}

        float amount1 = units1 * 0.50f;
        float amount2 = units2 * 0.75f;
        float amount3 = units3 * 1.20f;
        float amount4 = units4 * 1.50f;

    
        float total = amount1 + amount2 + amount3 + amount4;

        float surcharge = total * 0.20f;

        
        float bill = total + surcharge;

        System.out.println("Electricity Bill-:");
        
        System.out.println("Amount : " + bill+" rs.");
    
    }
}
