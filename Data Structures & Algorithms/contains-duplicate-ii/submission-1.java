class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
       HashSet<Integer> set = new HashSet<>();
       int l = 0;
       for(int i = 0; i < nums.length; i++) {
            if(Math.abs(l-i) > k) {
                set.remove(nums[l]);
                l++;
            }

            if(set.contains(nums[i])) {
                return true;
            }

            set.add(nums[i]);
       }

       return false;

    }
}