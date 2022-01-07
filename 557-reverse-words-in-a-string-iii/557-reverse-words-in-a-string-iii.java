class Solution {
    public String reverseWords(String s) {
        StringBuilder sb=new StringBuilder();
        String[] strArray=s.split(" ");
        for(String words:strArray){
            StringBuilder sb1=new StringBuilder();
            sb1.append(words);
            sb1.reverse();
            sb.append(sb1.toString()+ " ");
        }
        sb.setLength(sb.length()-1);
        return sb.toString();
            
        }
        
    }
