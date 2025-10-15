class Program33{
    public static void main(String[]args){
        int l1=20, b1=30, totalArea, p1Area, w1=4, p2Area, w2=3, overlap, gardenArea;
        totalArea = l1*b1;
        p1Area= w1*l1;
        p2Area= w2*b1;
        overlap= w1*w2;
        gardenArea= totalArea- (p1Area+ p2Area- overlap);
        System.out.println("total area = "+totalArea);
        System.out.println("path1 Area = "+p1Area);
        System.out.println("path 2 Area= "+p2Area);
        System.out.println("overlap area = " +overlap);
        System.out.println("Remaining garden area = "+gardenArea);
    }
}