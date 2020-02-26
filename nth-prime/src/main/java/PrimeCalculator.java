import java.util.ArrayList;
import java.util.List;

class PrimeCalculator {
    private List<Integer> elements = new ArrayList<Integer>();
    int nth(int nth) {
        int value = 10;
        boolean find = false;
        int count = 0;
        for(int i=0; i <= value || find != true; i++){
            for (int j = 10; j >= 1;j--){
                if(i % j == 0){
                    count++;
                }
                if(count > 2){
                    count = 0;
                    break;
                }
            }
            if(i == value){
                elements.add(i);
            }
        }
        return elements.get(nth);
    }

}
