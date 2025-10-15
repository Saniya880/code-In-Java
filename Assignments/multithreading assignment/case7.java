class Task{
   public void m1(){

    System.out.println(Thread.currentThread().getName()+" is enter in m1()");
    System.out.println(Thread.currentThread().getName()+" is definetely execute this line ...");

    synchronized(this){

        for(int i=1; i<=3; i++){
        try{
            System.out.println(Thread.currentThread().getName()+" is entered in this block ");
            Thread.sleep(700);
        }catch(Exception e){ e.printStackTrace();}
        }
    }
    System.out.println(Thread.currentThread().getName()+" is outside of block...");
   }
}
class First extends Thread {
    private Task t;
    public First (Task t){
        this.t = t;
    }
    public void run(){
        t.m1();
    }
}
class Second extends Thread {
    private Task t;
    public Second (Task t){
        this.t = t;
    }
    public void run(){
        t.m1();
    }
}

class TestMain{
    public static void main(String[]args){
        Task task = new Task();
        First t1 = new First(task);
        Second t2 = new Second(task);

        t1.setName("Thread 1");
        t2.setName("Thread 2");

        t1.start();
        t2.start();
    }
}