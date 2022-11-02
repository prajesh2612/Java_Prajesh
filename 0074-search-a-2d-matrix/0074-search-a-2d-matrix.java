class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int r=matrix.length;
        int c=matrix[0].length;
        for(int i=0;i<r;i++)
        {
            int a=matrix[i][0];
            int b=matrix[i][c-1];
            if((target>=a)&&(target<=b))
            {
                int lb=0,ub=c-1,p=0;
                while(lb<=ub)
                {
                    p=(lb+ub)/2;
                    if(target<matrix[i][p])
                    {
                        ub=p-1;
                    }
                    else if(target>matrix[i][p])
                    {
                        lb=p+1;
                    }
                    else if(matrix[i][p]==target)
                    {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}