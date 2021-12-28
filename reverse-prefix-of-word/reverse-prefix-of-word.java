class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder sb=new StringBuilder();
        int k=word.indexOf(ch);
        sb.append(word.substring(0,(k+1)));
        sb.reverse();
        sb.append(word.substring(k+1));
        return sb.toString();
    }
}