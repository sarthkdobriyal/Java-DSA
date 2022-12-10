package backtraking;

//Print all the permutations of a given string.

public class Permutations {
    public static void main(String[] args) {
        String s = "abc";
        printPerms(s, "");
    }

    private static void printPerms(String s, String ans) {
        //base case
        if(s.length() == 0){
            System.out.println(ans);
            return;
        }

        //kaam ==> add charAt(i) to ans , remove charAt(i) from string, call for next
        
        for(int i=0;i<s.length();i++){
            printPerms(s.substring(0,i)+s.substring(i+1), ans + s.charAt(i));
        }


    }
}
