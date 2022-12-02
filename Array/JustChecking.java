package Array;

public class JustChecking {
    public static void main(String[] args) {
        System.out.println(countDigits(2344));
    }
    public static int countDigits(int n){
        int count = 0;
        int temp = n;
        while(temp > 0){
            n /= 10;
            ++count;
        }
        return count;
    }
}
