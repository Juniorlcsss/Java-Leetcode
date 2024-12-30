class Solution {
    public int[] getConcatenation(int[] nums) {
        //to store result
        int lenx2 = nums.length * 2;
        int[] result;
        result = new int[lenx2];
        for(int i=0, j=nums.length; i<nums.length; i++, j++){
            result[i] = nums[i];
            result[j] = nums[i];
        }
        return result;
    }
}