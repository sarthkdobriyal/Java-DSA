import java.util.*;

public class ActivitySelection {

    // Q=> Given n activities with start time and end time. Select Max activities a person performs assuming that a person can only work on a single activity at a time. Activites are sorted to end time.
    

    public static void main(String[] args) {
        int start[] = {1,3,0,5,8,5};    
        int end[] = {2,4,6,7,9,9};  
        
        int count = getMaxActvity(start, end);

        System.out.println(count);
    }   


    public static int getMaxActvity(int[] start, int end[]){ 
        //sort on basis of end time
        int[][] activities = new int[start.length][3];

        for(int i=0;i<start.length;i++){
            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }

        //Lambda Function
        Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));
        
        int count = 1;
        int lastEndTime = activities[0][2];

        for(int i = 1;i< activities.length;i++){
            if(activities[i][1] > lastEndTime){
                count++;
                lastEndTime = activities[i][2];
            }
        }
        return count;

    }

}
