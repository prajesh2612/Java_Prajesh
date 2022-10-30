class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int l=arr.length;
        int sum=0;
        for(int i=1;i<=l;i=i+2)
        {
            int s=0;
            for(int j=0;j<i;j++)
            {
                s=s+arr[j];
            }
            sum=sum+s;
            int p=0;
            for(int j=i;j<l;j++)
            {
                s=s-arr[p]+arr[j];
                sum=sum+s;
                p++;
            }
        }
        return sum;        
    }
}