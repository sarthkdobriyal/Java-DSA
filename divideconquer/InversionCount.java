package divideconquer;


//Question 3 :Given an array of integers. Find theInversion Countin the array. 
// Inversion Count:For an array,inversion count indicates how far(orclose) the array is from being sorted.If the array is  already sorted then the inversion count is 0. If an array is sorted in the reverse order then the inversion count is the maximum.Formally, two elements a[i] and a[j] form an inversion if a[i] > a[j] and i < j.
// Sample Input 1: N = 5, arr[ ] = {2, 4, 1, 3, 5}
// Sample Output 1: 3, because it has 3 inversions -(2, 1), (4, 1), (4, 3).

// Sample Input 2: N = 5, arr[ ] = {2, 3, 4, 5, 6}
// Sample Output 2: 0, because the array is already sorted

// Sample Input 3: N = 3, arr[] = {5, 5, 5}
// Sample Output 3: 0, because all the elements of the array are the same & already in a sorted manner.

// (Hint: A sorting algorithm will be used to solvethis question.)
// Note-This question is important. Even if you are not able to come up with the approach,please understand the solution



public class InversionCount {
    public static void main(String[] args) {
        int arr[] = {4,3,2,1,5};
        System.out.println(invCount(arr,0, arr.length-1));   
        System.out.println(inversionCnt(arr));     
    }

    //brute Force technique ==>  O(n²)
    private static int inversionCnt(int[] arr) {
        int invCount = 0;
        for(int i=0;i<arr.length-1;i++){
            for(int j = i+1;j<arr.length;j++){
                if(arr[j] < arr[i]) invCount++;
            }
        }
        return invCount;
    }


    //Divide & Conquer Technique ==> O(nlogn)
// Algorithm:
// ● Split the given input array into two halves, left and right similar to merge sort recursively.   
// ● Count the number of inversions in the left half and right half along with the inversions found during the merging of the two halves.
// ●  Stop the recursion, only when 1 element is left in both halves.
// ● To count the number of inversions,we will use a two pointers approach. Let us consider two pointers i and j,one pointing to the left half and the other pointing towards the right half.
// ● While iterating through both the halves, if the current element A[i] is less than A[j], add it to the sorted list, else increment the count by mid – i

private static int invCount(int arr[] , int si, int ei) {
    int count = 0;
    if(ei > si){
        int mid = si+ (ei-si)/2;
   count = invCount(arr, si, mid);
   count += invCount(arr, mid+1, ei);
   count += merge(arr, si, mid+1, ei);
}
return count;
}

private static int merge(int[] arr, int si , int mid, int ei ) {
    int invCount = 0;
    int i = si;
    int j = mid;
    int k =0 ;
    int temp[] = new int[ei-si+1];

    while(i<mid && j<=ei){
        if(arr[i] <= arr[j]){
            temp[k++] = arr[i++];
        }else{
            temp[k++] = arr[j++];
            invCount += (mid-i);
        }
        
    }


    while(i<mid){
        temp[k++] = arr[i++];
    }
    while(j<=ei){
        temp[k++] = arr[j++];
    }


    for(i=si,k=0;i<=ei;i++,k++){
        arr[i] = temp[k];
    }

    return invCount;
    
    
}

}