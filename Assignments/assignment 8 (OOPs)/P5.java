// Write a Java program to create a class called "Book" with attributes for title, author, and ISBN, and methods to add and remove books from a collection.
import java.util.ArrayList;
class Library{

      ArrayList <Book> al = new ArrayList <Book> ();
    public void addBook (Book b){
        al.add(b);
    }
    public void removeBook ( Book b){
        al.remove(b);
        }
    public void displayBookDetails(){
        for (Book b : al){
        System.out.println(b.getAllBookDetails());
    } }
}
class Book{
    private String title, author, ISBN;

    public Book(){}
    public Book (String title, String author, String ISBN){
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }
    public void SetData (String title, String author, String ISBN){
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }
    public String getAllBookDetails(){
        return title+ " : "+author+ " : "+ISBN;
    }
    }
    class Main{
        public static void main(String[]args){
        Book obj = new Book("Winged Warfare","Billy Bishop","125-568-798");
        Book obj1 = new Book("Many lives , Many Masters","Brain Weiss","144-568-748");
        Book obj2 = new Book("Think and grow rich","Tim Berner lee","165-588-358");

        Library l = new Library();
        l.addBook(obj);
        l.addBook(obj1);
        l.addBook(obj2);

        l.displayBookDetails();
        l.removeBook(obj);
        System.out.println("-----------------------------------------------------------------------");
        l.displayBookDetails();
        

        }
    }
   

