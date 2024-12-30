class Solution {
    public long minEnd(int n, int x) {
        long ans = x;
        long pos = 1;

        for(long rem = n-1; rem != 0;){
            if((x&pos) == 0){
                ans |= (rem & 1) * pos;
                rem >>=1;
            }
            pos <<=1;
        }
        return ans;
    }
}