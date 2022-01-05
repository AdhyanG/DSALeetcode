class Solution {
    List<List<String>> ans = new ArrayList();
    public List<List<String>> partition(String s) {
        generatePart(s, new ArrayList());
        return ans;
    }
    private void generatePart(String s, List<String> temp) {
        if (s.length() == 0) {
            ans.add(new ArrayList(temp));
        } else {
            for (int i = 1; i <= s.length(); i++) {
                if (isVaild(s, i)) {
                    temp.add(s.substring(0, i));
                    generatePart(s.substring(i), temp);
                    temp.remove(temp.size() - 1);
                }
            }
        }
    }
    private boolean isVaild(String s, int len) {
        int l = 0, r = len - 1;
        while (l < r) {
            if (s.charAt(l) == s.charAt(r)) {
                l++;
                r--;
            }
            else{
                return false;
            }
        }
        return true;
    }
}