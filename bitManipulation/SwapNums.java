public class SwapNums {
    public static void main(String[] args) {
        int a = 7;
        int b = 10;

        //Swapping
        a = a^b;
        b = a^b;
        a = a^b;

        System.out.println(a);
        System.out.println(b);
    }
}
