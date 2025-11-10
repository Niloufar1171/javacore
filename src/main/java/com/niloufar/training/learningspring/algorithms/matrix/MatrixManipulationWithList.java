package com.niloufar.training.learningspring.algorithms.matrix;

import com.niloufar.training.learningspring.cracking_code_of_interviewing.chapterSeven.onlineBookReader.Book;

import java.util.*;
/*
   1- create matrix and populate it Integer and int , learn how to initialize and manipilate.
   2- travese row by row
   3 - col by col
   4- diagnol
   5- reverse Diagnol
   6- Travese bfs learn how we put coordinate in queue not the actual value, learn the diff in offer and add
   7- travese dfs
   //spiral
   //island of 0 and one  with stack
   //largest rectangle with recursive


    */
public class MatrixManipulationWithList {
    public static void main(String[] args) {
        List<List<Integer>> matrix = new ArrayList<>();

        matrix.add(Arrays.asList(1, 2, 3));// Error matrix.add(new Arraylist<>(1,2,3) put a for loop to create the rows then add one by one  --> matrix.get(0).add(1);
        matrix.add(Arrays.asList(4, 5, 6));
        matrix.add(Arrays.asList(7, 8, 9));

        TravesereRowbyRow(matrix);
        System.out.println("-------------------");
        TraverseColsBycols(matrix);
        System.out.println("-------------------");
        TraverseDiagnal(matrix);
        System.out.println("-------------------");
        ReverseDiagnal(matrix);
        System.out.println("-------------------");
        TraveseBFS(matrix,5);
    }

    public static void TravesereRowbyRow(List<List<Integer>> matrix){
        int rows = matrix.size();
        int cols = matrix.get(0).size();

        for (int i = 0; i < rows; i ++){
            for (int j = 0 ; j < cols ; j ++){
                System.out.println(matrix.get(i).get(j));
            }
        }
    }

    public static  void TraverseColsBycols(List<List<Integer>> matrix){
        int rows = matrix.size();
        int cols = matrix.get(0).size();
        for (int col = 0; col < cols ; col ++){
            for (int row = 0; row < rows ; row ++){
                System.out.println(matrix.get(row).get(col));
            }
        }
    }

    public static void TraverseDiagnal(List<List<Integer>> matrix){
        int rows = matrix.size();
        for( int row =0; row< rows ; row ++){
            System.out.println(matrix.get(row).get(row));
        }

    }
    public static void ReverseDiagnal(List<List<Integer>> matrix ){
        int rows = matrix.size();
        int cols = matrix.get(0).size();
        for(int row = 0 ; row < rows ; row ++){
            System.out.println(matrix.get(row).get(cols - 1 - row ));
        }
    }
    // Directions: up, down, left, right
    private static final int[][] DIRECTIONS = {
            {-1, 0}, {1, 0}, {0, -1}, {0, 1}
    };
    public static void TraveseBFS(List<List<Integer>> matrix, int target){
        int rows = matrix.size();
        int cols = matrix.get(0).size();

        Queue<List<Integer>> q = new LinkedList<>();
        List<List<Boolean>> seen = new ArrayList<>();
        /*
        You first need to initialize rows and columns.
        seen.get(0) → first row
        .set(0, true) → first column of that row
        You can access or modify any element using seen.get(row).set(col, value)
         */
        for (int i = 0; i < rows; i++) {
            seen.add(new ArrayList<>(Collections.nCopies(cols, false)));
        }
        // q.add(new ArrayList<>(matrix.get(0)));
            // WRONG cause we want to store the positions not the values!
            //if you store the matrix values then when polling we have row as a first value and col second value
            // it is not the position that we are looking for! so we always enqueue the coordinates NOT THE ACTUAL MATRIX VALUES!

        q.offer(Arrays.asList(0,0));// enqueue position (row=0, col=0)
        seen.get(0).set(0, true);
        System.out.println("Initial queue: " + q);

        while( !q.isEmpty()){
            List<Integer> current = q.poll();
            int row = current.get(0);
            int col = current.get(1);
            int value = matrix.get(row).get(col);

            System.out.println("\n➡️ Visiting cell (" + row + ", " + col + ") = " + value);
            System.out.println("Current queue: " + q);

            if(value == target){
                System.out.println("target exists at " + row + " "+ col);
            }

            for (int [] dir :DIRECTIONS){
                int nr = row + dir[0];
                int nc = col + dir[1];

                if (nr >=0 && nr< rows && nc>=0 && nc < cols && !seen.get(nr).get(nc) ){
                    seen.get(nr).set(nc,true);
                   // q.offer(new ArrayList<>(matrix.get(nr)));--> this will stores the values of matrix but we need to store the coordinates!

                    // enqueue valid neighbor position
                    q.offer(Arrays.asList(nr,nc));
                    System.out.println("   Added neighbor (" + nr + ", " + nc + ") to queue");
                }
            }
            System.out.println("Queue after expanding (" + row + ", " + col + "): " + q);
        }
        System.out.println("\n❌ Target " + target + " not found.");
        System.out.println("target Not found");
    }
}
