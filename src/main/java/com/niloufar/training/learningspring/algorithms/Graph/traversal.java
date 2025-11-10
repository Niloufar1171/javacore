package com.niloufar.training.learningspring.algorithms.Graph;

import java.util.*;

public class traversal {
    public static void main(String[] args) {
        int [][] adjlist = {{1,2},{2,3},{3,0},{0,1},{2,4},{2,5}};
        traverseBFS(adjlist, 0, 6);

    }
    public static List<List<Integer>> BuildGraph(int [][] edges,int n) {
        List<List<Integer>> graph = new ArrayList<>();
        for(int i = 0; i < n; i++)
            graph.add(new ArrayList<>());

        for(int[] edge: edges){
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }

        return graph;
    }

    public static void traverseBFS(int [][] edges, int root, int n){
        List<List<Integer>> graph = BuildGraph(edges, n);
        Queue<Integer> q = new LinkedList<>();
        boolean[] seen = new boolean[n];// Set<Node> seen
        Arrays.fill(seen,false);
        seen[root] = true;
        q.add(root);
        System.out.print("|BFS Traversal : ");
        while(!q.isEmpty()) {
            int node =q.poll();
            System.out.print("Node [ " + node + " ] , ");
            int eachArrysize = graph.get(node).size() ;

            for(int i = 0 ;i < eachArrysize; i ++) {
                int neighbor = graph.get(node).get(i);
                if(!seen[neighbor]) {
                    q.add(neighbor);
                    //System.out.println("|________|" + neighbor + "|________|");
                    seen[neighbor] = true;
                }
            }
        }
    }
}
