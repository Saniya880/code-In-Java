import java.util.ArrayList;
import java.util.Collections;

class Customer{
    private int id;
    private String name;
    private int balance;
    
    public Customer(int id, String name, int balance){
        this.id = id;
        this.name = name;
        this.balance = balance;
    }
    public int hashCode(){
        return id;
    }
    public boolean equals(Object o){
        Customer c = (Customer)o;
        return (this.id == c.id) && (this.name.equals(c.name));
    }
    public Customer(){}
    public String toString(){
        return id+" "+name+" "+balance;
    }
}
class TestMain{
    public static void main(String args[]){
        ArrayList<Customer> al = new ArrayList<Customer>();
        al.add(new Customer(100,"A",60000));
        al.add(new Customer(103,"C",70000));
        al.add(new Customer(104,"D",90000));
        al.add(new Customer(102,"B",80000));
        al.add(new Customer(105,"E",40000));

        Collections.sort(al);
        for(Customer c : al)
          System.out.println(c);
    }
}