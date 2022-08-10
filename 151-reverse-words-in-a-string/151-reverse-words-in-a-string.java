class Solution {
    public String reverseWords(String s) {
        String[] arr=s.trim().split(" ");
        Stack<String> stack=new Stack<>();
        for(String t:arr)
        {
            if(t!=""){
                stack.push(t);
            }
        }
        StringBuilder sb=new StringBuilder();
        while(stack.size()>0)
        {
            String ss=stack.pop();
            if(stack.size()==0)
            {
                sb.append(ss);
            }
            else
            {
                sb.append(ss).append(" ");
            }
        }
        return sb.toString();
    }
}