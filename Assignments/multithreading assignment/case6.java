class Task{

     synchronized public void m1(){
        for(int i=1; i<=3; i++){
            try{
            System.out.println("Instance "+Thread.currentThread().getName()+"  is executing   m1()");
            Thread.sleep(1500);}
            catch(Exception e){ e.printStackTrace();}
        }}

    synchronized public void m2(){
        for(int i=1; i<=3; i++){
            try{
            System.out.println(" Instance " +Thread.currentThread().getName()+"  is executing  m2()");
            Thread.sleep(500);}
          catch(Exception e){ e.printStackTrace();}

        }}

    synchronized static public void m3(){
        for(int i=1; i<=3; i++){
            try{
            System.out.println("Static "+Thread.currentThread().getName()+"  is executing  m3()");
            Thread.sleep(1700);}
            catch(Exception e){ e.printStackTrace();}
        }}

    synchronized public static void m4(){
        for(int i=1; i<=3; i++){
            try{
            System.out.println("Static "+Thread.currentThread().getName()+"  is executing   m4()");
            Thread.sleep(1800);}
            catch(Exception e){ e.printStackTrace();}
        }}
}
class First extends Thread{
    private Task t;
    
    public First(Task t){
        this.t = t;
    }
    public void run(){
        t.m1();
    }
}
class Second extends Thread{
    private Task t;
    
    public Second(Task t){
        this.t = t;
    }
    public void run(){
        t.m2();
    }
}
class Third extends Thread{
    private Task t;
    
    public Third (Task t){
        this.t = t;
    }
    public void run(){
        t.m3();
    }
}
class Four extends Thread{
    private Task t;
    
    public Four (Task t){
        this.t = t;
    }
    public void run(){
        t.m4();
    }
}
class TestMain{
    public static void main(String[]args){

        Task task = new Task();
        First t1 = new First(task);
        Second t2 = new Second(task);
        Third  t3 = new Third (task);
        Four t4 = new Four (task);

        t1.setName("Thread 1");
        t2.setName("Thread 2");
        t3.setName("Thread 3");
        t4.setName("Thread 4");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
 }
}