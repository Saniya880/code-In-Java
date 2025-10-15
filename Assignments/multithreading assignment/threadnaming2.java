class First extends Thread {
    public void run(){
        for(int i=1;i<=3; i++)
        System.out.println(Thread.currentThread().getName()+" is executing...");
    }
}
class Second extends Thread{
    public void run(){
        for(int i =3 ; i<=3; i++)
        System.out.println(Thread.currentThread().getName()+" is executing...");
    }
}
class Third extends Thread{
    public void run(){
        for(int i=1; i<=3; i++)
        System.out.println(Thread.currentThread().getName()+" is execution...");
    }

}
class TestMain{
    public static void main(String[]args){

        First t1  = new First();
        Second t2 = new Second();
        Third t3 = new Third();

        t3.setPriority(Thread.MAX_PRIORITY);

        t3.setName("thread-3");
        t1.setName("thread-1");
        t2.setName("thread-2");

        t1.start();
        t2.start();
        t3.start();
    }
}
