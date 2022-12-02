package recursionBasics;


//Q -> Given a string with all smallcase english alphabets. remove the duplicate characters from the string using recursion
public class removeDuplicates {
    public static void main(String[] args) {
        String s = "aappnnna";
        StringBuilder newS = new StringBuilder();
        newS.append(s.charAt(0));

        remove(s,newS,1);
    }

    private static void remove(String s, StringBuilder ssf , int i){
        if(i == s.length() ) {
            System.out.println(ssf.toString());
            return;
        }
        if(s.charAt(i) != ssf.charAt(ssf.length()-1)) ssf.append(s.charAt(i));
         remove(s, ssf, i+1);
    }
}
