package Sorting;

public class selectionSort {
    public static void main(String[] args) {
        int arr[] = {6,5,4,3,2,1};
        selection(arr);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }

    public static void selection(int[] arr){
            
        for(int i=0;i<arr.length-1;i++){
            int minpos = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j] < arr[minpos]){
                    minpos = j;
                }
            }
            int temp = arr[minpos];
            arr[minpos] = arr[i];
            arr[i] = temp;
        }

    }
}
