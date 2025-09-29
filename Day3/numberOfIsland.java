
class Solution{
    public int numIslands(char[][] grid){
        int count=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1'){
                    count++;
                    clear(grid,i,j);
                }
            }
        }
        return count;
    }
    void clear(char[][]grid,int r,int c){
        if(r<0||r>=grid.length||c<0||c>=grid[0].length||grid[r][c]=='0'){
            return;
        }
        grid[r][c]='0';
        // clear(grid,r+1,c);
        // clear(grid,r-1,c);
        // clear(grid,r,c+1);
        // clear(grid,r,c-1);

        int d[][]={{1,0},{-1,0},{0,1},{0,-1}};
        for(int dir[]:d){
            clear(grid,r+dir[0],c+dir[1]);
        }
    }
}