class Solution {
    public boolean isAnagram(String s, String t) {
        char[] ch=s.toCharArray();
        Arrays.sort(ch);
        char[] ch1=t.toCharArray();
        Arrays.sort(ch1);
        return new String(ch).equals(new String(ch1));
        
    }
}