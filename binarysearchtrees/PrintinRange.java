
//TO print all nodes in a given range


public class PrintinRange extends BinarySearchTree {
    public static void main(String[] args) {
        int values[] = {8,5,10,3,6,11,1,4,14};
        Node root = null;

        for(int val:values){
            root = insert(root,val);
        }
        int k1 = 5, k2=12;

        printInRange(root,k1,k2);
    }

    public static void printInRange(Node root, int k1, int k2){
        if(root == null) return;
        if(root.data <= k2 && root.data >= k1){
            printInRange(root.left, k1, k2);
            System.out.print(root.data + " ");
            printInRange(root.right, k1, k2);
        }else if(root.data > k2){
            printInRange(root.right, k1, k2);
        }else{
            printInRange(root.left, k1, k2);
        }
    }

}
