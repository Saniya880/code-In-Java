class Program34{
    public static void main(String[]args){
int a=128, b=92, h=40, wide=4, widearea;
float woodenArea= 1/2f*(a+b)*h;
widearea= wide*h;
float totalArea= woodenArea + widearea;
System.out.println("Wooden area = "+woodenArea);
System.out.println("Walkway area = "+widearea);
System.out.println("Total area after adding both =  "+totalArea);
    }
}