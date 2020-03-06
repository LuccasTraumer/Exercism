public class Clock{

    private int hours;
    private int minutes;



    public Clock(int hours, int minutes){
        this.minutes = manyMin(minutes);
        this.hours = manyHours(hours);
    }

    private int manyMin(int min){
        int horas = 0;
        int minute = this.minutes;
        if(min > 0) {
            while (min != 0) {
                minute++;
                min--;
                if(minute >= 60){
                    horas++;
                    minute=0;
                }
            }
            this.hours = manyHours(horas);
        }else{
            while(min != 0){
                minute--;
                min++;
                if(minute < 0){
                    hours--;
                    minute=59;
                }
            }
            this.hours = manyHours(hours);
        }

        return minute;
    }
    private int manyHours(int hours){
        int hour = this.hours;
        if(hours > 0){
            while(hours != 0) {
                hour++;
                hours--;
                if (hour > 23) {
                    hour = 0;
                }
            }
        }else{
            while(hours != 0) {
                hour--;
                hours++;
                if (hour < 0) {
                    hour = 23;
                }
            }
        }
        return hour;
    }

    public void add(int minutes){
        this.minutes = manyMin(minutes);
    }
    @Override
    public String toString(){
        return String.format("%02d:%02d", this.hours, this.minutes);
    }

    @Override
    public boolean equals(Object obj) {
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

    public int hashCode(){
        int ret = 1;
        int primo = 7;

        ret = ret * primo + new Integer(hours).hashCode();
        ret = ret * primo + new Integer(minutes).hashCode();

        if(ret < 0){
            ret -= ret;
        }

        return ret;
    }
}
