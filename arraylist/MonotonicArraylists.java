package arraylist;

import java.util.ArrayList;

//Question 1 : Monotonic ArrayList(EASY)
// An Arraylist is monotonic if it is either monotone increasing or monotone decreasing.An Arraylist nums is monotone increasing if for all i<=j ,nums.get(i)<=nums.get(j). An Arraylist nums is monotone decreasing if for all i <= j, nums.get(i) >= nums.get(j).Given an integer Arraylist nums, return true if the given list is monotonic, or false otherwise.


//Sample Input 1: nums = [1,2,2,3]
//Sample Output 1: true

//Sample Input 2: nums = [6,5,4,4]
//Sample Output 2: true

//Sample Input 3: nums = [1,3,2]
//Sample Output 3: false

//Constraints:
//●1 <= nums.size() <= 105
//●-105 <= nums.get(i) <= 105



public class MonotonicArraylists {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        int arr[] = {6,5,4,4,9};

        for(int i=0;i<arr.length;i++){
            nums.add(arr[i]);
        }
        if(isMonotonic(nums)){
            System.out.println("ArrayList is Monotonic");
        }else{
            System.out.println("ArrayList is not monotonic");
        }

    }


    private static boolean isMonotonic(ArrayList<Integer> nums) {
        if(nums.get(0) < nums.get(1)){
            for(int i=1;i<nums.size()-1;i++){
                if(nums.get(i) > nums.get(i+1))
                return false;
            }
        }else{
            for(int i=1;i<nums.size()-1;i++){
                if(nums.get(i) < nums.get(i+1))
                return false;
            }
        }
        return true;
    }






}
