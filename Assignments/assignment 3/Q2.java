import java.util.Scanner;
class Q2{
    public static void main(String[]args){
        Scanner sc= new Scanner (System.in);
        int discount ,total_cost, quantity, perUnit=100;
        System.out.println("Enter the quantity of purchased item- ");
        quantity = sc.nextInt();
        total_cost= quantity*perUnit;
        if (total_cost > 1000){
        System.out.println("Congrates, you get 10% discount ");
        discount = quantity *10/100;
        System.out.println("Instead of this    "+quantity + "\nYou only have to pay "+ (quantity-discount));
        }
        else{
            System.out.println("You have to pay- "+ quantity);
        }
    }
}