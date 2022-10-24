class Solution {
    public int minimumSum(int num) {
        int n1=num,i=0;
        int arr[]=new int[4];
        while(n1!=0)
        {
            int d=n1%10;
            arr[i]=d;
            n1=n1/10;
            i++;
        }
        Arrays.sort(arr);
        int num1=(arr[0]*10)+arr[3];
        int num2=(arr[1]*10)+arr[2];
        int sum=num1+num2;
        
        return sum;
        
    }
}