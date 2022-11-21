package Sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = {6,5,4,3,2,1};
        insertion(arr);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }

    public static void insertion(int[] a){

        for(int i=1;i<a.length;i++){
            int curr = a[i];
            int prev = i-1;
            //finding out correct position
            while(prev>=0 && a[prev] > curr ){
                a[prev+1] = a[prev];
                prev--;
            }
            // insertion
            a[prev+1] = curr; 
        }
    }
}
