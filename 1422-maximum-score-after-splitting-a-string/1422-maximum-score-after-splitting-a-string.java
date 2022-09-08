class Solution {
    public int maxScore(String s) {
       char[] ch=s.toCharArray();
        int count=0;
   int max=0;
        int ans=0;
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]=='1')
                count=count+1;
        }
        for(int i=0;i<ch.length-1;i++)
        {
            if(ch[i]=='0'){
               ans+=1;
              
           
            }
            else{
                ans=ans-1;
            }
            max=Math.max(max,ans+count);
        }
     return max;
    }
}