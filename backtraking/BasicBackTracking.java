package backtraking;


//Given an array size and empty array
//The function first fills the array with nums 1 to n and then while backtracking subtracts 2 fom each element


public class BasicBackTracking {
    public static void main(String[] args) {
        int n = 5;
        int arr[] = new int[n];
        makeArr(arr, n, 0);
        for(int num: arr){
            System.out.print(num + " ");
        }
    }

    public static void makeArr(int[] arr,int n, int i){
        //base case
        if(i == n) return;

        //kaam
        arr[i] = i+1;
        //call
        makeArr(arr, n, i+1);
        //backtracking step
        arr[i] = arr[i] - 2;

    }


}
