import java.util.ArrayList;
import java.util.List;

class ProteinTranslator {
    private List<String> elements= new ArrayList<String>();
    private List<String> result = new ArrayList<String>();
    List<String> translate(String rnaSequence) {

        for(int i=0; i <= rnaSequence.length()-1;i+=3){
            String ret = rnaSequence.subSequence(i,i+3)+"";
            if(ret.equals("UAA") || ret.equals("UAG") || ret.equals("UGA"))
                break;
            else
                elements.add(ret);
        }

        for (int i=0; i <= elements.size()-1;i++){
            result.add(howIs(elements.get(i)));
        }
        for(int i=0; i <= result.size()-1;i++) {
            if(result.get(i).equals("STOP"))
                result.remove(i);
        }
        return result;
    }
    private String howIs(String elemnt){
        if(elemnt.equals("AUG"))
            return "Methionine";
        if(elemnt.equals("UUU") || elemnt.equals("UUC"))
            return "Phenylalanine";
        if(elemnt.equals("UUA") || elemnt.equals("UUG"))
            return "Leucine";
        if(elemnt.equals("UCU") || elemnt.equals("UCC") || elemnt.equals("UCA") || elemnt.equals("UCG"))
            return "Serine";
        if(elemnt.equals("UAU") || elemnt.equals("UAC"))
            return "Tyrosine";
        if(elemnt.equals("UGU") || elemnt.equals("UGC"))
            return "Cysteine";
        if(elemnt.equals("UGG"))
            return "Tryptophan";
        else
            return "STOP";
    }
}