class Solution {
    public int diagonalSum(int[][] mat) {
      int sum = 0;
        int upto = mat.length%2 == 1 ? (mat.length + 1)/2 : mat.length/2;
        for (int i = 0; i<upto; i++){
            int other = mat.length-(i+1);
            sum += i==other ? mat[i][i] : mat[i][i] + mat[i][other] + mat[other][i] + mat[other][other];
        }
        return sum;  
    }
}