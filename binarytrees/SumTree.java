package binarytrees;

public class SumTree extends BinaryTrees {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        getSumTree(root);
        preorder(root);
        
    }


    public static int getSumTree(Node root){
        if(root == null) return 0;

        int leftSum = getSumTree(root.left);
        int rightSum = getSumTree(root.right);
        int data = root.data;   
        if(root.left == null || root.right == null){
            root.data = leftSum + rightSum;
        }else{
            root.data = root.left.data + leftSum + root.right.data+ rightSum;
        }
        return data;
    }

    public static void preorder(Node root){
        if(root == null){
            // System.out.print(-1 + " ");
            return;
        }

        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }


}
