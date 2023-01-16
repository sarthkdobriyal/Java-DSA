package heaps;

//Given an mxn binary matrix with 1 -> soldier and 0 > civilian
// find k weakest rows
//a row is weaker than another if it has less soldiers or if soldiers are equal then row index is less


import java.util.PriorityQueue;

public class WeakestSoldier {

    public static class Row implements Comparable<Row>{
        int soldiers;
        int rowIdx;

        public Row(int soldiers, int rowIdx){
            this.soldiers =soldiers;
            this.rowIdx = rowIdx;
        }

        @Override
        public int compareTo(Row o) {
            if(this.soldiers == o.soldiers){
                return this.rowIdx - o.rowIdx;
            }else{
                return this.soldiers - o.soldiers;
            }
        }
    }
    public static void main(String[] args) {
        int binMat[][] = {
            {1,0,0,0},
            {1,1,1,1},
            {1,0,0,0},
            {1,0,0,0}
        };
        int k = 2;

        printWeakestRow(binMat, k);
    }

    public static void printWeakestRow(int[][] mat, int k){
        PriorityQueue<Row> pq = new PriorityQueue<>();

        for(int i=0;i<mat.length;i++){
            int currSoldiers = 0;
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j] == 1){
                    currSoldiers++;
                }
            }
            pq.add(new Row(currSoldiers, i));
        }

        for(int i=0;i<k;i++){
            Row row = pq.remove();
            System.out.println("row" + row.rowIdx);
        }

    }


}
