class Solution {
    public int diagonalSum(int[][] mat) {
        int r=mat.length;
        int c=mat[0].length;
        int p1=0,p2=c-1,s=0;
        for(int i=0;i<r;i++)
        {
            s=s+mat[i][p1]+mat[i][p2];
            if(p1==p2)
            {
                s=s-mat[i][p1];
            }
            p1++;
            p2--;
        }
        return s;
    }
}