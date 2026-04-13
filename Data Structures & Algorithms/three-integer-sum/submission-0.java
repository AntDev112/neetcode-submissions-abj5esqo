class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        
        for(int i = 0; i < nums.length; i++) {
            int l=i+1;
            int r = nums.length-1;
            while(l < r) {
                if(nums[l]+nums[r] > -nums[i]) {
                    r--;
                } else if(nums[l] + nums[r] < -nums[i]){
                    l++;
                } else {
                    List<Integer> curr = new ArrayList<>();
                    curr.add(nums[l]);
                    curr.add(nums[r]);
                    curr.add(nums[i]);
                    if(!result.contains(curr)) {
                        result.add(curr);
                    }
                    l++;
                    r--;
                    
                }
            }

        }
        return result;
    }
}
