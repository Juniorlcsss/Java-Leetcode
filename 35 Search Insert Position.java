class Solution {
    public int searchInsert(int[] nums, int target) {
        int length = nums.length;
        int ans = 0;
        if(nums[length-1] < target){
            ans = length;
        }
        else{
            for(int i=0; i<length; i++){
                if(nums[i] > target){
                    ans = i;
                    break;
                }
                else if(nums[i] == target){
                    ans =i;
                    break;
                }
            }
        }
        return ans;
    }
}