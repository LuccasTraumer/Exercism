public class Clock{

    private int hours;
    private int minutes;
    public Clock(int hours,int minutes){

    }
    public void add(int value){

    }
    public String toString(){
        if(hours >= 10){
            if(minutes >= 10)
                return this.hours +":"+ this.minutes;
            return this.hours +": 0"+this.minutes;
        }else {
            if(minutes >= 10)
                return "0"+this.hours + ":"+this.minutes;
            return "0"+this.hours+": 0"+this.minutes;
        }
    }
}