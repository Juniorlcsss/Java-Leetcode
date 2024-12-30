class Solution {
    public int largestCombination(int[] candidates) {

        int maxSet = 1;
        int bw = 1; //

        for(int i=0; i< 24; i++){
            int count = 0;
            for(int j=0; j<candidates.length; j++){
                if((candidates[j] & bw) != 0){
                    count++;
                }
                else{
                    //do nothing
                }
            }
            if(maxSet < count){
                maxSet = count;
            }
            bw <<=1;
        }
        return maxSet;
    }
}