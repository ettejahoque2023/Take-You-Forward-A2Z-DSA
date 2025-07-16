import java.util.*;
import java.io.*;
public class UnGraph {
    public static void main(String[] args) {
        int n =3; //No of Node
        int m =3; //No of edge
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
        for (int i =0;i<n ;i++){
            adj.add(new ArrayList<Integer>());
        }


        //edge ----2
        adj.get(1).add(2);
        adj.get(2).add(1);

        //edge 2----3
        adj.get(2).add(3);
        adj.get(3).add(4);

        //edge 1----3
        adj.get(1).add(3);
        adj.get(3).add(4);

        
    }
}
