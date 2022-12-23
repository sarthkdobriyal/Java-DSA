package stackss;


//Given an array of stock prices on ith day
// Find the span of each day
//span = number of days before current day where stock price was lower than today's price

import java.util.Stack;

public class StockSpan {
    public static void main(String[] args) {
        int stocks[] = {100,80,60,70,60,85,100};
        int span[] = new int[stocks.length];
        getSpan(stocks, span);

        for(int num:span){
            System.out.print(num + " ");
        }
    }

    private static void getSpan(int[] stocks, int[] span){
        Stack<Integer> st =new Stack<>();
        span[0] = 1;
        st.push(0);
        for(int i = 1;i<stocks.length ;i++){
            while(!st.isEmpty() && stocks[st.peek()] <= stocks[i]){
                st.pop();
            }
            if(!st.isEmpty()){
                span[i] = i - st.peek();
            }else{
                span[i] = i+1;       
            }
            st.push(i);
        }

    }


}
