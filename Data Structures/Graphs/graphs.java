import java.util.*;

public class graphs {
    static class Edge {
        int src;
        int dest;
        int weight;

        // directed unweighted graph
        // public Edge(int s, int d) { 
        //     this.src = s;
        //     this.dest = d;
        // }

        // directed weighted graph
        public Edge(int s, int d, int wt) { 
            this.src = s;
            this.dest = d;
            this.weight = wt;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]) {
        // directed unweighted graph
        // graph[0].add(new Edge(0,2));

        // graph[1].add(new Edge(1,2));
        // graph[1].add(new Edge(1,3));

        // graph[2].add(new Edge(2,0));
        // graph[2].add(new Edge(2,1));
        // graph[2].add(new Edge(2,3));

        // graph[3].add(new Edge(3,1));
        // graph[3].add(new Edge(3,2));

        // directed weighted graph
        graph[0].add(new Edge(0,2,2));

        graph[1].add(new Edge(1,2,10));
        graph[1].add(new Edge(1,3,0));

        graph[2].add(new Edge(2,0,2));
        graph[2].add(new Edge(2,1,10));
        graph[2].add(new Edge(2,3,-1));

        graph[3].add(new Edge(3,1,0));
        graph[3].add(new Edge(3,2,-1));
    }

    public static void dfs(ArrayList<Edge> graph[], int curr, boolean[] vis) {
        System.out.print(curr + " ");
        vis[curr] = true;

        for(int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if(vis[e.dest] == false) {
                dfs(graph, e.dest, vis);
            }
        }
    }
 

    public static void main(String[] args) {
        int V = 4;
        ArrayList<Edge> graph[] = new ArrayList[V]; // array of array list (adjacency list)
        
        for(int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        } // we have to get all locations in our graph as empty lists not null.

        createGraph(graph);
    
        // print 2's neighbours - directed unweighted graph
        // for(int i = 0; i < graph[2].size(); i++) {
        //     Edge e = graph[2].get(i);
        //     System.out.println(e.dest + " ");
        // }

        // print 2's neighbours - directed weighted graph
        for(int i = 0; i < graph[2].size(); i++) {
            Edge e = graph[2].get(i);
            System.out.println(e.dest + " " + e.weight);
        }

        /* Graph Traversal */
        boolean[] vis = new boolean[V]; // visited array

        // bfs traversal

        // dfs traversal 
        for(int i = 0; i < V; i++) {
            if(vis[i] == false) {
                dfs(graph, 0, vis);
            }
        } 
    }
}