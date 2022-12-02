package recursionBasics;

//To check whether a given array is sorted or not using recursion
public class arraySorted {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,1};

        System.out.println(isSorted(arr, 0));

    }

    private static boolean isSorted(int[] arr, int i){
        if(i == arr.length-1) return true;
        if(arr[i] < arr[i+1]) {
            return isSorted(arr, i+1);
        }
        return false;
        
    }
}
