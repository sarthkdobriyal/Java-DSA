package queues;

import java.util.LinkedList;
import java.util.Queue;



//Question: Given a string x = "aabccxb". return the first non repeating character as each character joins to form the string x.
// if no repeating character return -1;
// output -- a -1 b b b b x

public class FirstNonRepeating {
    public static void main(String[] args) {
        String s = "aabccxb";
        getNRC(s);
    }   

    public static void getNRC(String s){
        StringBuilder sb = new StringBuilder("");
        Queue<Character> q = new LinkedList<>();

        int i=0;
        while(i < s.length()){
            char ch = s.charAt(i);
            if(!(sb.toString().contains(ch + ""))){
                q.add(ch);
            }else{
                if(q.contains(ch)){
                    q.remove(ch);
                }
            }
            if(q.isEmpty()){
                System.out.print(-1 + " ");
            }else{
                System.out.print (q.peek() + " ");
            }
            sb.append(ch);
            i++;
        }




    } 


}
