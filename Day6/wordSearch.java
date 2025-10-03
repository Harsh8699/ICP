class Solution {
    public boolean exist(char[][] board, String word) {
        int n=board.length;
        int m=board[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(board[i][j]==word.charAt(0)){
                    if (find(board,i,j,word,0)){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    boolean find(char[][]board,int r,int c,String word,int index){
        if(index==word.length()){
            return true;
        }
        if(r<0||r>=board.length||c<0||c>=board[0].length||board[r][c]!=word.charAt(index)){
            return false;
        }
        char ch=board[r][c];
        board[r][c]='#';
        boolean ans=false;
        int [][]dir={{1,0},{-1,0},{0,1},{0,-1}};
        for(int d[]:dir){

            if(find(board,r+d[0],c+d[1],word,index+1))return true;

        }
        board[r][c]=ch;
        return ans;
    }
}