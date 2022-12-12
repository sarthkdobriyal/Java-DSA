package arraylist;

import java.util.ArrayList;

//For given n lines on x-axis use 2 lines to form a container such that it holds most water
public class WithMostWater {
    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);


        //Brute Force Technique
        // int maxWater = Integer.MIN_VALUE;

        // for(int i=0;i<height.size()-1;i++){
        //     for(int j=i+1;j<height.size();j++){
        //         int water = Math.min(height.get(i),height.get(j)) * (j-i);
        //         if(water > maxWater){
        //             maxWater = water;
        //         }
        //     }
        // }

        System.out.println("Maximun Water stored is: "  + storeWater(height));
    }


    //2 pointer approach - O(n)
    private static int storeWater(ArrayList<Integer> height) {
        int maxWater = Integer.MIN_VALUE;
        int lp = 0;
        int rp = height.size()-1;

        while(lp < rp){
            int ht = Math.min(height.get(rp), height.get(lp));
            int width = rp - lp;
            int water = ht * width;
            if(water > maxWater){
                maxWater = water;
            }

            if(height.get(lp) > height.get(rp)){
                rp--;
            }else{
                lp++;
            }
        }
        return maxWater;
    }


}
