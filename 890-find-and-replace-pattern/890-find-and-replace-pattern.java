class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        //get the permutation map of 
        List<String> list=new ArrayList<>();
        String result=get(pattern);
        for(String word:words){
            String result_2=get(word);
                if(result_2.equals(result)){
                    list.add(word);
                }
            }
          return list;  
        }
       
    
    private String get(String string){
        HashMap<Character,Integer> map=new HashMap<>();
        int i=0;
        StringBuilder sb=new StringBuilder();
        for(char c:string.toCharArray()){
            if(!map.containsKey(c)){
                map.put(c,i++);
                sb.append(i);
            }
            else{
                sb.append(map.get(c));
            }
        }
        return sb.toString();
    }
}