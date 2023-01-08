package binarytrees;

import java.util.HashMap;
import java.util.Queue;

import binarytrees.BinaryTrees.BinaryTree;
import binarytrees.BinaryTrees.Node;
import java.util.*;

public class TopViewTree {
    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.createTree(nodes);

        printTopView(root);
    }


    static class Info{
        Node node;
        int hd;

        public Info(Node node, int hd){
            this.node = node;
            this.hd = hd;
        }
    }
    

    public static void printTopView(Node root){
        HashMap<Integer,Node> map = new HashMap<>();
        Queue<Info> q = new LinkedList<>();
        q.add(new Info(root,0));

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;


        while(!q.isEmpty()){
            Info currNode = q.remove();
            if(!map.containsKey(currNode.hd)){
                map.put(currNode.hd,currNode.node);
                if(currNode.hd > max){
                    max = currNode.hd;
                }
                if(currNode.hd < min){
                    min = currNode.hd;
                }
            }
            if(currNode.node.left != null){
                q.add(new Info(currNode.node.left, currNode.hd-1 ));
            }
            if(currNode.node.right != null){
                q.add(new Info(currNode.node.right, currNode.hd+1 ));
            }
        }

        System.out.print("Top VIew: ");
        for(int i=min;i<=max;i++){
            System.out.print(map.get(i).data + " ");
        }


    }


}
