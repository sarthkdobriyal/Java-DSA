

public class SearchInBst extends BinarySearchTree {
    public static void main(String[] args) {
        Node root = null;
        int values[] = {8,5,10,3,6,11,1,4,14};
        for(int val : values){
            root = insert(root,val);
        }

        int key = 7;

        boolean isFound = search(root, key);
        System.out.println(isFound);
    }

    public static boolean search(Node root, int key){
        if(root == null) return false;

        if(root.data == key){
            return true;
        }else if(root.data > key){
            return search(root.left,key);
        }else{
            return search(root.right,key);
        }
    }


}
