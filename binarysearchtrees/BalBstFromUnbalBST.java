import java.util.ArrayList;

//To create a balances BST from a Unbalances BST

public class BalBstFromUnbalBST extends BinarySearchTree {
    public static void main(String[] args) {
        int values[] = {6,5,3,8,10,12,11};
        Node root = null;

        for(int val:values){
            root = insert(root,val);
        }

        ArrayList<Node> inorder = new ArrayList<>();
        getInorder(root, inorder);
        // for(Node n : inorder){
        //     System.out.print(n.data + " ");
        // }
        // System.out.println();

         root = generateBalBst(inorder, 0, inorder.size()-1);
        preorder(root);
    }

    

    private static BinarySearchTree.Node generateBalBst(ArrayList<BinarySearchTree.Node> inorder, int st, int end) {
        if(st > end) return null;

        int mid = (st+end)/2;
        Node root = new Node(inorder.get(mid).data);
        root.left = generateBalBst(inorder, st, mid-1);
        root.right = generateBalBst(inorder, mid+1, end);
        return root;

    }

    private static void getInorder(BinarySearchTree.Node root,  ArrayList<Node> inorder) {
        if(root == null){
            return;
        }

        getInorder(root.left, inorder);
        inorder.add(root);
        getInorder(root.right, inorder);
    }
}
