class Program38{
    public static void main(String[]args){
        double volume= 1287.0, r=10.0;
        double h=volume/3.14*r*r;
        double surface=3.14*r*(r+h);
        System.out.println("h = "+h);
        System.out.println("Surface area =  "+surface);

    }
}