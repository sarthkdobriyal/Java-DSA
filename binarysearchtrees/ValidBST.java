
public class ValidBST extends BinarySearchTree {
    public static void main(String[] args) {
        int values[] = {8,5,10,3,6,11,1,4,14};
        Node root = null;

        for(int val:values){
            root = insert(root,val);
        }

        System.out.println(isValidBST(root, null, null));
    }

    public static boolean isValidBST(Node root , Node min, Node max){
        if(root == null) return true;

        if(min != null && root.data <= min.data) return false;
        else if(max != null && root.data >= max.data) return false;
        else return isValidBST(root.left, min, root) && isValidBST(root.right, root, max);


    }

}
