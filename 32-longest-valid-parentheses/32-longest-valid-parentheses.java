class Solution {
    public int longestValidParentheses(String s) {
        Stack<Character> ch=new Stack();
        Stack<Integer> index=new Stack();
        index.add(-1);
        int max=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(')
            {
                ch.add('(');
                index.add(i);
            }
            else
            {
                if(!ch.isEmpty()&&ch.peek()=='(')
                {
                    ch.pop();
                    index.pop();
                    max=Math.max(max,i-index.peek());
                }
                else
                {
                    index.add(i);
                }
            }
        }
        return max;
    }
}