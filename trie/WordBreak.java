package trie;

public class WordBreak extends MyTrie {
    public static void main(String[] args) {
        String[] words = {"i", "like", "sam", "samsung", "mobile", "ice","any"};
        String key = "ilikesamsung";
        MyTrie trie = new MyTrie();
        for (String word : words) {
            insert( word);
        }
;

        System.out.println(wordBreak( key));
        
    }

    public static boolean wordBreak(String word) {
        if(word.length() == 0) return true;

        for(int i=1;i<=word.length();i++){
            String first = word.substring(0, i);
            String second = word.substring(i);
            if(search(first) ==true && wordBreak(second)){
                return true;
            }
        }
        return false;
    }

}
