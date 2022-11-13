/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int lb=1,ub=n,ans=0;
        while(lb<=ub)
        {
            int mid=lb+(ub-lb)/2;
            if(isBadVersion(mid)==true)
            {
                ans=mid;
                ub=mid-1;
            }
            else
            {
                lb=mid+1;
            }
        }
        return ans;
    }
}