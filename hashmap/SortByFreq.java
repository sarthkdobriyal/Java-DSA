package hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

//Sort by Frequency
// Given a string ,sort it in decreasing order based on the frequency of the characters.The frequency of a character is the number of times it appears in the string.Return the sorted string. If there are multiple answers, return any of them.
// Sample Input 1: s = "cccaaa"
// Sample Output 1: "aaaccc "Both 'c' and 'a' appear three times, so both "cccaaa" and "aaaccc" are valid answers.
// Note that "cacaca" is incorrect, as the same characters must be together.
// Sample Input 2: s = "tree"
// Sample Output 2:"eert"   'e' appears twice while 'r' and 't' both appear once.
// So 'e' must appear before both 'r' and 't'. Therefore "eetr" is also a valid answer.




public class SortByFreq {
    public static void main(String[] args) {
        String s = "treerrrrrr";

        HashMap<Character, Integer> fmap = new HashMap<Character, Integer>();

        for(int i=0;i<s.length();i++){
            fmap.put(s.charAt(i) , fmap.getOrDefault(s.charAt(i),0) + 1);
        }

        PriorityQueue<Map.Entry<Character, Integer>> pq = new PriorityQueue<>((a,b)->a.getValue()==b.getValue() ? a.getKey()-b.getKey():b.getValue()-a.getValue());

        for(Map.Entry<Character,Integer> val: fmap.entrySet()){
            pq.add(val);
        }

        StringBuilder sb = new StringBuilder();
        while(!pq.isEmpty()){
            char ch = pq.poll().getKey();
            int val = fmap.get(ch);
            while(val != 0){
                sb.append(ch);
                val--;
            }
        }

        System.out.println(sb.toString());

    }
}
