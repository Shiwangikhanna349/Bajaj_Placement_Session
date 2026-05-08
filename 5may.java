//number of islands
class Solution {
    public int numIslands(char[][] grid) {
        int count=0;

        for(int i=0;i<grid.length;i++) {
            for(int j=0;j<grid[0].length;j++) {
                if(grid[i][j]=='1') {
                    dfs(grid,i,j);
                    count++;
                }
            }
        }

        return count;
    }

    private void dfs(char[][] grid,int i,int j) {
        if(i<0||j<0||i>=grid.length||j>=grid[0].length||grid[i][j]=='0') {
            return;
        }

        grid[i][j]='0';

        dfs(grid,i+1,j);
        dfs(grid,i-1,j);
        dfs(grid,i,j+1);
        dfs(grid,i,j-1);
    }
}



//set matrix zeroes
class Solution {
    public void setZeroes(int[][] matrix) {
        boolean firstRow=false;
        boolean firstCol=false;

        for(int i=0;i<matrix.length;i++) {
            if(matrix[i][0]==0) {
                firstCol=true;
            }
        }

        for(int j=0;j<matrix[0].length;j++) {
            if(matrix[0][j]==0) {
                firstRow=true;
            }
        }

        for(int i=1;i<matrix.length;i++) {
            for(int j=1;j<matrix[0].length;j++) {
                if(matrix[i][j]==0) {
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                }
            }
        }

        for(int i=1;i<matrix.length;i++) {
            for(int j=1;j<matrix[0].length;j++) {
                if(matrix[i][0]==0||matrix[0][j]==0) {
                    matrix[i][j]=0;
                }
            }
        }

        if(firstRow) {
            for(int j=0;j<matrix[0].length;j++) {
                matrix[0][j]=0;
            }
        }

        if(firstCol) {
            for(int i=0;i<matrix.length;i++) {
                matrix[i][0]=0;
            }
        }
    }
}