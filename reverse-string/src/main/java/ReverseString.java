class ReverseString {

    String reverse(String inputString) {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        String word = "";
        for(int i =inputString.length()-1; i >= 0;i--)
            word += inputString.charAt(i);

        return word;
    }
  
}