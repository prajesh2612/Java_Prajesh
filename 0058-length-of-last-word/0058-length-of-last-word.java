class Solution {
    public int lengthOfLastWord(String s) {
        String arr[]=s.split(" ");
        int l=(arr[arr.length-1]).length();
        
        return l;
    }
}