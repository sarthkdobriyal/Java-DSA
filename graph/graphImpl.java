package graph;

import java.util.*;

public class graphImpl {

    static class Edge {
        int src;
        int dest;
        int weight;

        public Edge(int src, int dest, int weight) {
            this.src = src;
            this.dest = dest;
            this.weight = weight;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        // adding edges to the adjacency list

        graph[0].add(new Edge(0, 1, 1));
        graph[0].add(new Edge(0, 2, 1));

        graph[1].add(new Edge(1, 0, 1));
        graph[1].add(new Edge(1, 3, 1));

        graph[2].add(new Edge(2, 0, 1));
        graph[2].add(new Edge(2, 4, 1));

        graph[3].add(new Edge(3, 1, 1));
        graph[3].add(new Edge(3, 4, 1));
        graph[3].add(new Edge(3, 5, 1));

        graph[4].add(new Edge(4, 2, 1));
        graph[4].add(new Edge(4, 3, 1));
        graph[4].add(new Edge(4, 5, 1));

        graph[5].add(new Edge(5, 3, 1));
        graph[5].add(new Edge(5, 4, 1));
        graph[5].add(new Edge(5, 6, 1));

        graph[6].add(new Edge(6, 5, 1));

    }

    // Breadth First Search -->< O(v+e)
    public static void bfs(ArrayList<Edge> graph[]) {
        boolean[] visited = new boolean[graph.length];
        Queue<Integer> q = new LinkedList<>();

        q.add(0);

        while (!q.isEmpty()) {
            int curr = q.remove();

            if (!visited[curr]) {
                visited[curr] = true;
                System.out.print(curr + " ");
                for (Edge e : graph[curr]) {
                    q.add(e.dest);
                }
            }

        }

    }



    //Depth First Search (recursively) --> O(V + E)
    public static void dfs(ArrayList<Edge> graph[], boolean[] visited, int src ) {


        visited[src] = true;
        System.out.print(src + " ");
        for(Edge e : graph[src]){
            if(!visited[e.dest]){
                dfs(graph, visited, e.dest);
            }
        }
    }
       

    //Has path

    public static boolean hasPath(ArrayList<Edge> graph[],boolean[] vis, int src, int dest) {
        if(src == dest) return true;

        vis[src]  = true;
        for(Edge e : graph[src]){
            if(!vis[e.dest]){
                boolean hasPath = hasPath(graph, vis, e.dest, dest);
                if(hasPath) return true;
            }
        }
        
        return false;
    }




    public static void main(String[] args) {

        // number of vertices
        int v = 7;

        // creating a graph
        // 1. create an array of arraylist<Edge>
        ArrayList<Edge> graph[] = new ArrayList[v];
        createGraph(graph);
        bfs(graph);
        System.out.println();
        dfs(graph,new boolean[graph.length], 0);
        System.out.println();
        System.out.println(hasPath(graph,new boolean[graph.length], 2, 5));

        // printing all the neighbours of a vertex
        // for(int i=0;i<graph[2].size();i++) {
        // Edge e = graph[2].get(i);
        // System.out.println(e.src + " " + e.dest + " " + e.weight);
        // }

    }
}
