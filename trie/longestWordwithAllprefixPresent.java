package trie;

public class longestWordwithAllprefixPresent  extends MyTrie{
    static String ans = "";
    public static void main(String[] args) {
        String words[] = {"a", "bannana", "app","appl","ap","apply","apple"};

        for(String word : words) {
            insert(word);
        }

        StringBuilder sb = new StringBuilder("");

        longestWord(root, sb);
        System.out.println(ans);
    }

    public static void longestWord(Node root, StringBuilder temp) {
        if(root == null) return;

        for(int i=0;i<26;i++){
            if(root.children[i] != null && root.children[i].endOfWord){
                temp.append((char)('a' + i));
                if(temp.length() > ans.length()){
                    ans = temp.toString();
                }
                longestWord(root.children[i], temp);
                temp.deleteCharAt(temp.length()-1);
            }
        }

    }
}
