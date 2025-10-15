/*Book Library
Create a class Book with fields: title, author, and price.
Use setters to assign values and a method to print book details.*/
class Book{

    private String title;
    private String author;
    private int price;

    public void setT(String t){
        title=t;
    }
    public void setA(String a){
        author=a;
    }
    public void setP(int p){
        price=p;
    }
    public void details(){
        System.out.println("The Name of the book - "+title);
        System.out.println("The Author of the book is- "+author);
        System.out.println("The price of book is - "+price);
    }
}
class Main{
    public static void main(String[]args){

    Book obj= new Book();
    obj.setT("MANY LIVES, MANY MASTERS");
    obj.setA("DR BRAIN WEISS");
    obj.setP(350);
    obj.details();
    }
}