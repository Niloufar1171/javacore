package com.niloufar.training.learningspring.algorithms.Graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
class Edge{
    int src, dest, weight;
    Edge(int src, int dest, int weight) {
        this.src = src;
        this.dest = dest;
        this.weight = weight;
    }

}
//1 Directed and weighted graph
class Graph {
    // node of adjacency list
    static class Node {
        int value, weight;
        Node(int value, int weight) {
            this.value = value;
            this.weight = weight;
        }
    };

    List<List<Node>> adj_list = new ArrayList<>();
    public Graph(List<Edge> edges)
    {
        for (int i = 0; i < edges.size(); i++)
            adj_list.add(i, new ArrayList<>());

        for (Edge e : edges)
            adj_list.get(e.src).add(new Node(e.dest, e.weight));
    }

    public static void printGraph(Graph graph)  {
        int src_vertex = 0;
        int list_size = graph.adj_list.size();

        System.out.println("The contents of the graph:");
        while (src_vertex < list_size) {
            for (Node edge : graph.adj_list.get(src_vertex)) {
                System.out.print("Vertex:" + src_vertex + " ==> " + edge.value +
                        " (" + edge.weight + ")\t");
            }

            System.out.println();
            src_vertex++;
        }
    }
}
