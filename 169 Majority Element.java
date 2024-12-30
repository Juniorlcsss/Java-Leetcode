class Solution {
    public int majorityElement(int[] nums) {
        int candidate = nums[0];
        int count = 0;

        for(int i = 0; i < nums.length; i++){
            if(candidate != nums[i]){
                if(count == 0){
                    count = 1; //reset count
                    candidate = nums[i];    //make new candidate
                }
                else{
                    count= count - 1;
                }
            }
            else if(nums[i] == candidate){
                count++;
            }
            else{
                count--;
            }
        }
        return candidate;
    }
}