//Write a Java program to create a class called "Person" with a name and age attribute. Create two instances of the "Person" class, set their attributes using the constructor, and print their name and age
class Person{
    private String name;
    private int age;

    public Person(String name, int age){            //constructor
        this.name = name;
        this.age = age;
    }
    String getName(){                           //Getters method
        return name;
     }
     int getAge(){
        return age;
     }
    public String print(){
        return "Name: "+this.name + " \nAge: "+this.age;
    }

    public Person display (Person p){                     // create method
        
         System.out.println(this.name + " \n"+this.age + " ");
         System.out.println(p.name+ " \n"+p.age + " ");
         return p;   
    }
}
class Main{
        public static void main(String[]args){

        Person p1 = new Person("Saniya ", 21);
        Person p2 = new Person ("Sara",20);
        String str = p1.print();
        System.out.println(str);
        Person show = p1.display(p2);
        System.out.println(show);
        
    }
}