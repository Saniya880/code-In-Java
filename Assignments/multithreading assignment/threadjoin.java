class First extends Thread{
    public void run(){
        for(int i =3 ; i<=3; i++)
        System.out.println(Thread.currentThread()+" is executing...");
    }
}
class Second extends Thread{
    public void run(){
        for(int i =3 ; i<=3; i++)
        System.out.println(Thread.currentThread()+" is executing...");
    }
}
class TestMain{
    public static void main(String[]args) throws InterruptedException{

        First t1 = new First(); 
        Second t2 = new Second();         

        t1.start();
        t1.join();

        t2.start();
    }
}
