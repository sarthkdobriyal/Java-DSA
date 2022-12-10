package recursionBasics;


//To find the last occurrence of a key in the given array
public class lastOccurrence {
    public static void main(String[] args) {
        int arr[] = {8,2,6,2,5,10,2,5,3};
        int key = 2;
        System.out.println(lastOcc(arr,key,0));
    }

    private static int lastOcc(int[] arr,int key , int i){
        if(i == arr.length) return -1;
        int isFound = lastOcc(arr, key, i+1);
        if(isFound == -1 && arr[i] == key) return i;
        return isFound;
        
    }
}
