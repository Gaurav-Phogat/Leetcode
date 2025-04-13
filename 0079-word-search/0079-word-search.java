class Solution {
    public boolean exist(char[][] board, String word) {

        boolean ans = false;

        for(int i = 0;i < board.length;i++){
            for(int j = 0;j < board[0].length;j++){
                if(board[i][j] == word.charAt(0)){
                    boolean temp = check(board,new boolean[board.length][board[0].length],word,i,j,0);
                    if(temp == true){
                        ans = true;
                    }
                }
            }
        }
        return ans;
    }
    public boolean check(char[][] board,boolean[][] matrix,String word,int i,int j,int index){

        if(i >= board.length || i < 0 || j >= board[0].length || j < 0 ||
            word.charAt(index) != board[i][j] || matrix[i][j] == true
        ) return false;

        matrix[i][j] = true;

        if(word.length()-1 == index) return true;

        boolean found = (
            check(board,matrix,word,i-1,j,index+1) ||
            check(board,matrix,word,i+1,j,index+1) ||
            check(board,matrix,word,i,j-1,index+1) ||
            check(board,matrix,word,i,j+1,index+1));
        
        matrix[i][j] = false;

        return found;
    }
}