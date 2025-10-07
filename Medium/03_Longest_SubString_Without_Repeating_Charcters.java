class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i = 0, ans = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int j = 0; j < s.length(); j++) {
            char c = s.charAt(j);
            if (map.containsKey(c)) {
                i = Math.max(i, map.get(c) + 1);
            }
            map.put(c, j);
            ans = Math.max(ans, j - i + 1);
        }
        return ans;
    }
}
