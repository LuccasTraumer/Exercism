import java.lang.StringBuilder;
class ReverseString {

    String reverse(String inputString) {
        String word = new StringBuilder(inputString).reverse().toString();
        return word;
    }
  
}