package binarytrees;

//To find the minimum distance between two given nodes


public class MinDistNodes extends BinaryTrees {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        int n1 = 4, n2 = 7;

        int minDist = getMinDist( root,  n1,  n2);
        System.out.println("Minimum Distance : " + minDist);
    }

    public static int getMinDist(Node root , int  n1, int n2){
        Node lca = getLca(root,n1,n2);
        return lcaDist(lca, n1) + lcaDist(lca,n2);
    }

    public static int lcaDist(Node root, int node){
        if(root == null){
            return -1;
        }
        if(root.data == node) return 0;
        int left = lcaDist(root.left, node);
        int right = lcaDist(root.right,node);
        if(left == -1 && right == -1) return -1;
        else if(left == -1) return right+1;
        else  return left+1;
        

    }

    public static Node getLca(Node root, int n1,int n2){
        if(root == null || root.data==n1 || root.data == n2) return root;
        Node left = getLca(root.left, n1, n2);
        Node right = getLca(root.right, n1, n2);

        if(left == null) return right;
        if(right == null) return left;
        return root;
    }




}
