class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        for(int i=0; i<nums.length; i++){
            //only one valid answer exists
            int placeholder = nums[i];
            for(int j = i+1; j<nums.length; j++){
                int temp = nums[j];
                if(temp + placeholder == target){
                    ans[0] = i;
                    ans[1] = j;
                    break;
                }
                else{
                    //go again!
                }
            }
        }
        return ans;
    }
}