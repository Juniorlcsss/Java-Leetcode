class Solution {
    public int heightChecker(int[] heights) {
        int change =0;
        int[] clone = heights.clone();
        Arrays.sort(heights);
        for(int i=0; i<heights.length; i++){
            if(clone[i] != heights[i]){
                change=change+1;
            }
        }
        return change;
    }
}