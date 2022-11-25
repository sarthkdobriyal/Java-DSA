import java.util.Arrays;

// Determine if 2 Strings are anagrams of each other.
// What are anagrams?If two strings contain the same characters but in a different order,they can be said to be anagrams.Consider race and care.In this case,race's characters can be formed into a study,or care's characters can be formed into race


public class CheckAnagram {
    public static void main(String[] args) {
        String s1 = "race";
        String s2 = "care";

        System.out.println(isAnagram2(s1,s2));
    }

    
    //Two method
    public static boolean isAnagram2(String s1, String s2){

        if(s1.length() != s2.length()) return false;

        //convert to lowercase
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        //convert to charArray
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();

        //sort the arrays
        Arrays.sort(c1);
        Arrays.sort(c2);

        //if arrays equal = anagram
        if(Arrays.equals(c1, c2)) return true;

        return false;

    }


    //One method :
    public static boolean isAnagram1(String s1, String s2){

        if(s1.length() != s2.length()) return false;

        boolean isAnagram = true;

        for(int i=0;i<s1.length();i++){
            char c1 = s1.charAt(i);
            if(!s2.contains(c1 + "")){
                isAnagram = false;
            }
        }

        return isAnagram;
    }
}
