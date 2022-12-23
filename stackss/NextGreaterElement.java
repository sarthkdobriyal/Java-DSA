package stackss;

import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {
        int arr[] = {6,8,0,1,3};

        int[] nge = getNge(arr);

        for(int i=0;i<nge.length;i++){
            System.out.print(nge[i] + " ");
        }
    }

    public static int[] getNge(int[] arr){
        int[] nge = new int[arr.length];
        Stack<Integer> st = new Stack<>();

        st.push(arr[arr.length-1]);
        nge[nge.length-1] = -1;
        st.push(nge[nge.length-1]);

        for(int i= arr.length-2;i>=0;i--){
            while(!st.isEmpty() && st.peek() < arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                nge[i] = -1;
            }else{
                nge[i] = st.peek();
            }
            st.push(arr[i]);
        }


        return nge;
    }
}
