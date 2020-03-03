import java.util.ArrayList;
import java.util.List;

class PrimeCalculator {
    private List<Integer> elements = new ArrayList<Integer>();
    int nth(int nth) {
        if(nth <= 0){
            throw new IllegalArgumentException();
        }
        elements.add(2);
        for (int i = 1; i <= 104743; i++) {
            if(isPrime(i)){
                elements.add(i);
            }
        }
        return elements.get(nth);
    }
    private boolean isPrime(int number){
        int count = 0;
        for (int x = number; x > 0; x--) {
            if (number % x == 0) {
                count++;
            }
        }
        if (count == 2) {
            count = 0;
            return true;
        } else {
            return false;
        }
    }

}
