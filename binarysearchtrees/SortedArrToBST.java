
//TO generate a balances BST from a sorted array


public class SortedArrToBST extends BinarySearchTree{
    public static void main(String[] args) {
        int arr[] = {3,5,6,8,10,11,12};

        Node root = null;
        
        root = generateTree(arr,0,arr.length-1);

        preorder(root);


    }

    public static Node generateTree(int[] arr, int st, int end){
        if(st > end){
            return null;
        }
        
        int mid = (st + end)/2;
        Node root = new Node(arr[mid]);    
        root.left = generateTree(arr,st,mid-1);
        root.right = generateTree(arr, mid+1, end);
        return root;
        

    }

}