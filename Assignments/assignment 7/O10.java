/*Rectangle Area Calculator
Create a class Rectangle with fields: length, width.
Use setters to assign values. Add a method to calculate area.*/
class Rectangle{
    private float length;
    private float breadth;

    public void setData(float l,breadth b){
        length = l;
        breadth = b;
        
    }

    public float calculate(){
        float area = length * breadth;
        return area;
    }

}
class Main{
    public static void main(String[]args){
    Rectangle obj= new Rectangle ();
    obj.setData(13.0f, 14.0f);
    System.out.println("Area of rectangle- "+obj.calculate());
    }
}