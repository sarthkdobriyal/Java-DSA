
//To check if a number is power of 2
public class PowerOf2 {

    public static boolean cheskPower2(int n) {
        return ((n & (n-1)) == 0)?true:false;
    }
    public static void main(String[] args) {
        System.out.println(cheskPower2(126));
    }    
}
