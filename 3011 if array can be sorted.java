class Solution {

    //I just realised i could make other classes lol
    public void swap(int[] nums, int j){
        int temp = nums[j];
        nums[j] = nums[j+1];
        nums[j+1] = temp;
    }


    public boolean canSortArray(int[] nums) {
        for(int i=1; i<nums.length; i++){
            for(int j=0; j<nums.length-1; j++){
                if(nums[j] > nums[j+1]){
                    //check if can swap
                    if(Integer.bitCount(nums[j]) == Integer.bitCount(nums[j+1])){
                        //swap
                        swap(nums, j);
                    }   
                    else{
                        return false;
                    }
                }
                else{
                    //do nothing
                }
            }
        }
        return true;
    }
}