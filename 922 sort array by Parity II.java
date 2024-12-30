class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        //int[] final = new int[nums.length];
        int[] evens = new int[nums.length/2];
        int[] odds = new int[nums.length/2];

        //get even numbers & sort
        int x=0;
        int y=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] % 2 == 0){
                evens[x] = nums[i];
                x++;
            }
            else{
                odds[y] = nums[i];
                y++;
            }
        }
        //-dont need to do this-sorts
        //Arrays.sort(evens);
        //Arrays.sort(odds);

        //merge, goes even, odd, even, odd...
        int[] result = new int[nums.length];
        int b=0;
        int v=0;
        for(int counter = 0; counter < nums.length; counter++){
            if(counter%2==0){
                result[counter] = evens[b];
                b++;
            }
            else{
                result[counter] = odds[v];
                v++;
            }
        }
        return result;
    }
}