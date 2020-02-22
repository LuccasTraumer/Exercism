class RaindropConverter {

    String convert(int number) {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        String ret = "";

        for(int i=0; i <= number/2; i++){
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
            ret += number;

        return ret;

    }

}
