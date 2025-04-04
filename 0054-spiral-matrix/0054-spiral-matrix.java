class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int colStart = 0;
        int rowStart = 0;
        int colEnd = matrix[0].length;
        int rowEnd = matrix.length;
        List<Integer> ans = new ArrayList<>();

        while(colStart < colEnd && rowStart < rowEnd){

            for(int i = colStart;i < colEnd;i++){
                ans.add(matrix[rowStart][i]);
            }
            rowStart++;
            for(int i = rowStart;i < rowEnd;i++){
                ans.add(matrix[i][colEnd-1]);
            }
            colEnd--;
            if(rowStart < rowEnd){
                for(int i = colEnd-1; i >= colStart;i--){
                    ans.add(matrix[rowEnd-1][i]);
                }
                rowEnd--;
            }
            if(colStart < colEnd){
                for(int i = rowEnd-1;i >= rowStart;i--){
                    ans.add(matrix[i][colStart]);
                }
                colStart++;
            }
        }
        return ans;
    }
}