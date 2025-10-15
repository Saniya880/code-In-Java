class Time{
    private int minute;
    private int hour;
    private int second;

    public Time(){}

    public Time (int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public Time add ( Time t){     
        Time temp = new Time();
        temp.hour = this.hour + t.hour;

        temp.minute = this.minute + t.minute;

        temp.second = this.second + t.second;
        if(second >=60){
            temp.minute++;
            temp.second %=60;
        }

       if( minute>=60 ){
        temp.hour++; 
        temp.minute%=60;}
        return temp;
        }
           
    
        public int getHour(){
            return hour;
        }
        public int getMinute(){
            return minute;
        }
        public int  getSecond(){
            return second;
        }
}


class Main{
    public static void main(String[]args){
    Time obj= new Time(5, 88, 30);
    Time obj2 = new Time (6, 35, 30);
    obj.add (obj2);
    Time total = obj.add(obj2);
    System.out.println(total.getHour()+" h :  "+ total.getMinute()+ " m : "+total.getSecond()+" s");

    }


}