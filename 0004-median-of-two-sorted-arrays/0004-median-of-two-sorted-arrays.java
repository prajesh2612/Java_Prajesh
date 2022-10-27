class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int arr[]=new int[n+m];
        int i=0,j=0,k=0;
        while(i<n && j<m)
        {
            if(nums1[i]<=nums2[j])
            {
                arr[k]=nums1[i];
                i++;
            }
            else if(nums1[i]>nums2[j])
            {
                arr[k]=nums2[j];
                j++;
            }
            k++;
        }
        while(i<n)
        {
            arr[k]=nums1[i];
            i++;
            k++;
        }
        while(j<m)
        {
            arr[k]=nums2[j];
            j++;
            k++;
        }
        int s=arr.length;
        double median;
        if(s%2==0)
        {
            int m1=s/2;
            int m2=(s/2)-1;
            median=(arr[m1]+arr[m2])/2.0;
        }
        else
        {
            int m1=s/2;
            median=arr[m1]; 
        }
        
        return median;
    }
}