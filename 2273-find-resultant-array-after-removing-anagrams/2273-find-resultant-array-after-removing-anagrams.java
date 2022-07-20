class Solution {
    public List<String> removeAnagrams(String[] words) {
        // if(words.length<=1){
        //     return list;
        // }
      ArrayList<String> hset=new ArrayList<>();
     String prev_st=null;
        for(String s:words){
            char[] res=s.toCharArray();
            Arrays.sort(res);
            String curr_st=new String(res);
            if(curr_st.equals(prev_st))continue;
            else{
                prev_st=curr_st;
                hset.add(s);
                
            }
            
        }
        return hset;
        
    }
}