class Solution {
    public int countCharacters(String[] words, String chars) {
        int orignal_length=0;
        int[] res=new int[26];
        for(char c:chars.toCharArray())
        {
            res[c-'a']++;
        }
        
        for(String s:words)
        {
           int[] temp_char=Arrays.copyOf(res,res.length);
            int valid=0;
            for(char c:s.toCharArray())
            {
                if(temp_char[c-'a']>0)
                {
                    valid++;
                    temp_char[c-'a']--;
                }
            }
            if(valid==s.length())
            {
                orignal_length+=s.length();
            }
        }
        return orignal_length;
    }
}