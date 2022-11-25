import java.util.Scanner;

public class IsPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to check if Palindrome: ");
        String s = sc.nextLine();

        System.out.println(isPalindrome(s));
        sc.close();
    }

    public static boolean isPalindrome(String s){
        int start = 0;
        int last = s.length()-1;

        while(start < last){
            if(s.charAt(start) != s.charAt(last)){
                return false;
            }
            start++;
            last--;
        }
        return true;
    }



}
