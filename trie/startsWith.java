package trie;

public class startsWith extends MyTrie {
    public static void main(String[] args) {
        String words[] = {"apple", "app", "mango", "man", "woman"};
        for(String word : words){
            insert(word);
        }

        String prefix = "appq";
        System.out.println(startsWith(prefix));
    }

    public static boolean startsWith(String prefix) {
        Node curr = root;
        for(char ch : prefix.toCharArray()){
            if(curr.children[ch-'a'] == null){
                return false;
            }
            curr = curr.children[ch-'a'];
        }
        return true;

    }

}
