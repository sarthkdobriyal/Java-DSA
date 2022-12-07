package divideconquer;

public class SearchinRotatedSorted {
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,8,0,1,2,3};
        int tar = 44;
        System.out.println(search(arr,tar,0,arr.length-1));
    }

    private static int search(int[] arr,int tar, int si, int ei) {
        if(si > ei){
            return -1;
        }
        
        //calculate mid
        int mid = si + (ei-si)/2;

        //if tar found
        if(arr[mid] == tar) return mid;

        //mid on L1
        if(arr[si] <= arr[mid]){
            //case a: search in left of l1
            if(arr[si] <= tar && tar <= arr[mid]){
                return search(arr, tar, si, mid-1);
            }
            //case b: search in right of mid element
            else{
                return search(arr, tar, mid+1, ei);
            }
        }
        
        //mid on l2
        else{
            //case c: search in right of l2
            if(arr[mid] <= tar && tar <= arr[ei]){
                return search(arr, tar, mid+1, ei);
            }
            //case d: search in left of l2
            else{
                return search(arr, tar, si, mid-1);
            }
        }
    }
}
