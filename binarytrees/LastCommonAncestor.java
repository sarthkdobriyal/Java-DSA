package binarytrees;

import java.util.ArrayList;

// Given two nodes n1 and n2 from a tree. Find the last common ancestor of the nodes
//last common ancestor is that node after which path changes for each node.


public class LastCommonAncestor extends BinaryTrees {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        int n1 = 4; int n2 = 5;

        Node lca = lca(root, n1, n2);
        System.out.println("Last Common Ancestor for " + n1 + " and " + n2 + " is " + lca.data);
    }


    //Approach 2 -- using recursion

    public static Node lca(Node root, int n1, int n2){
        if(root == null || root.data == n1 || root.data == n2) return root;

        Node leftlca = lca(root.left, n1,n2);
        Node rightlca = lca(root.right, n1,n2);

        if(leftlca == null) return rightlca;
        if(rightlca == null) return leftlca;

        return root;



    }










    //Approach 1 -- using path arrayList
    public static Node  getLCA(Node root, int n1, int n2){
        ArrayList< Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();
        getPath(root, n1, path1);
        getPath(root,n2,path2);

        int i=0;
        while(i < path1.size() && i < path2.size()){
            if(path1.get(i) != path2.get(i)){
                break;
            }
            i++;
        }

        return path1.get(i-1);
    }
    public static boolean getPath(Node root, int node, ArrayList<Node> path){
        if(root == null) return false;

        path.add(root);
        if(root.data == node) return true;
        boolean foundLeft = getPath(root.left, node, path);
        boolean foundRight = getPath(root.right, node, path);
        if(foundLeft || foundRight) return true;
        path.remove(path.size()-1);
        return false;
    }




}
