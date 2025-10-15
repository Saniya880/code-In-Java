class Task{
    
     synchronized public void m1(){
        for(int i=1; i<=5; i++){
            System.out.println(Thread.currentThread().getName()+"  Synchronized m1 is executing...");
            try{
                Thread.sleep(500);
            }catch(Exception e){System.out.println(e);}}
        }


        synchronized public void m2(){
        for(int i=1; i<=5; i++){
            System.out.println(Thread.currentThread().getName()+"  Synchronized m2 is executing...");
            try{
                Thread.sleep(500);
            }catch(Exception e){System.out.println(e);}}
        }


         public void m3(){
        for(int i=1; i<=5; i++){
            System.out.println(Thread.currentThread().getName()+"  Synchronized m3 is executing...");
            try{
                Thread.sleep(500);
            }catch(Exception e){System.out.println(e);}}
         } 
}
class First extends Thread {
    private Task t;

    public First(Task t){
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
        t.m2();
    }  
}
class Third extends Thread {
    private Task t;
    public Third (Task t){
       this.t = t;
    }
    public void run(){
        t.m3();
    }  
}
class TestMain{
    public static void main(String [] args){
        Task task = new Task();

        First t1 = new First(task);
        Second t2 = new Second(task);
        Third t3 = new Third(task);

        t1.start();
        t2.start();
        t3.start();
    }
}
