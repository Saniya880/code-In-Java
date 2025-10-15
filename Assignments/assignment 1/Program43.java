class Program43{
    public static void main(String[]args){
        int h=4, l=5;
        double r = l*l - h*h;
        double radius= Math.sqrt(r);
        double area= (3.14*radius*radius);
        double rate= area*10;
        System.out.println("radius =   "+ radius + "Area of cone "+area);
    }
}