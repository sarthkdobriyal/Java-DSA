package hashmap;

import java.util.*;

public class ValidAnagram {
    public static void main(String[] args) {
        String s = "race";
        String t = "arce";
        System.out.println(isAnagram(s,t));
    }

    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        HashMap<Character, Integer> fmap = new HashMap<Character, Integer>();

        for(int i =0 ;i< s.length() ;i++){
            fmap.put(s.charAt(i) , fmap.getOrDefault(s.charAt(i), 0)+1);
        }

        for(int i=0;i<t.length();i++){
            if(fmap.containsKey(t.charAt(i))){
                fmap.put(t.charAt(i), fmap.get(t.charAt(i)) - 1);
            }else{
                return false;
            }
        }

        Set<Character> keySet = fmap.keySet();
        for(Character key : keySet){
            if(fmap.get(key) != 0){
                return false;
            }
        }
        return true;

    }
}