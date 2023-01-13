

public class MirrorBST extends BinarySearchTree {
    public static void main(String[] args) {
        int values[] = {8,5,10,3,6,11};
        Node root = null;

        for(int val:values){
            root = insert(root,val);
        }

        preorder(root);
        System.out.println();
         root = mirror(root);
        preorder(root);
    }

    public static Node mirror(Node root){
        if(root == null) return null;

        Node leftS = mirror(root.left);
        Node rigthS = mirror(root.right);

        root.left = rigthS;
        root.right = leftS;
        return root;

    }

}
