class Program24{
    public static void main(String[]args){
        int l=25, b=10, l1=20*100, b1=2*100;
        float h=7.5f, h1=0.75f*100, perSell=0.9f;
        float brick= l*b*h;
        float wall = l1*b1*h1;
        float requiredBrick= wall/brick;
        float cost= requiredBrick * perSell;
        System.out.println("Area of brick is   " + brick + "cm square. ");
        System.out.println("Area of wall is   " + wall + "cm square. ");
        System.out.println("Required brick = "+ requiredBrick);
        System.out.println("Cost of Required brick = "+ cost);
        
    }
}