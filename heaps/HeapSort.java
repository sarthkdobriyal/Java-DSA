package heaps;
//heap sort


public class HeapSort {
    public static void main(String[] args) {
        int arr[] = {5,8,4,2,3,6,9,1,7};
        heapsort(arr);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void heapsort(int[] arr){
        //build  max heap
        for(int i = (arr.length/2); i >= 0; i--){
            heapify(arr,i,arr.length);
        }

        //swap(largest(first) with last) and call heapify after removing last
        for(int i = arr.length-1;i>=0;i--){
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr ,0,i);
        }


    }

    public static void heapify(int[] arr, int i, int n){
        int left = 2 * i +1;
        int right = 2 * i +2;
        int maxIdx = i;

        if(left < n && arr[maxIdx] < arr[left]){
            maxIdx = left;
        }
        if(right < n && arr[maxIdx] < arr[right]){
            maxIdx = right;
        }

        if(maxIdx != i){
            int temp = arr[maxIdx];
            arr[maxIdx] = arr[i];
            arr[i] = temp;

            heapify(arr, maxIdx, n);
        }
        
    }



}
