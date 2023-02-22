package hashmap;

import java.util.HashSet;

public class UnionAndIntersection {
    public static void main(String[] args) {
        int arr1[] = {6,3,5,3,5,9};
        int arr2[] = {7,3,9};

        findUnion(arr1, arr2);
        findIntersection(arr1, arr2);
    }

    public static void findUnion(int arr1[], int arr2[]) {
        HashSet<Integer> union = new HashSet<Integer>();
        for(int val: arr1){
            union.add(val);
        }
        for(int val: arr2){
            union.add(val);
        }

        System.out.println("Union: ");
        for(int val: union){
            System.out.print(val + ",");
        }
        System.out.println();
    }

    public static void findIntersection(int arr1[], int arr2[]) {
        HashSet<Integer> arr = new HashSet<Integer>();

        for(int val: arr1){
            arr.add(val);
        }

        System.out.println("Intersection: ");
        for(int val: arr2){
            if(arr.contains(val)){
                System.out.print(val+ ",");
            }
        }
        System.out.println();
        
    }

}
