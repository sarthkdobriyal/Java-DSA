package recursionBasics;


//Question 4:We are given a string S,we need to find the count of all contiguous substrings starting and ending with the same character.

// Sample Input 1: S = "abcab" 
// Sample Output 1: 7
// There are 15 substrings of "abcab" : a, ab, abc, abca, abcab, b, bc, bca, bcab, c, ca, cab, a, ab, b Out of the above substrings, there are 7 substrings: a , abca , b , bcab ,c,a and b. So , only 7 contiguous substrings start and end with the same character.


//Sample Input 2: S = "aba"
// Sample Output 2: 4 
//  The substrings are a, b, a and aba



public class ContiguogSubstring {
    public static void main(String[] args) {
        String s = "abcab";
        int n = s.length();
        System.out.println(countSubstring(s, 0, n-1, n));
    }

    private static int countSubstring(String s, int i, int j , int n) {
        if(n == 1) return 1;
        if(n <= 0) return 0;


        int res = countSubstring(s, i+1, j, n-1) +
                   countSubstring(s, i, j-1, n-1) -
                countSubstring(s, i+1, j-1, n-2) ;

        if(s.charAt(i) == s.charAt(j)) res++;

        return res;
    }

}
