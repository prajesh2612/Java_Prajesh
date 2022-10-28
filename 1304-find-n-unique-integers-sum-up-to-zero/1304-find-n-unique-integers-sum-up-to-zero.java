class Solution {
    public int[] sumZero(int n) {
        int arr[]=new int[n];
        int a=(n/2)*(-1);
        if(n%2==0)
        {
            arr[n-1]=n-1;
            for(int i=0;i<n-1;i++)
            {
                arr[i]=a;
                a++;
            }
        }
        else
        {
            for(int i=0;i<n;i++)
            {
                arr[i]=a;
                a++;
            }
        }
        return arr;
    }
}