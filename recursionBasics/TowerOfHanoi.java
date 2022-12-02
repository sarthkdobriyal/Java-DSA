package recursionBasics;

//1. There are 3 towers. Tower 1 has n disks, where n is a positive number. Tower 2 and 3 are empty.
// 2. The disks are increasingly placed in terms of size such that the smallest disk is on top and largest disk is at bottom.
// 3. You are required to 
//     3.1. Print the instructions to move the disks.
//     3.2. from tower 1 to tower 2 using tower 3 
//     3.3. following the rules
//         3.3.1 move 1 disk at a time.
//         3.3.2 never place a smaller disk under a larger disk.
//         3.3.3 you can only move a disk at the top.

//Sample Input: 3 10 11 12


public class TowerOfHanoi {
    public static void main(String[] args) {
        int n=3;
        towerOfHanoi(n,"S","D","H");
    }

    private static void towerOfHanoi(int n , String src, String dest, String helper){
        if( n== 1){
            System.out.println("Transfer disk " + n + " from " + src + " to " + dest);
            return;
        }
        
        towerOfHanoi(n-1, src, helper, dest);
        System.out.println("Transfer disk " + n + " from " + src + " to " + dest);
        towerOfHanoi(n-1, helper, dest, src);

    }
}
