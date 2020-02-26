import java.util.ArrayList;
import java.util.List;

class SumOfMultiples {
    private List<Integer> values = new ArrayList<Integer>();
    SumOfMultiples(int number, int[] set) {
        for(int i=0; i <= number; i++){
            for(int x =0; x <= set.length-1; x++){
                if( i % set[x] == 0){
                    this.values.add(i);
                }
            }
        }
    }

    int getSum() {
        int sum = 0;
        for(int i =0; i <= this.values.size()-1;i++){
            sum += this.values.get(i);
        }
        return sum;
    }

}
