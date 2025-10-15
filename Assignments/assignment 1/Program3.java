class Program3{
public static void main(String[]args){
int breadth=7, length=13,area1, tile, area2, length2=520, breadth2=140;
area1= length*breadth;
area2= length2*breadth2;
tile= area2/area1;
System.out.println("Area of 1 tile "+area1);
System.out.println("Area of floor "+area2);
System.out.println("Required tiles "+tile);
}
}