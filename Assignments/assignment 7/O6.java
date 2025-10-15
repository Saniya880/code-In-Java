/*Movie Rating System
Create a class Movie with fields: name, genre, and rating.
Use setters and create a method isHit() that returns true if rating ≥ 8.0.*/
class Movie{
    private String name;
    private String genre;
    private float rating;

    public void setData(String name, String genre, float rating){
        this.name= name;
        this.genre= genre;
        this.rating= rating;
    }

    public boolean isHit(){     //getter method used here 
        if(rating >= 8.0f)
        return true;
        return false;
    }
}
class Main{
    public static void main(String[]args){

    Movie obj= new Movie();

    obj.setData("Jab We Met", "Gen Z", 9.0f);
    System.out.println(obj.isHit());
    }
}