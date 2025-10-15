/*Circle Geometry
Create a class Circle with field radius.
Use a setter to assign radius. Add methods to compute area and circumference.*/
class Circle{

         private float radius;

        public void setData(float r){
        radius = r;
    }

         public float area(){
        float area=3.14f*radius*radius;
        return area;
        
    }

         public float circumference(){
         float circum= 2 * 3.14f * radius;
         return circum;
         
    }
}
class Main{
    public static void main(String[]args){

        Circle obj= new Circle();

        obj.setData(2.0f);
        System.out.println("Area of circle - "+obj.area());
        System.out.println("Circumference of circle - "+obj.circumference());
    }
}
