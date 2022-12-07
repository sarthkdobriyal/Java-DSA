package divideconquer;

public class MergeSortAlgo {
    public static void main(String[] args) {
        int arr[] = {6,-3,-5,9,-2,8,9,4,5,2,3,5,6,8};
        mergeSort(arr, 0, (arr.length-1));
        print(arr);
    }


    //To print the array
    private static void print(int[] arr) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    private static void  mergeSort(int arr[], int si , int ei) {
        //base case (when only single element)
        if(si >= ei){
            return;
        }
        //divide 
        int mid = si + (ei-si)/2;
        //sort left
        mergeSort(arr, si, mid);
        //sort right
        mergeSort(arr, mid+1, ei);
        //merge both sides;
        merge(arr, si,mid,ei); 
    }

    private static void merge(int[] arr, int si , int mid, int ei) {
        //left side iterator
        int i = si;
        //right side iterator
        int j = mid+1;
        //temp arr iterator
        int k = 0;

        //temp array
        int[] temp = new int[ei-si+1];


        //comparing elements
        while(i <= mid && j <= ei){
            if(arr[i] < arr[j]){
                temp[k] = arr[i];
                i++;
            }else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        //if left bigger than right
        while(i <= mid){
            temp[k++] = arr[i++];
        }

        //if right bigger than left
        while(j <= ei){
            temp[k++] = arr[j++];
        }

        //put temp arr back into original array
        for(k=0, i=si;k<temp.length;k++,i++){
            arr[i] = temp[k];
        }
        



    }
}
