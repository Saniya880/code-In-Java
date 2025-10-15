class Program30{
    public static void main(String[]args){
   int l=5, b=8, tile, l2=200, b2=400;
   tile= l*b;
   int floorArea = l2*b2;
   float requiredTile= floorArea/tile;
   System.out.println("Area of one tile " +tile);
   System.out.println("Area of floor " +floorArea);
   System.out.println("Required tiles " +requiredTile);

    }
}