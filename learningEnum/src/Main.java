public class Main {
    public static void main(String[] args) {
        String str = "UCF";

        for(int i = 0; i <= str.length()-2;i+=2){
            for(int x = i+3; x <= str.length();x++) {
                System.out.println(str.subSequence(i, x));
                break;
            }

        }
    }
}
