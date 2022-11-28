public class FastExponentiation {

    //To get n raised to power of 'a' in  O(logn) TC --> 
    public static int  fe(int n , int a) {
        int ans =1 ;
        if((n & 1) != 0){
            ans *= a;
        }
        a = a*a;
        n = n>>1;
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(fe(5,3));
    }
}
