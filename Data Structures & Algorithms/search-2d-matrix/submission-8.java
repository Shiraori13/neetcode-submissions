class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) return false;
        int l = 0;
        
        int col = matrix[0].length;
        int r = matrix.length * col - 1;

        while(l <= r){
            int mid = l + ( r - l ) / 2;
            int rowToFind = mid / col;
            int colToFind = mid % col;

            int valueMatrix = matrix[rowToFind][colToFind];
           
           if (valueMatrix == target) return true;
           else if (valueMatrix < target){
            l = mid + 1;
           }
           else if (valueMatrix > target){
            r = mid - 1;
           }
        }
        return false;
    }
}
