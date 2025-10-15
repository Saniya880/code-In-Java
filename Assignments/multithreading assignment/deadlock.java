class A{
    
     synchronized public void m1(B obj2){

        System.out.println(Thread.currentThread().getName()+" is execution m1()");
        obj2.x2();  }

       /* for (int i=1; i<=3; i++){
            try{
                System.out.println(Thread.currentThread().getName()+" is execution m1()");
                Thread.sleep(700);
            }catch(Exception e){ e.printStackTrace(); }
        }*/
     
       synchronized public void m2(){
        for(int i=0; i<=3; i++){
    try{
        System.out.println(Thread.currentThread().getName()+" is execution m2()");
        Thread.sleep(700);
        }
        catch(Exception e){
         e.printStackTrace(); }
     }}
}
class B{
    synchronized public void x1( A obj1){

     System.out.println(Thread.currentThread().getName()+" is execution x1()");
        obj1.m2();   }

        /*for (int i=1; i<=3; i++){
            try{
                System.out.println(Thread.currentThread().getName()+" is execution x1()");
                Thread.sleep(900);
            }catch(Exception e){ e.printStackTrace(); }
        }*/
     
       synchronized public void x2(){
        for(int i=0; i<=3; i++){
    try{
        System.out.println(Thread.currentThread().getName()+" is execution x2()");
        Thread.sleep(500);
        }
        catch(Exception e){ 
        e.printStackTrace(); }
     }}
}
class First extends Thread{
    private A a;
    private B b;

    public First(A a, B b){
        this. a = a;
        this.b = b;
    }
    public void run(){
        a.m1(b);
    }
}
class Second extends Thread{
    private A a;
    private B b;

    public Second(A a, B b){
        this. a = a;
        this.b = b;
    }
    public void run(){
        b.x1(a);
    }
}
class TestMain{
    public static void main(String[]args){
    A obja = new A();
    B objb = new B();

    First t1 = new First(obja,objb);
    Second t2 = new Second(obja,objb);
     
     t1.setName("Thread 1");
     t2.setName("Thread 2");

     t1.start();
     t2.start();

    }
}