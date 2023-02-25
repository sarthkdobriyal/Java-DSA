package trie;

public class countUniqSubstrings extends MyTrie {
    public static void main(String[] args) {
        String str = "apple";

        System.out.println(countUniqSubs(str));

    }

    public static int countUniqSubs(String str) {
        //get all suffixes and create a trie
        for(int i=0;i<str.length();i++){
            insert(str.substring(i));
        }

        //count nodes in the trie

        return getNodeCount(root);
    }

    public static int getNodeCount(Node root){
        if(root == null) return 0;

        int count  = 0;
        for(Node child: root.children){
            if(child != null){
                count += getNodeCount(child);
            }
        }

        return count + 1;
    }

}
