class Program26{
    public static void main(String[]args){
        int l1=24, b1= 15, brick, path, p1=240;
        int p2= 12000;
        brick= l1*b1;
        path = p1*p2;
        float requiredBrick= path/brick;
        System.out.println("Required Brick "+requiredBrick);
    }
}