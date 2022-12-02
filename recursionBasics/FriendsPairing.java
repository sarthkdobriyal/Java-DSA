package recursionBasics;


//Q! --> Given n friends , they can stand either single or paired with someone. Find the number of ways the friends can stand
public class FriendsPairing {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(pairing(n));
    }

     private static int pairing(int n) {
        if(n ==1 || n == 2) return n;
        
        // (n-1) multiplied because each friend has n-1 choice when pairing as to with whom to pair
        return pairing(n-1) + ((n-1) * pairing(n-2));
        
    }
}
