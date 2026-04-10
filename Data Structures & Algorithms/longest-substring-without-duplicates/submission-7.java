class Solution {
    public int lengthOfLongestSubstring(String s) {
        int longest = 0;
        int l = 0;
        HashSet<Character> chars = new HashSet<>();
        for(int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            while(chars.contains(curr)) {
                chars.remove(s.charAt(l));
                l++;
            }
            chars.add(curr);
            longest = Math.max(longest,i-l+1);
        }
        return longest;
    }
}
