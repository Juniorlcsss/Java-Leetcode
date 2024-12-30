class Solution {
    public int[] getMaximumXor(int[] nums, int maximumBit) {
        int[] ans = new int[nums.length];
        int temp = (int)Math.pow(2,maximumBit) - 1;
        for(int i=0; i<nums.length; i++){
            temp ^= nums[i];
            ans[nums.length-1-i] = temp;
        }
        return ans;
    }
}