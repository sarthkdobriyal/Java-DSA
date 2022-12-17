package linkedlistss;

import linkedlistss.LinkedList.Node;

//Question 2 :Delete N Nodes After M Nodes of a Linked List
// We have a linked list and two integers M and N.Traverse the linked list such that you retain M nodes then delete next N nodes,continue the same till end of the linked list.Difficulty Level:Rookie.
// Sample Input 1: M=2 N=2    LL: 1->2->3->4->5->6->7->8
// Sample Output 1: 1->2->5->6

// Sample Input 2: M=3 N=2    LL: 1->2->3->4->5->6->7->8->9->10
// Sample Output 2: 1->2->3->6->7->8





public class DeleteMnodesAfterN {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        for(int num: arr){
            ll.addLast(num);
        }
        int m = 3;
        int n = 2;

        ll.print();
        deleteNodes(ll.head, m , n );

        ll.print();

    }   

    private static void deleteNodes(Node head,int m, int n ){
        Node headTemp = head;
        while(headTemp != null){
            int i = 0;
        Node temp = headTemp;
        while(i<m-1){
            temp = temp.next;
            i++;
        }
        Node temp2 = temp;
        i=0;
        while(i<n){
            if (temp2.next != null){
                temp2 = temp2.next;
                i++;
            }else{
                temp.next = null;
                return;
            }
        }
        temp.next = temp2.next;
        headTemp = temp2.next;
        }
    }
}
