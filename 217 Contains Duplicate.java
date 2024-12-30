class Solution {
    public boolean containsDuplicate(int[] nums) {
        boolean ans = false;
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i++){
            if(i == nums.length - 1){
                //ignore next instruction
            }
            else if(nums[i] == nums[i+1]){
                ans = true;
            }
            else{
                //keep looping
            }
        }
        return ans;
    }
}