class Solution {
    public int longestConsecutive(int[] nums) {
        HashMap<Integer,Integer> sequence = new HashMap<>();
        Arrays.sort(nums);
        int max = 0;
        for(int i=0; i < nums.length; i++) {
            int curr = nums[i];

            if(sequence.containsKey(curr)) {
                continue;
            }
            sequence.put(curr, 1);
            int pre = curr - 1;
            int post = curr + 1;

            if(sequence.containsKey(pre)){
                sequence.put(pre,sequence.get(pre) + 1);
                sequence.put(curr,sequence.get(pre));
            }

            if(sequence.containsKey(post)) {
                sequence.put(curr, sequence.get(curr) + 1);
                sequence.put(post,sequence.get(curr));
            }
            max = Math.max(sequence.get(curr), max);
        }
        return max;
    }
}
