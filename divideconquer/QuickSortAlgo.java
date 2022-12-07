package divideconquer;

public class QuickSortAlgo {
    public static void main(String[] args) {
        int arr[]  = {6,2,-5,-1,0,-2,7,-11,-1,5,4,7,8,9,3,1};
        quickSort(arr, 0, arr.length-1);
        print(arr);

    }

    //To print the array
    private static void print(int arr[]) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    private static void  quickSort(int[] arr, int si, int ei) {
        if(si >= ei) return;   

        //partition;
        int pidx = partition(arr, si, ei);
        //sort the arr left half of the arr before the pivot idx
        quickSort(arr, si, pidx-1);
        //sort the right half after the pivot idx
        quickSort(arr, pidx+1, ei);
    }

    private static int partition(int[] arr, int si, int ei) {
        //choose a pivot(last element)
        int pivot = arr[ei];

        int i = si-1; //for making space for smaller elements

        //moving all the smaller elements than pivot to the left of pivot;
        for(int j=si;j<ei;j++){
            if(arr[j] < pivot){
                i++;
                //swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            } 
        }
        //swap the pivot element to the right place
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;

        return i;
    }

}
