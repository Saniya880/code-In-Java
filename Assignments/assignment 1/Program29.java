class Program29{
    public static void main(String[]args){
        int side=10, l=800, b=900;
        int floor= l*b;
        int tile= side*side;
        float requiredTiles= floor/tile;
        System.out.println("Area of floor "+floor);
        System.out.println("Required tiles for the floor "+ requiredTiles);
    }
}