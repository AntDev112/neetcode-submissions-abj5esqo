class Solution {
    public static int characterReplacement(String s, int k) {
        HashMap<Character,Integer> charMap = new HashMap<>();
        int maxFreq = 0;
        int l = 0;
        int longest = 0;

        for (int i =0 ; i < s.length(); i++) {
            char c = s.charAt(i);
            charMap.put(c,charMap.getOrDefault(c,0) + 1);
            maxFreq = Math.max(maxFreq, charMap.get(c));
            int replacements = (i-l+1) - maxFreq;
            if(replacements > k) {
                char first = s.charAt(l);
                charMap.put(first, charMap.get(first) - 1);
                l++;
            }
            longest = Math.max(i-l+1 , longest);
        }

        return longest;

    }
}
