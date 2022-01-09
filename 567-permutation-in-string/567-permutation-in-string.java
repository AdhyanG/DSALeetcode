class Solution {
    public boolean checkInclusion(String p, String s) { // renamed s1 to p, s2 to s
        int[] cnt = new int[128];
        for (char c : p.toCharArray()) {
            cnt[c]++;
        }

        int nChars = p.length();
        for (int r = 0, l = 0; r < s.length(); ++r) {
            char c = s.charAt(r);

            cnt[c]--;
            nChars--;
            while (cnt[c] < 0) { // If number of characters `c` is more than our expectation
                cnt[s.charAt(l)]++;  // Slide left until cnt[c] == 0
                l++;
                nChars++;
            }

            if (nChars == 0) { // If we already filled enough `p.length()` chars
                return true;
            }
        }
        return false;
    }
}