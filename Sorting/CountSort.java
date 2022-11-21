package Sorting;

public class CountSort {
    public static void main(String[] args) {
        int arr[] = {1,4,1,3,2,4,3,7};
        count(arr);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }

    public static void count(int[] a){
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            if(a[i] > largest){
                largest = a[i];
            }
        }

        int[] freq = new int[largest+1];

        for(int i=0;i<a.length;i++){
            freq[a[i]]++;
        }

        ;
        int j=0;
        for(int i=0;i<freq.length;i++){
            while(freq[i] > 0){ 
                a[j] = i;
                freq[i]--;
                j++;
            }
        }



    }
}
