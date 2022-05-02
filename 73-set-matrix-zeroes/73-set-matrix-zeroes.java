class Solution {
      public void setZeroes(int[][] matrix) {
        boolean[] rowsToSetZero = new boolean[matrix.length];
        boolean[] colsToSetZero = new boolean[matrix[0].length];
        
        for(int row = 0; row < matrix.length; row++) {
            for(int col = 0; col < matrix[row].length; col++) {
                int val = matrix[row][col];
                
                if(val != 0) continue;
                rowsToSetZero[row] = true;
                colsToSetZero[col] = true;
            }
        }
        
        for(int row = 0; row < matrix.length; row++) {
            for(int col = 0; col < matrix[row].length; col++) {
                
                if(rowsToSetZero[row] || colsToSetZero[col]) matrix[row][col] = 0;
            }
        }
    }
}