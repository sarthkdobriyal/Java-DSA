package recursionBasics;


//Print n number from 1 to n in incresing order using recursion
public class printIncreasing {
    public static void main(String[] args) {
        int n= 50;
        print(n);
    }

    private static void print(int n){
        if(n == 1){
            System.out.print(1 + " ");
            return;
        }
        print(n-1);
        System.out.print(n + " ");
    }
}
