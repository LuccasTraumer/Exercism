public class Clock{

    private int hours;
    private int minutes;
    public Clock(int hours,int minutes){
        this.hours = hours;
        this.minutes = minutes;
    }
    public void add(int value){
        

    }
    public boolean equals(Object obj){
        if(obj == null)
            return false;
        if(obj == this)
            return true;
        if(obj.getClass() != this.getClass())
            return false;
        Clock aux = (Clock)obj;
        if(aux.minutes != this.minutes)
            return false;
        if(aux.hours != this.hours)
            return false;

        return true;
    }
    public String toString(){
        if(hours >= 10){
            if(minutes >= 10)
                return this.hours +":"+ this.minutes;
            return this.hours +":0"+this.minutes;
        }else {
            if(minutes >= 10)
                return "0"+this.hours + ":"+this.minutes;
            return "0"+this.hours+":0"+this.minutes;
        }
    }
}