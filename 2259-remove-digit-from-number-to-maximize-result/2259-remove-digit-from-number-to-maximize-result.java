class Solution {
    public String removeDigit(String number, char digit) {
     String str="";
        for(int i=0;i<number.length();i++){
            if(number.charAt(i)==digit){
                String curr=number.substring(0,i)+number.substring(i+1);
                if(curr.compareTo(str)>0){
                    str=curr;
                }
            }
        }
        return str;
            
        }
    }
