package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Rottenoranges {
    
    
  
    public int orangesRotting(int[][] mat) {
        Queue<int[]> q = new LinkedList<>();
        int fresh = 0;
        int rows = mat.length;
        int cols = mat[0].length;
        
        // Step 1: collect rotten oranges and count fresh
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (mat[i][j] == 2) {
                    q.add(new int[]{i, j});
                } else if (mat[i][j] == 1) {
                    fresh++;
                }
            }
        }
        
        if (fresh == 0) return 0; // no fresh oranges
        
        int time = -1;
        int[][] dirs = {{0,1}, {0,-1}, {1,0}, {-1,0}};
         
        // Step 2: BFS
        while (!q.isEmpty()) {
            time++;
            int size = q.size();
            
            for (int k = 0; k < size; k++) {
                int[] curr = q.poll();
                for (int[] d : dirs) {
                    int ni = curr[0] + d[0];
                    int nj = curr[1] + d[1];
                    
                    if (ni >= 0 && ni < rows && nj >= 0 && nj < cols && mat[ni][nj] == 1) {
                        mat[ni][nj] = 2;  // rot this orange
                        fresh--;
                        q.add(new int[]{ni, nj});
                    }
                }
            }
        }
        
        return (fresh == 0) ? time : -1;
    }
}


