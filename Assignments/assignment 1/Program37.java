class Program37{
    public static void main(String[]args){
        int h=6, area=149;
        float r= area/(2*3.14f*h);
       float d=r*2f;
        System.out.println("radius = "+r);
        System.out.println("diameter= "+d);
        System.out.println("Check = "+ (2*3.14f*h*r));
    }
}