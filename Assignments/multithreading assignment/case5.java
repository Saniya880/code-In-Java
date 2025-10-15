// class level locking
class Task{
     synchronized static public void m1(){
        for(int i=1; i<=5; i++){
        try{
            System.out.println(Thread.currentThread().getName()+"  m1 of class task is executing...");
            Thread.sleep(1500);
        }catch(Exception e){System.out.println(e);}
        }
     }

     synchronized static public void m2(){
        for(int i=1; i<=5; i++){
        try{
            System.out.println(Thread.currentThread().getName()+"  m2 of class task is executing...");
            Thread.sleep(1500);
        }catch(Exception e){System.out.println(e);}
        }
     }
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
    public Second (Task t){
        this.t = t;
    }
    public void run(){
        t.m2();
    }
}

class TestMain{
    public static void main(String[]args){
        Task task = new Task();
        Task task2 = new Task();

        First t1 = new First(task);
        Second t2 = new Second(task2);

        t1.start();
        t2.start();

    }
}