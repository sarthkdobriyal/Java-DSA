package Array;

public class binarySearch {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10};
        int key = 1;

        int idx = binSearch(arr, key);
        if(idx != -1){
            System.out.println("Found at " + idx);
        }else{
            System.out.println("NOT found");
        }
    }    

    static int  binSearch(int[] arr, int key){
        
        int l = 0;
        int h = arr.length - 1 ;

        while(l<=h){
            int mid = l + (h-l)/2;

            if(arr[mid] < key){
                l = mid+1;
            }
            else if(arr[mid] > key){
                h = mid-1;
            }
            else{
                return mid;
            }
        }


        return -1;
    }
}
