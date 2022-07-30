class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        List<String> result=new ArrayList<>();
        int[] max_freq=new int[26];
        for(int i=0;i<words2.length;i++){
            String curr_word=words2[i];
            int[] char_freq=get(curr_word);
            
            for(int j=0;j<26;j++){
                max_freq[j]=Math.max(max_freq[j],char_freq[j]);
            }
        }
        
        for(int i=0;i<words1.length;i++){
            
            String curr_word1=words1[i];
            int[] char_count=get(curr_word1);
            boolean valid=true;
            for(int j=0;j<26;j++){
                if(max_freq[j]>char_count[j]){
                    valid=false;
                    break;
                }
            }
            if(valid) result.add(curr_word1);
            
               
            
        }
        return result;
    }
    
    
    
    private int[] get(String string){
        int[] answer=new int[26];
      for(char c:string.toCharArray()){
          answer[c-'a']++;
      }
        return answer;
    }
}