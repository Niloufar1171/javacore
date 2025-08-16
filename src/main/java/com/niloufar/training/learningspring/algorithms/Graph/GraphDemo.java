package com.niloufar.training.learningspring.algorithms.Graph;

import java.util.Arrays;
import java.util.List;

public class GraphDemo {
        public static void main(String[]args){
            List<Edge> edges = Arrays.asList(new Edge(0, 1, 2),new Edge(0, 2, 4),
                    new Edge(1, 2, 4),new Edge(2, 0, 5), new Edge(2, 1, 4),
                    new Edge(3, 2, 3), new Edge(4, 5, 1),new Edge(5, 4, 3));

            // call graph class Constructor to construct a graph
            Graph graph = new Graph(edges);

            // print the graph as an adjacency list
            Graph.printGraph(graph);
        }
    }
