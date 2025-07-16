import java.util.*;
//import java.io.*;
public class BFS {
    public static ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {

        //storing the node value to the arraylist
        ArrayList < Integer > bfs = new ArrayList <> ();

        //Visited array. its store the corresponidng T/F for the node visited or not
        boolean vis[] = new boolean[V];

        //Queue
        Queue < Integer > q = new LinkedList < > ();

        q.add(0);
        vis[0] = true;

        while (!q.isEmpty()) {
            Integer node = q.poll();
            bfs.add(node);

            // Get all adjacent vertices of the dequeued vertex s
            // If a adjacent has not been visited, then mark it
            // visited and enqueue it
            for (Integer it: adj.get(node)) {
                if (vis[it] == false) {
                    vis[it] = true;
                    q.add(it);
                }
            }
        }
        return bfs;
    }
    public static void main(String[] args) {
        int n =4; //No of Node
        //int m =3; //No of edge
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
        for (int i =0;i<n ;i++){
            adj.add(new ArrayList<Integer>());
        }


        //edge 1----2
        adj.get(0).add(1);
        adj.get(1).add(0);

        //edge 2----3
        adj.get(0).add(2);
        adj.get(2).add(0);

        //edge 1----3
        adj.get(1).add(3);
        adj.get(3).add(1);

        ArrayList<Integer> ans = bfsOfGraph(n,adj);

        int s = ans.size(); 
        for(int i = 0;i<s;i++) {
            System.out.print(ans.get(i)+" "); 
        }
    }
}
