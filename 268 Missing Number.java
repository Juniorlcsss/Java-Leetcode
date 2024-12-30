class Solution {
    public int missingNumber(int[] nums) {
        int length = nums.length;   //range should be 0-length
        Arrays.sort(nums);          //acending order
        int ans = 0;

        int start = nums[0];    //get init value

        if(start !=  0){
            return 0;
        }
        else{
            for(int i=0; i<length; i++){    
                if(nums[i] == start){
                    start++;
                }
                else if(nums[i] != start){
                    //ans =  start;
                    return start;
                }
            }
        }       
        return start;   //error
    }
}