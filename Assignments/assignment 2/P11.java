import java.util.Scanner;
class P11{                  //something wrong
    public static void main(String[]args){
        Scanner sc= new Scanner (System.in);
        double ratioB, ratioH, area,ratio,x, a;
        System.out.println("Enter  ratio 1");
        ratioB= sc.nextDouble();
        System.out.println("Enter ratio 2 ");
        ratioH= sc.nextDouble();
        System.out.println("Enter the area of triagle- ");
        area = sc.nextDouble();
        a=1/2*ratioB*ratioH;
        ratio=area/a;
         x=Math.sqrt(ratio);
        double height= ratioH *x;
        double base= ratioB*x;
        System.out.println("x= "+x);
        System.out.println("h= "+height);
        System.out.println("b= "+base);
    }
}
