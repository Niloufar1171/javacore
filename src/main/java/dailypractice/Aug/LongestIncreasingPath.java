package dailypractice.Aug;

import java.util.ArrayList;
import java.util.List;

public class LongestIncreasingPath {
        private static final int[][] dirs = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        private int rows, cols;
        private int [][] cache ;

        private int longestIncPath(int [][] grid, int i, int j){
            if( cache[i][j] == 0) return cache[i][j];
            int max_dir_path =0;
            for(int []dir : dirs ){
                int dir_i = i + dir[0];
                int dir_j = j + dir[1];
                if(valid(dir_i, dir_j) && grid[i][j] < grid[dir_i][dir_j] )
                    max_dir_path = Math.max(max_dir_path,longestIncPath(grid, dir_i , dir_j));
            }
            return cache[i][j] = max_dir_path;
        }

        public int longestIncreasingPath(int[][] grid) {
            rows= grid.length;
            cols = grid[0].length;
            if ( rows == 0) return 0;

         cache = new int [rows][cols];
            int max_path = 0;
            for (int i = 0; i < rows; ++i)
                for(int j =0; j < cols; j++)
                    max_path = Math.max(max_path,longestIncPath(grid, i , j) );
            return max_path;
        }
        private boolean valid(int i , int j){
            return i < rows && i > 0  && j<cols && j>=0;
        }

    public static void main(String[] args) {
        List<List<Integer>> x = new ArrayList<>();

    }
}
