class Solution {
    public int[] plusOne(int[] digits) {
        int l=digits.length;
        if(digits[l-1]!=9)
        {
            int arr[]=new int[l];
            arr[l-1]=digits[l-1]+1;
            for(int i=0;i<l-1;i++)
            {
                arr[i]=digits[i];
            }
            return arr;
        }
        int carry=0,d;
        Stack<Integer> stack=new Stack<>();
        stack.push(0);
        carry=1;
        for(int i=l-2;i>=0;i--)
        {
            if(carry==1)
            {
                int a=digits[i]+1;
                d=a%10;
                carry=a/10;
            }
            else
            {
                d=digits[i];
            }
            stack.push(d);
        }
        if(carry==1)
        {
            stack.push(1);
        }
        int s=stack.size();
        int arr[]=new int[s];
        for(int i=0;i<s;i++)
        {
            arr[i]=stack.pop();            
        }        
        return arr;        
    }
}