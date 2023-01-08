package binarytrees;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTrees {

public static class Node{
    int data;
    Node left;
    Node right;
    public Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}


static class BinaryTree{

    //TO create a tree using preorder
    static int idx = -1;
    public Node createTree(int[] nodes){
        idx++;
        if(nodes[idx] == -1) return null;

        Node newNode = new Node(nodes[idx]);
        newNode.left = createTree(nodes);
        newNode.right = createTree(nodes);
        return newNode;

    }

    //Preorder Traversal
    public void preorder(Node root){
        if(root == null){
            // System.out.print(-1 + " ");
            return;
        }

        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    //postorder traversal
    public void postorder(Node root){
        if(root  == null){
            // System.out.print(-1 + " ");
            return;
        }

        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    //inorder traversal
    public void inorder(Node root){
        if(root == null){
            // System.out.print(-1 + " ");
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);

    }


    //Level Order Traversal
    public void levelOrder(Node root){
        if(root == null) return;
        Queue<Node> q = new LinkedList<>();

        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            Node currNode = q.remove();
            if(currNode == null){
                System.out.println();
                if(q.isEmpty()) break;
                else q.add(null);
            }else{
                System.out.print( currNode.data + " ");
                if(currNode.left != null)
                q.add(currNode.left);
                if(currNode.right != null)
                q.add(currNode.right);
            }
            
        }
     }


     //Height of a tree
     public int height(Node root){
        if(root == null){
            return 0;
        }
        int height = (Math.max(height(root.left), height(root.right))) + 1;
        return height;
     }

     //GIve Number of NOdes in a binary tree
     public int nodesCount(Node root){
        if(root == null){
            return 0;
        }
        return nodesCount(root.left) +  nodesCount(root.right) + 1;
     }


     //Sum Of nodes
     public int nodesSum(Node root){
        if(root == null){
            return 0;
        }
        return nodesSum(root.left)+ nodesSum(root.right) + root.data;
     }


     //Diameter of tree(Approach 1)
     public int diameterOne(Node root){
        if(root  == null) return 0;
        int ld = diameterOne(root.left);
        int lht = height(root);
        int rd = diameterOne(root.right);
        int rht = height(root.right);

        return Math.max(lht+rht+1,Math.max(rd, ld));

     }

     //Diameter of a tree (Approach 2)
     static class Info{
        int diameter;
        int height;

        public Info(int diameter, int height){
            this.diameter = diameter;
            this.height= height;
        }
     }

     public Info diameterTwo(Node root){
        if(root == null) return new Info(0,0);
        Info linfo = diameterTwo(root.left);
        Info rinfo = diameterTwo(root.right);
        int dia = Math.max((linfo.height+rinfo.height+1),Math.max(linfo.diameter,rinfo.diameter));
        int ht = (Math.max(linfo.height,rinfo.height))+1;
        return new Info(dia,ht);
     }


}


    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.createTree(nodes);
        // System.out.println(root.data);
        tree.preorder(root);
        System.out.println();
        tree.postorder(root);
        System.out.println();
        tree.inorder(root);
        System.out.println();
        tree.levelOrder(root);
        System.out.println();

        System.out.println("Height: " + tree.height(root) );
        System.out.println("Nodes Count: " + tree.nodesCount(root));
        System.out.println("Sum of all nodes: " + tree.nodesSum(root) );
        System.out.println("Diameter of the tree : " + tree.diameterTwo(root).diameter);

    }
}
