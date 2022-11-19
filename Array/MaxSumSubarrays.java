package Array;

public class MaxSumSubarrays {
    public static void main(String[] args) {
        int[] arr = {-2,-3,4,-1,-2,1,5,-3};

        System.out.println(findSum(arr));
        System.out.println(kadane(arr));
    }

    static int kadane(int arr[]){
        int max = Integer.MIN_VALUE;
        int curr = 0;

        for(int i=0;i<arr.length;i++){
            curr += arr[i];
            if(curr < 0 ){
                curr = 0; 
            }

            if(curr > max){
                max = curr;
            }
        }

        return max;
    }



    static int findSum(int[] arr){
        int start = 0;
        int end = 0;
        int maxSum = Integer.MIN_VALUE;
        int currsum = 0;
        int[] prefix = new int[arr.length];

        //Creating prefix array containing sum upto that idx
        for(int i=0;i<arr.length ;i++){
            if(i == 0){
                prefix[i] = arr[i];
            }else{
                prefix[i] = prefix[i-1] + arr[i];
            }
        }

        //Finding the current subarray sum and comparing it with maxSum
        for(int i=0;i<arr.length;i++){
            start = i;
            for(int j=i;j<arr.length;j++){
                end =j;

                currsum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];  
            
                if(currsum > maxSum){
                    maxSum = currsum;
                }
            }
            
        }
        return maxSum;

    }
}
