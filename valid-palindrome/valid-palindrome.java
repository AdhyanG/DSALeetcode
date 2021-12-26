class Solution {
    public boolean isPalindrome(String s) {
        String fixedstr="";
        for(char ch:s.toCharArray()){
            if(Character.isDigit(ch) || Character.isLetter(ch)){
                fixedstr +=ch;
            }
        }
        fixedstr=fixedstr.toLowerCase();
        int start=0;
        int end=fixedstr.length()-1;
        while(start<=end){
            if(fixedstr.charAt(start) != fixedstr.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
        
    }
}