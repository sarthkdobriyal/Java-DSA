

public class BinarySearchTree {

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


    public static Node insert(Node root, int data){
        Node newNode = new Node(data);
        if(root == null){
            root = newNode;
            return root;
        }
        if(data < root.data){
            //left subtree
            root.left = insert(root.left,data);
        }else{
            //right subtree
            root.right = insert(root.right,data);
        }

        return root;
    }

    //To print inorder traversal of bst
    public static void inorder(Node root){
        if(root == null ){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+ " ");
        inorder(root.right);
    }

    //to print preorder of a bst
    public static void preorder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }


    //To delete a node
    public static Node delete(Node root, int val){
        if(val < root.data){
            root.left = delete(root.left, val);
        }else if(val > root.data){
            root.right = delete(root.right, val);
        }else{
            //case 1 - leaf node
            if(root.left == null && root.right == null){
                return null;
            }

            //case 2 -- one child
            if(root.left == null){
                return root.right;
            }
            if(root.right == null){
                return root.left;
            }

            //case 3 - two children
            Node IS = getInorderSuccer(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);


        }

        return root;
    }

    //to find inorder successor
    public static Node getInorderSuccer(Node root){
        if(root.left != null){
            root = root.left;
        }
        return root;
    }



    public static void main(String[] args) {
        int values[] = {8,5,10,3,6,11,1,4,14};
        Node root = null;

        for(int val:values){
            root = insert(root,val);
        }

        inorder(root);
        System.out.println();

        root = delete(root, 1);

        inorder(root);





    }
}
