//Q: aaabbcccdd ==> a3b2c3d2
//Q: abc ==> abc (cause a1b1c1 is longer than abc)


public class StringCompression {
    public static void main(String[] args) {
        String str = "aaabbcccdd";
        System.out.println(compressString(str));
    }

    public static String compressString(String s){
        String ans = "";

        for(int i=0;i<s.length();i++){
            Integer count = 1;
            while(i < s.length()-1 && s.charAt(i ) == s.charAt(i+1)){
                count++;
                i++;
            }

            ans += s.charAt(i);

            if(count > 1){
                ans += count.toString();
            }


        }

        return ans;
    }
}
