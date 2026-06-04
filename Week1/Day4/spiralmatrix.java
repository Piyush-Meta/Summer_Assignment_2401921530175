class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int sr =0 ,sc=0;
        int er = matrix.length -1 ;
        int ec = matrix[0].length-1;
        while(sr<=er && sc <= ec){
                for(int j=sc;j<=ec;j++){
                    list.add(matrix[sr][j]);
                }
                sr++;
                 for(int j=sr;j<=er;j++){
                    list.add(matrix[j][ec]);
                }
                ec--;
                if (sr <= er) {
              for(int j=ec;j>=sc;j--){
                    list.add(matrix[er][j]);
                }
                }
                er--;
                if (sc <= ec) {
              for(int j=er;j>=sr;j--){
                    list.add(matrix[j][sc]);
                }
                }
                sc++;
        }
          return list;
    }
  
}
