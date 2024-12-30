class Solution {
    public int maximumWealth(int[][] accounts) {
        int val = 0;
        int richest = 0;

        for(int i=0; i<accounts.length; i++){
            //reset val
            val = 0;
            for(int j=0; j<accounts[i].length; j++){
                val = val + accounts[i][j];
            }
            if(val > richest){
                richest = val;
            }
            else{
                //loop again
            }
        }
        return richest;
    }
}