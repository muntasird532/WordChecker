import java.util.ArrayList;
public class WordChecker {
    private ArrayList<String> wordList;
    public WordChecker(ArrayList<String> list)
    {
        ArrayList<String> list= new Arraylist<String>
        wordList = list;
        wordList = new ArrayList<String>();

    }
    public boolean isWordChain() {
        boolean wordChain = true;
        for(int i = 1; i < wordList.size(); i++) {
            String after = wordList.get(i);
            String before = wordList.get(i - 1);
            if(after.indexOf(before) < 0) {
                return false;
            }
        }
    }

}
