class Solution {
    public static boolean checkInclusion(String s1, String s2) {
        int l = 0;
        for (int i = 0; i < s2.length(); i++) {
            int length = i-l+1;

            if(length > s1.length()) {
                l++;
            }
            
            if(exists( s1, s2.substring(l,i+1))) {
                return true;
            }

        }
        return false;
    }

    public static boolean exists(String s1, String s2) {
        char [] chars1 = s1.toCharArray();
        char [] chars2 = s2.toCharArray();
        Arrays.sort(chars1);
        Arrays.sort(chars2);
        String sorted1 = new String(chars1);
        String sorted2 = new String(chars2);
        return sorted1.equals(sorted2);
    }
}
