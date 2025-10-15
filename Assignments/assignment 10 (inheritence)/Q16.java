/*Create a class Person with properties (name and age) with following features.
Default age of person should be 18.
A person object can be initialized with name and age.
Method to display name and age of person.
*/
import java.util.Scanner;
class Person{
    private String name;
    private int age;

    public Person(){
        age = 18;
    }
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public  String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void display(){
        System.out.println("-------------------------------------------");
        System.out.println("Name- "+getName());
        System.out.println("Age- "+getAge());
    }
    }
class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Name- ");
        String name = sc.nextLine();
        System.out.println("Enter age-");
        int age = sc.nextInt();

        Person obj = new Person();
        Person obj1 = new Person(name,age);
       System.out.println( obj.getAge());
        obj1.display();
    }
}
   