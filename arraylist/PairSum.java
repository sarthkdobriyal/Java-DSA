package arraylist;

import java.util.ArrayList;

//Given a sorted list of numbers. FInd if a pair exists whose sum is equal to the target sum.

public class PairSum {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<=25;i++){
            list.add(i);
        }
        System.out.println("List = " + list);
        int targetSum = 37;

        ArrayList<Integer> res =  findPair(list, targetSum);
        if(res.isEmpty()){
            System.out.println("Pair does not exists");
        }else{
            System.out.println("Pair exists at: " + res);
        }


    }


    private static ArrayList<Integer> findPair(ArrayList<Integer> list, int target) {
        ArrayList<Integer> res = new ArrayList<>();
        int i =0;
        int j = list.size()-1;

        while(i <j){
            int sum = list.get(i) + list.get(j);
            if(sum == target){
                res.add(i);
                res.add(j);
                return res;
            }else if(sum > target){
                j--;
            }else{
                i++;
            }
        }
        return res;
    }







}
