import java.util.Scanner;
class Q5{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        int person1,person2,person3,age;
        System.out.println("Enter age of 3 people");
        person1 = sc.nextInt();
        person2= sc.nextInt();
        person3= sc.nextInt();
        if ((person1 > person2) && (person1 > person3) && person1 > 18){
            System.out.println("person 1 is oldest among all people");
        }
        if((person2>person1)&& (person2 > person3) && person2 >18){
            System.out.println("person 2 is oldest among all ");
        }
            System.out.println("Person 3 is youngest among all ");
    }
}