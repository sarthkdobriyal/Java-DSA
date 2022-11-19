package Array;

//There is an integer array nums sorted in ascending order (with distinct values).Prior to being passed to your function, nums is possibly rotated at an unknown pivot  index k (1  <=  k  <  nums.length)  such  that  the  resulting  array  is [nums[k], nums[k+1],   ...,   nums[n-1], nums[0],   nums[1],   ...,   nums[k-1]] (0-indexed).   For   example, [0,1,2,4,5,6,7] might        be        rotated        at        pivot        index 3   and become [4,5,6,7,0,1,2].Given the array nums after the possible rotation and an integer target, returnthe index oftarget if it is in nums, or -1   if it is not in nums.You must write an algorithm with O(log n) runtime complexity.

//Example 1:
// Input: nums = [4,  5, 6, 7, 0, 1, 2], target = 0 
// Output:   4 
// Example 2:
// Input:nums = [4,  5, 6, 7, 0, 1, 2], target = 3 
//      Output: -1
// Example 3: 
// Input:nums = [1], target = 0 Output:   -1

public class ArrayRotation {
    public static void main(String[] args) {
        int nums[] = {4,  5, 6, 7, 0, 1, 2};
        int target = 4;

        int minIdx = getMinIdx(nums);
        int rsh = -1;
        int lsh = -1;
        if(nums[minIdx] <= target && nums[nums.length -1] >= target ){
             rsh = search(nums, target , minIdx, nums.length-1);
        }else{
             lsh = search(nums, target , 0, minIdx-1 );
        }


        if(lsh == -1){
            System.out.println(rsh);
        }else{
            System.out.println(lsh);
        }
        
    }

    static int getMinIdx(int[] nums){
        int l = 0;
        int h = nums.length-1;

        while(l <= h){
            int mid = l + (h-l)/2;
            if(mid > 0 && nums[mid-1] > nums[mid]){
                return mid;
            }
            else if(nums[l] < nums[mid] && nums[mid] > nums[h]){
                l = mid+1;
            }else{
                h = mid-1;
            }
        }
        return -1;
    }

    static int search(int[] nums, int key, int start , int end){
        int l = start; 
        int h = end;

        while(l<=h){
            int mid = l + (h-l)/2;
            if(nums[mid] == key){
                return mid;
            }else if(nums[mid] > key){
                h = mid-1;
            }else{
                l = mid+1;
            }
        }
        
        return -1;
    }
}
