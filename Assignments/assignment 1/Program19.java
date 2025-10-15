class Program19{
    public static void main(String[]args){
        int length=50, breadth=30, rounds=10, perimeter, distance;
        perimeter= 2 * (length+breadth);
        distance= perimeter * rounds;
        System.out.println("The lenght of rectangular park is " +perimeter + "m .");
        System.out.println("Distance covered by ron in one day =  " + distance,+ "meter.");
        float convert = distance / 1000f;
        System.out.println("Distance in km=  " + convert);
        
    }
}