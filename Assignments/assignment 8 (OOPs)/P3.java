//. Write a Java program to create a class called "Rectangle" with width and height attributes. Calculate the area and perimeter of the rectangle.
class Rectangle{
    private float width;
    private float height;
    private float area;
    private float perimeter;
    
        public Rectangle(float width, float height){
        this.width = width;
        this.height = height;}


        public float getWidth(){
            return width;
        }
        public float getHeight(){
            return height;
        }

        public void setData(float width, float height){
            this.width = width;
            this.height = height;
        }
       
         public float area(){
        return width * height;}


         public float perimeter(){
         return 2*(width + height); }

         public void displayResult(){
            System.out.println("Area of rectangle - "+this.area());
            System.out.println("Perimenter of rectangle - "+this.perimeter());
         }    
         }
    
    class Main{
    public static void main(String[]args){
    Rectangle obj = new Rectangle (2.0f, 4.0f);
        
    obj.displayResult();
    }
}