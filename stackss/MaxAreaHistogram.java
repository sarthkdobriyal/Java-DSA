package stackss;

import java.util.Stack;

//Given an array of heights of bars forming a histogram
//Find the max area of the rectangle than can be formed inside the histogram

public class MaxAreaHistogram {
    public static void main(String[] args) {
        int[] heights = {2,1,5,6,2,3};
        System.out.println("Max area of rectangle: " + getMaxArea(heights));
    }   

    public static int getMaxArea(int[] heights){
        int currArea = 0;
        int maxArea = Integer.MIN_VALUE;
        int[] nSR  = getNSR(heights);
        int[] nSL = getNSL(heights);

        System.out.print("NSL: ");
        for(int i=0;i<nSL.length;i++){  
            System.out.print(nSL[i] + " ");
        }   
        System.out.println();

        System.out.print("NSR: ");
        for(int i=0;i<nSL.length;i++){  
            System.out.print(nSR[i] + " ");
        }   
        System.out.println();



        for(int i=0;i<heights.length;i++){
            int width = nSR[i] - nSL[i] -1;
            int height = heights[i];
            currArea = height * width;
            maxArea = Math.max(currArea,maxArea);
             
        }
        return maxArea;
    }

    public static int[] getNSR(int[] arr){
        int[] res = new int[arr.length];
        Stack<Integer> st = new Stack<>();

        res[res.length-1] = res.length;
        st.push(arr.length-1);

        for(int i = arr.length-2;i>=0;i--){
            while(!st.isEmpty() && arr[st.peek()] >= arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                res[i] = arr.length;
            }else{
                res[i] = st.peek();
            }
            st.push(i);
        }
        
        
        return res;
    }
    public static int[] getNSL(int[] arr){
        int[] res = new int[arr.length];
        Stack<Integer> st = new Stack<>();

        res[0] = -1;
        st.push(0);

        for(int i=1;i<arr.length;i++){
            while(!st.isEmpty() && arr[st.peek()] >= arr[i] ){
                st.pop();
            }
            if(st.isEmpty()){
                res[i]= -1;
            }else{
                res[i] = st.peek();
            }
            st.push(i);
        }

        return res;

    }

    




}
