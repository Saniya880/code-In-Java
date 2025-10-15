class Program5{
    public static void main(String[]args){
int fencingCost=1600, area, breadth;
int perimeter, perRate=25, length=20;
perimeter=fencingCost/perRate;
breadth= (perimeter-length)/2;
area= length*breadth;
System.out.println("perimeter "+perimeter);
System.out.println("Breadth of park = " +breadth);
System.out.println("Area of the field " +area);
    }
}