package recursionBasics;

//To find the first ocurrence of an element in an array
public class firstOccurrence {
    public static void main(String[] args) {
        int arr[] = {8,3,6,9,5,10,2,5,7};
        int key = 7;
        System.out.println(firstOcc(arr, key , 0));
    }

    private static int firstOcc(int[] arr, int key, int i ){
        if(i == arr.length) return -1;
        if(arr[i] == key) return i;
        return firstOcc(arr, key, i+1);
        
    }
}
