class Solution {
    // public void row(int[][] matrix,int i,int m){
    //     for(int j=0;j<m;j++)
    //     {   if (matrix[i][j]!=0)
    //             matrix[i][j]=-1;
    //     }
    // }
    // public void col(int[][] matrix,int i,int n){
    //     for(int j=0;j<n;j++)
    //     {    if (matrix[j][i]!=0)
    //             matrix[j][i]=-1;
    //     }
    // }
    public void setZeroes(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        int row[]=new int[n];
        int col[]=new int[m];  
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==0){
                    row[i]=1;
                    col[j]=1;
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(row[i]==1 || col[j]==1){
                    matrix[i][j]=0;
                }
            }
        }
    }
}