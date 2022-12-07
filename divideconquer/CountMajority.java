package divideconquer;


//Question 2 :Given an array nums of size n, return the majority element. The majority element is the element that appears more than ⌊n/2⌋ times.You may assume that the majority element always exists in the array.
// Sample Input 1: nums = [3,2,3]Sample Output 1: 3
//Sample Input 2: nums = [2,2,1,1,1,2,2]Sample Output 2: 2

// link => https://leetcode.com/problems/majority-element/submissions/855870404/
public class CountMajority {
  public static void main(String[] args) {
    int arr[] = {1,2,3,4,1,2,3,4,1,2,3,2,3,2,3,4,2,33,3,2};
    System.out.println(majEle(arr, 0, arr.length-1));
    System.out.println(majority(arr));
  }  


  //Divide and Conquer algorithm --> for understanding recursion
  private static int majEle(int[] nums, int lo , int hi) {
    
    //base case : if only one element in arr it is majority
    if(lo == hi) return nums[lo];



    //get majority element from the left and majority element from the right
    int mid = lo + (hi-lo)/2;
    int left = majEle(nums, lo, mid);
    int right = majEle(nums, mid+1, hi);

    //if both equal then retun
    if(left == right) return left;

    //otherwise get count of both left and right and whichever more return
    int leftCount = countEle(nums, left, lo , hi);
    int rightCount = countEle(nums, right, lo , hi);
    
    return (leftCount > rightCount)? left:right;

  }

  //Method to count frequency of a givven number
  private static int countEle(int[] nums, int target, int lo , int hi ) {
    int count = 0;
    for(int i=lo;i<hi;i++){
        if(nums[i] == target) count++;
    }
    return count;
  }




  //Easy solution --> Moore's voting algo
  private static int majority(int[] arr) {
    int majorityEle = arr[0];
    int count =1;
    for(int i=1;i<arr.length;i++){
        if(arr[i] != majorityEle){
            count--;
            if(count == 0){
                majorityEle = arr[i];
                count++;
            }
        }else{
            count++;
        }
    }   
    return majorityEle; 
  }
}
