class Solution {
    public int uniquePaths(int m, int n) {
        return Path(0,0,m,n);
    }
    int Path(int i,int j,int m,int n){
        if(i==m-1 && j==n-1){
            return 1;
        }
        if(i>=m || j>=n){
            return 0;
        }
        int down=Path(i+1,j,m,n);
        int right=Path(i,j+1,m,n);
        int total=down+right;
        return total;
    }
}