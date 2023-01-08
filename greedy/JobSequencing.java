import java.util.*;


//Given jobs with deadline and profit if job is finished before deadline
//All jobs take 1 unit of time
//Maximize profit if only one job can be scheduled at a time


public class JobSequencing {
    public static void main(String[] args) {
        int deadline[] = {4,1,1,1};
        int profits[] = {20,10,40,30};

        int profit = getMaxProfit(deadline, profits);

        System.out.println("Max Profit is " + profit);

    }

    public static int getMaxProfit(int[] deadlines,int[] profits){
        int[][] jobs = new int[deadlines.length][3];
        
        ArrayList<Integer> seq = new ArrayList<>();

        for(int i=0;i<deadlines.length;i++){
            jobs[i][0] = i;
            jobs[i][1] = deadlines[i];
            jobs[i][2] = profits[i];
        }

        Arrays.sort(jobs, Comparator.comparingDouble(o -> o[2]));

        for(int k=0;k<jobs.length;k++){
            System.out.print(jobs[k][0] + " ");
        }
        System.out.println();

        int i=jobs.length -1;;
        int time = 0;
        int profit = 0;
        while(i >= 0){
            if(jobs[i][1] > time){
                profit += jobs[i][2];
                seq.add(jobs[i][0]);
            }
            time++;
            i--;
        }

        for(int j=0;j<seq.size();j++){
            System.out.print(((char)('A' + seq.get(j))) + " -> ");
        }
        System.out.println("end");


        return profit;

    }
}
