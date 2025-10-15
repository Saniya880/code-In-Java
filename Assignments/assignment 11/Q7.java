/*Zoo Animal Management 🦁🐘🐦

Abstract class Animal:

name, age

abstract methods eat(), makeSound()

concrete method showInfo()

Subclasses:

Lion

Elephant

Parrot

Interface Flyable with fly() method.

Only Parrot implements Flyable.
 */

interface Flyable{
    public void fly();
}
abstract class Animal{
    private String name;
    private int age;

    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

    abstract public void eat();
    abstract public void makeSound();

    public String showInfo(){
        return this.getClass().getName()+" :  "+this.getName()+" - "+this.getAge();
    }}
class Lion extends Animal{
    public Lion(String n, int a){
        super (n,a);
    }
    public void eat(){
        System.out.println(showInfo()+" can eat.");
    }
    public void makeSound(){
        System.out.println(showInfo()+" can make sound.");
    }
    }
class Elephant extends Animal{
     public Elephant(String n, int a){
        super (n,a);
    }
    public void eat(){
        System.out.println(showInfo()+" can eat.");
    }
    public void makeSound(){
        System.out.println(showInfo()+" can make sound.");
    }
}
class Parrot  extends Animal implements Flyable{
     public Parrot (String n, int a){
        super (n,a);
    }
    public void eat(){
        System.out.println(showInfo()+" can eat.");
    }
    public void makeSound(){
        System.out.println(showInfo()+" can make sound.");
    }
    public void fly(){
        System.out.println(showInfo()+" can fly.");
    }
}
class Main{
    public static void main(String[]args){
        Lion l = new Lion("Jumbo",30);
        l.eat();
        l.makeSound();
        
        Elephant e =new Elephant("Toyo", 35);
        e.eat();
        e.makeSound();

        Parrot p = new Parrot("jojo", 4);
        p.eat();
        p.makeSound();
        p.fly();
    }
}

