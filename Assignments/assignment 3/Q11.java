import java.util.Scanner;
class Q11{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        int age; 
        char male='M',female='f', s,maritalStatus;
        System.out.println("Enter the age- ");
        age = sc.nextInt();
        System.out.println("Enter the sex- ('f'/'M')");
        s = sc.next().charAt(0);
        System.out.println("Enter your marital status- ('Y/'N')");
        maritalStatus = sc.next().charAt(0);
        if(s==female){
        System.out.println("Place of service- Urban Area");}
        else{
        if (s==male){
            if(age>20 && age<40){
                System.out.println("Place of service- can go for anywhere");
            }
            if( age>40 && age<60){
                System.out.println("Place of service- Urban area");
            }
        }
        else
        System.out.println("Invalid Initialization");
    }
}
}