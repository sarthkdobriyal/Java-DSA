package recursionBasics;

//Question 2 :You are given a number (eg -  2019), convert it into a String of english like“two zero one nine”.  Use a recursive function to solve this problem.NOTE- The digits of the number will only be in the range 0-9 and the last digit of a number can’t be 0.
//Sample Input: 1947
//Sample Output: “one nine four seven”



public class NumToEnglish {
    
    static String arr[] = {"zero", "one" , "two" , "three", "four" , "five" , "six", "seven" , "eight" , "nine"};
    
    public static void main(String[] args) {
        int n = 1947784654;
        
        printEnglish(n);
    }

    private static void printEnglish(int n) {
        if(n == 0) return;
        printEnglish(n/10);
        System.out.print(arr[n%10] + " ");
    }
}
