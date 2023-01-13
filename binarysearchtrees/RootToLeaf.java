

import java.util.ArrayList;

//To print all the paths from root to the leaf;


public class RootToLeaf extends BinarySearchTree {
    public static void main(String[] args) {
        int values[] = {8,5,10,3,6,11,14};
        Node root = null;

        for(int val:values){
            root = insert(root,val);
        }

        ArrayList<Integer> list = new ArrayList<>();

        printAllPaths(root, list);
    }

    public static void printAllPaths(Node root, ArrayList<Integer> path){
        if(root == null) return;
        
        path.add(root.data);
        if(root.right == null && root.left == null){
            System.out.println(path);
            
        }
        printAllPaths(root.left, path);
        printAllPaths(root.right, path);
        path.remove(path.size()-1);


    }



}
