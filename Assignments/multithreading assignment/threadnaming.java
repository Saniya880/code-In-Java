class First extends Thread {
    public void run(){
        for(int i=1;i<=3; i++)
        System.out.println(Thread.currentThread()+" is executing...");
    }
}
class Second implements Runnable{
    public void run(){
        for(int i =3 ; i<=3; i++)
        System.out.println(Thread.currentThread()+" is executing...");
    }
}
class TestMain{
    public static void main(String[]args){

        Thread t = new Thread(r);
        First t1 = new First();
        Runnable r = new Second();            

        t1.start();
        t2.start();
    }
}
