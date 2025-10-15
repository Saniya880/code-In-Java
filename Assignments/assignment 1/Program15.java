class Program15{
    public static void main(String[]args){
        int l=22, b=15, shellyarea, rachelarea, side=21;
        rachelarea= side*side;
        shellyarea= l*b;
        System.out.println("Shelly garden area = "+shellyarea);
        System.out.println("Rachel garden area = " + rachelarea);
        if (rachelarea > shellyarea){
            System.out.println("Rachel garden is "+(rachelarea- shellyarea)+ "cm more than shelly garden");
        }
        else{
            System.out.println("Shelly garden is "+(shellyarea- rachelarea)+ "cm more than rachel garden");
        }
    }
}