class Solution {
    public int[] shuffle(int[] nums, int n) {
        int length = nums.length;
        int half = length/2;
        int[] x = new int[length/2];
        int[] y = new int[length/2];

        for(int i=0, j=0; i<length; i++){
            if(i < half){
                x[i] = nums[i];
            }
            else{
                y[j] = nums[i];
                j++;
            }
        }
        int[] res = new int[length];
        for(int i=0, j=0, k=0; i<length; i++){
            if(i==0){
                res[i] = x[0];
                j++;
            }
            else if(i%2==0){
                res[i] = x[j];
                j++;
            }
            else{
                res[i] = y[k];
                k++;
            }
        }
        return res;
    }
}