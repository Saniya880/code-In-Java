class Program21{
    public static void main(String[]args){
        int l1=15, b1=8, h1=5 ,brick, l2=15, b2=10, h2=8, wall;
        brick = l1*b1*h1;
        float convert= brick/100f;
        wall= l2* b2* h2;
        float requiredBrick = wall/convert;
        System.out.println("Volume of one brick is "+brick + "meter cube."); 
        System.out.println("Volume of wall is " + wall + "meter cube."); 
        System.out.println("Required bricks for wall is  "+ requiredBrick); 
    }
}