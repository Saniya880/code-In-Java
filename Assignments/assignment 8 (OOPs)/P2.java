// Write a Java program to create a class called "Dog" with a name and breed attribute. Create two instances of the "Dog" class, set their attributes using the constructor and modify the attributes using the setter methods and print the updated values.
class Dog{
    private String name;
    private String breed;

    public Dog(String name, String breed){
        this.name = name;
        this.breed = breed;
    }
    public void setData(String name, String breed){
        this.name = name;
        this.breed = breed;
    }
    public String getName(){
        return name;
    }
    public String getBreed(){
        return breed;
    }
    public String updateInfo( Dog d){
        return "Name 1: "+this.name+"\tBreed : "+this.breed+"\nName 2: "+d.name+ "\tBreed : "+d.breed;
    }


}
class Main{
    public static void main(String[]args){
        Dog obj = new Dog ("JoJo", "Pomeranian");
        Dog obj2 = new Dog ("Sky","Bulldog");

        System.out.println(obj.getName()+" "+obj.getBreed()+"  ");
        System.out.println(obj2.getName()+" "+obj2.getBreed()+"  ");

        obj2.setData("Tom","Poodle");
        String print = obj.updateInfo(obj2);
        System.out.println(print);
    
    }
}
