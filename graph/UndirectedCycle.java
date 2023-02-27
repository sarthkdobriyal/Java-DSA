package graph;

import java.util.ArrayList;

public class UndirectedCycle {

    static class Edge {
        int src;
        int dest;

        public Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }

    public static void createGraph(ArrayList<Edge>[] graph) {
        for(int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0,1));
        // graph[0].add(new Edge(0,2));
        graph[0].add(new Edge(0,3));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 2));

        // graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,1));

        graph[3].add(new Edge(3, 0));
        graph[3].add(new Edge(3, 4));
        
        graph[4].add(new Edge(4, 3));
    }



    public static boolean hasCycle(ArrayList<Edge>[] graph) {
        boolean[] visited = new boolean[graph.length];

        for(int i=0;i<graph.length;i++) {
            if(!visited[i]){
                if(detectCycleUtil(graph, i, -1, visited)){
                    return true;
                }

            }
        }
        return false;

    }

    public static boolean detectCycleUtil(ArrayList<Edge>[] graph, int curr, int parent, boolean[] visited){

        visited[curr] = true;
        for(Edge e: graph[curr]){
            if(!visited[e.dest] ){
               if(detectCycleUtil(graph, e.dest, curr, visited))
                return true;
            }
            else if(visited[e.dest] && e.dest != parent) return true;
        }

        return false;

    }


    public static void main(String[] args) {
        int v = 5;
        ArrayList<Edge>[] graph = new ArrayList[v];
        createGraph(graph);
        System.out.println(hasCycle(graph));


    }
}
