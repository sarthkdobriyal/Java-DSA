import java.util.ArrayList;

public class MergeTwoBST extends BinarySearchTree {
    public static void main(String[] args) {
        Node root1 = new Node(2);
        root1.left = new Node(1);
        root1.right = new Node(4);

        Node root2 = new Node(9);
        root2.left = new Node(3);
        root2.right = new Node(12);

        Node root =  merge(root1, root2);

        inorder(root);
        System.out.println();
        preorder(root);
    }

    private static Node merge(Node root1,Node root2){
        ArrayList<Integer> bst1 = new ArrayList<>();
        getinorder(root1,bst1);

        ArrayList<Integer> bst2 = new ArrayList<>();
        getinorder(root2,bst2);

        // for(int n:bst1){
        //     System.out.print(n+ " ");
        // }
        // System.out.println(" bst1");

        // for(int n:bst2){
        //     System.out.print(n+ " ");
        // }
        // System.out.println(" bst2");

        
        
        
        int i=0;
        int j=0;
        
        ArrayList<Integer> bst = new ArrayList<>();
        while(i < bst1.size() && j <  bst2.size()){
            if(bst1.get(i) <= bst2.get(j)){ 
            
                bst.add(bst1.get(i));
                i++;
            }else{
              
                bst.add(bst2.get(j));
                j++;
            }
        }
        while(i < bst1.size()){
            bst.add(bst1.get(i));
            i++;
        }
        while(j < bst2.size()){
            bst.add(bst2.get(j));
            j++;
        }

        for(int n:bst){
            System.out.print(n+ " ");
        }
        System.out.println(" bst");

        return formTree(bst, 0 , bst.size()-1);
    }

    private static void getinorder(Node root,ArrayList<Integer> bst){
        if(root == null) return;

        getinorder(root.left,bst);
        bst.add(root.data);
        getinorder(root.right,bst);
    }

    private static Node formTree(ArrayList<Integer> bst , int st , int end){
        if(st > end) return null;
        int mid = (st+ end)/2;
        Node root = new Node(bst.get(mid));
        root.left = formTree(bst, st, mid-1);
        root.right = formTree(bst, mid+1, end);
        return root;
        
    }


}
