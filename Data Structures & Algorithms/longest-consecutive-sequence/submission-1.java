class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = convert(nums);
        int max = 0;
        for(int n: set) {
            if(!set.contains(n-1)) {
                int count = 1 ;
                while(set.contains(n+1)) {
                    n = n+1;
                    count++;
                }
                max = Math.max(max,count);
            }
        }
        return max;
    }

    public Set<Integer> convert(int [] nums) {
        Set<Integer> set = new HashSet<>();
        for(int n : nums) {
            set.add(n);
        }
        return set;
    }
}
