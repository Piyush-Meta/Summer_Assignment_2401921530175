class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int[][] ans = new int[r][c];
        int n = mat.length ,m = mat[0].length;
        int rn=0,cn =0;
        if(r*c != m*n) return mat;
        for(int i =0 ;i<n;i++){
        for(int j = 0;j<m;j++){
          ans[rn][cn]=mat[i][j];
          cn++;
           if(cn==c){
        cn =0;
        rn++;
       }
        }
        } 
         return ans;
    }
   
}
