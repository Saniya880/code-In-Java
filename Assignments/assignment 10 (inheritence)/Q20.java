/*Create class Tile to store the edge length of a square tile , and create another class Floor to store length and width of a rectangular floor. Add method totalTiles(Tile t) in Floor class with Tile as argument to calculate the whole number of tiles needed to cover the floor completely.*/
import java.util.Scanner;
class Tile{

    private float edgeLength;

    public Tile(float edgeLength){
        this.edgeLength = edgeLength;
    }
    public float getLength(){
        return edgeLength;
    }
}
class Floor {

    private float length;
    private float width;
    

    public Floor (float length, float width){
        this.length = length;
        this.width = width;
    }
    public void totalTiles(Tile t){

      float tile_1 = t.getLength()*t.getLength();

      float  floor = length*width;

      float required_tiles = (floor / tile_1);
      System.out.println("Required tiles to cover the floor is : "+required_tiles);
    }
}
class Main{
    public static void main(String []args){
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Enter length of the tile : ");
        float edgeLength = sc.nextFloat();

        Tile obj = new Tile (edgeLength);
        System.out.println(obj.getLength());

        System.out.println("Enter length and width of Floor: ");
        float length = sc.nextFloat();
        float width =  sc.nextFloat();

        Floor obj2 = new Floor(length, width);
        obj2.totalTiles(obj);

    }
}