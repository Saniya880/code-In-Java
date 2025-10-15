class Program14{
    public static void main(String[]args){
    float height1=13.0f, height2=10.0f, base=46.0f;            
     float triangle1 =1/2.0f*(base*height1);
    float triangle2 = 1/2.0f*(base*height2);
   float  totalArea= triangle1 + triangle2;
    System.out.println("Area of triangle 1 " +triangle1);
    System.out.println("Area of triangle 2 " +triangle2);
    System.out.println("The area of field :  " + totalArea+"cm square");
}
}