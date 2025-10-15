class Program12{
public static void main(String[]args){
    int h=13,b=12;
    int hypo=h*h;
    int base=b*b;
    int l=hypo-base;
    double length= Math.sqrt(l);
    double area = 0.5f*length*b;
    System.out.println("Lenght = " +length);
    System.out.println("Area of right Angle is = "+area);
}
}