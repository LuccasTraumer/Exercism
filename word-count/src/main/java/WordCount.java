import java.util.HashMap;
import java.util.Map;

public class WordCount{

    private int count = 0;
    private Map<String,Integer> words;

    public WordCount(){
        words = new HashMap<>();
    }
    public Map phrase(String word){
        String wordClone = word;
        wordClone = wordClone.toLowerCase();

        String[] values = wordClone.split("[\n:.,!&@$%^ ]");

        values = initWithMark(values); // This method will remove '' if a word init with '

        countWord(values); // method count the words and put on List words
        return words;
    }

    private String[] initWithMark(String[] values){
        String newWord="";
        for(int i=0; i <= values.length-1;i++){

            if(!values[i].equals("")){

                if(values[i].charAt(0) == '\'' ) {

                   newWord = values[i].substring(1, values[i].length() - 1);
                    values[i] = newWord;
                }
            }
        }
        return values;
    }
    private void countWord(String[] values){
        for (int i =0; i <= values.length-1;i++){

            for(int x=0; x <= values.length-1;x++){

                if (values[i].equals(values[x])) {
                    count++;
                }
            }
            if(!values[i].equals("")) {
                words.put(values[i], count);
            }
            count = 0;
        }
    }

    public Map getWords(){
        return words;
    }
}