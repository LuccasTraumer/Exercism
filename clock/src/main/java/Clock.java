public class Clock{

    private int hours;
    private int minutes;



    public Clock(int hours, int minutes){
        this.minutes = manyMin(minutes);
        this.hours = manyHours(hours);
    }

    private int manyMin(int min){
        int hours = 0;
        int minute = this.minutes;
        if(min > 0) {
            while (min != 0) {
                minute++;
                min--;
                if(minute >= 60){
                    hours++;
                    minute=0;
                }
            }
            this.hours = manyHours(hours);
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
        System.out.println();
    }
    public String toString(){
        String horas = this.hours+"";
        String minutes = this.minutes+"";

        horas = horas.length() > 1 ? horas+":" : "0"+horas+":";
        minutes =minutes.length() > 1 ? minutes : "0"+minutes;

        return horas + minutes;
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
}
