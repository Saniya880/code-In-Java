class Program18{
    public static void main(String[]args){
        int side=7, length=7, breadth=4, height=8, cubev, cuboidv;
        cubev= side*side*side;
        cuboidv= length*breadth*height;
        System.out.println("Volume of cube  " + cubev+ " meter cube.");
        System.out.println("Volume of cuboid  " + cuboidv + " meter cube.");
        if (cubev > cuboidv){
            System.out.println("cube shape has more volume than cuboid" );
        }
        else{
            System.out.println("cuboid haas more volume than cube");
        }
    }
}