//Write a Java program to create a class called "Library" with a collection of books and methods to add and remove books.
import java.util.ArrayList;
import java.util.Scanner;
class Library{

    private ArrayList <Book> al = new ArrayList <Book>();

    public void addBooks(Book b){
          al.add(b);}
     
     public void deleteBook(String name){
        for(Book i : al){
            if(i.getName().equals(name))
             al.remove(i);
        }
       
     }
     public void displayAvailableBooks(){
        for(Book b: al){
            
            System.out.println(b.getName()+" : "+b.getAuthor());
        }
     }
    }
class Book{
    private String name;
    private String author;

    public void setName(String name ){
        this.name = name;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public String getName(){
        return name;
    }
    public String getAuthor(){
        return author;
    }
}
class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter the number of books- ");
        int n= sc.nextInt();

        Book obj [] = new Book [n];
        Library l = new Library();
        for(int i=0; i<n; i++){
            sc.nextLine();
            System.out.println("Ente name of book");
            String name = sc.nextLine();
            System.out.println("Enter the name of author");
            String author = sc.nextLine();
         obj [i] = new Book();
         obj [i].setName(name);
         obj [i].setAuthor(author);
         l.addBooks(obj[i]);
        }
        //for(int i=0; i<n; i++){
           // l.addBooks(obj);
        //}
        l.displayAvailableBooks();
        l.deleteBook(obj[1].getName());
        l.displayAvailableBooks();
    }
}