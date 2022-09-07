class Solution {
    public int strStr(String haystack, String needle) {
        int  nh=haystack.length();
        int nn=needle.length();
        if(nn>nh){
            return -1;
        }
        for(int i=0;i<=nh-nn;i++)
        {
            if(haystack.substring(i,i+nn).equals(needle)){
                return i;
            }
        }
        return -1;
    }
}