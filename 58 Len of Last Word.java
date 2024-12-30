class Solution {
    public int lengthOfLastWord(String s) {
        int[] count = new int[s.length()];
        for(int i=0, j=0; i<s.length(); i++){
            if(s.charAt(i) != ' '){
                count[j] = count[j] + 1;
            }
            else{
                //reset
                j++;
            }
        }
        //get the last value > 0 in count
        int ans = 0;
        for(int k=s.length()-1; k>-1; k--){
            /*if(k ==0){
                ans = 1;
                break;
            }
            else */if(count[k] > 0){
                ans = count[k];
                break;
            }
        }
        return ans;
    }
}