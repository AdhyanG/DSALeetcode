class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> list=new ArrayList<>();
        String result=get(pattern);
        for(String word:words){
            String answer=get(word);
            if(answer.equals(result))list.add(word);
            
        }
        return list;
    }
    
    
    private String get(String s){
        HashMap<Character,Integer> map=new HashMap<>();
        StringBuilder sb=new StringBuilder();
        int i=0;
        for(char c:s.toCharArray()){
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