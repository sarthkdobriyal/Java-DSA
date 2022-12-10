package backtraking;


// Given a string , find all subsets of the string


public class FindSubsets {
    public static void main(String[] args) {
        String s = "abcd";
        subsets(s, "", 0);
    }

    private static void subsets(String s, String ssf, int i) {
        
        //Base case
        if(i == s.length()) {
            System.out.println(ssf);
            return;
        }

        //Yes choice
        subsets(s, ssf + s.charAt(i) , i+1);        
        //No choice
        subsets(s, ssf , i+1);
    }
}
