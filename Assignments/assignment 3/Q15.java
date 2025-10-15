    import java.util.Scanner;
    class Q15{
        public static void main(String[]args){
            Scanner sc = new Scanner(System.in);
            int CP, tax;
            System.out.println("Enter The cost price of bike");
            CP= sc.nextInt();
            if(CP>100000){
                tax= (CP*15/100);
                System.out.println("You have to pay 15% tax that is -  "+tax);
            }
             if (CP>50000 && CP<=100000){
                tax= (CP*10/100);
                System.out.println("You have to pay 10% tax that is -  "+tax);
             }
             if (CP<=50000){
                tax=(CP*5/100);
                System.out.println("You have to pay 5% tax that is -  "+tax);
            }
            
        }
    }