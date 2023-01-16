package heaps;

import java.util.PriorityQueue;

//Given n points representing location of cars on a 2D plane.
//find k cars nearest to the origin;



public class NearbyCars {

    public static class Pair implements Comparable<Pair>{
        int dist;
        int idx;
    
        public Pair(int dist, int idx){
            this.dist = dist;
            this.idx = idx;
        }

        @Override
        public int compareTo(Pair o) {
            return this.dist - o.dist;
        }
    }
    
    public static void main(String[] args) {
        int location[][] = {{3,3}, {5,-1}, {-2,4}};
        int k = 2;
        printKLocations(location, k);
    }

    public static void printKLocations(int[][] loc, int k){
        PriorityQueue<Pair> pq = new PriorityQueue<>();

        for(int i=0;i<loc.length;i++){
            int x = loc[i][0];
            int y = loc[i][1];
            int dist = (int) Math.sqrt(((x*x) + (y*y)));
            pq.add(new Pair(dist,i));
        }

        for(int i=0;i<k;i++){
            int dist = pq.peek().dist;
            int idx = pq.peek().idx;
            pq.remove();
            System.out.println((i+1) + " nearest car -> C" +idx + " with dist ->  " + dist*dist );
        }

    }


}
