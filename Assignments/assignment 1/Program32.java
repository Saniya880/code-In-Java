class Program32{
    public static void main(String[]args){
        int side1=150, side2 = 25;
        int totalArea= side1*side1;
        int swimArea= side2*side2;
        int gardenArea= totalArea - swimArea;
        System.out.println("Remainning Garden Area= " +gardenArea);
    
    }
}