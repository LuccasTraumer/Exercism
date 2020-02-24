import java.lang.StringBuilder;
class RaindropConverter {

    String convert(int number) {
        String ret = "";

        for(int i=2; i <= number; i++){
            if(number % i == 0){
                if(i == 3)
                    ret += "Pling";
                if(i == 5)
                    ret += "Plang";
                if(i == 7)
                    ret += "Plong";
            }
        }
        if(ret.equals(""))
            ret += number+"";

        return ret;

    }

}
