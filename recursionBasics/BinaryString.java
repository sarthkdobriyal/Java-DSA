package recursionBasics;

public class BinaryString {
    public static void main(String[] args) {
        int n  =10;
        binary("", n, 0);
    }

    private static void binary(String sb , int n , int lastPlace) {
        if(n == 0){
            System.out.println(sb);
            return;
        }
        binary(sb+"0", n-1,0);
        if(lastPlace == 0){
            binary(sb+"1", n-1,1);
        }


        
    }
}
