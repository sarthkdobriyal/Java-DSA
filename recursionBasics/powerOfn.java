package recursionBasics;


//To find x raised to power n using recursion
public class powerOfn {
    public static void main(String[] args) {
        int x = 2;
        int n = 5;
        System.out.println(powOp(x,n));
        System.out.println(pow(x,n));
    }

    //Basic function where TC ==> O(n);
    private static int pow(int x , int n){
        if(n == 0 ) return 1;
        return x * pow(x, n-1 );
    }

    //Optimized function with TC == O(logn)
    private static int powOp(int x, int n){
        if(n == 1) return x;
        
        int halfPower =  powOp(x,n/2) ;
        if(n %2 != 0) return x * halfPower * halfPower;
        return halfPower*halfPower;
    }
}
