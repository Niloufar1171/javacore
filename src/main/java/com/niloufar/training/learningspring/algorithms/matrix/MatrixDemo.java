package com.niloufar.training.learningspring.algorithms.matrix;

public class MatrixDemo {
    public static void main(String[] args) {
        System.out.print(" Travers row by row  : ");
        int[][] matrix1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        MatrixManipulation.traversRowbyRow( matrix1);
//*********************************************************************************************************************************************************************************************
        System.out.println();
        System.out.println (" Travers column by column : ");
        int[][] matrix2 = {
                {1, 4,   7,  11, 15},
                {2, 5,   8,  12, 19},
                {3, 6,   9,  16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };
        MatrixManipulation.traversColbyCol(matrix2);

//*********************************************************************************************************************************************************************************************
        System.out.println();
        System.out.println (" Travers diagnoal left to right : ");
        MatrixManipulation.traversDiagonal(matrix1);
        //*********************************************************************************************************************************************************************************************
        System.out.println();
        System.out.println (" Travers Revese Diagnal right to left : ");
        MatrixManipulation.traversReveseDiagonal(matrix1);
        //*********************************************************************************************************************************************************************************************
        System.out.println();
        System.out.println (" Travers Spiral Order AKS Clockwise : ");
        MatrixManipulation.TraverseSpiralOrder(matrix1);


        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 1, 2, 3},
                {6, 5, 1, 2}
        };
        //*********************************************************************************************************************************************************************************************
        System.out.println("Is Toeplitz Matrix? " + MatrixManipulation.isToeplitzMatrix(matrix)); // Output: true
        int[][] m = {
                {4, 2, 9},
                {1, 8, 3},
                {7, 6, 5}
        };
        //*********************************************************************************************************************************************************************************************
        int[][] m2 = {
                {4, 2, 9},
                {1, 8, 3},
                {7, 6, 5}
        };
        System.out.println( MatrixManipulation.ReveseDiagnal(m2));
      //  System.out.println(result); // Output: [3, 9]

    }
}
