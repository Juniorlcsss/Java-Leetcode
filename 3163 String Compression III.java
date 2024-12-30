class Solution {
    public String compressedString(String word) {
        String ans = "";
        int i = 0;
        char[] carr = word.toCharArray();
        while(i < word.length()){
            int count = 0;
            char temp = carr[i];
            while(i<word.length() && carr[i] == temp && count < 9){
                count++;
                i++;
            }
            ans = ans + count;
            ans = ans+ temp;
        }
        return ans;
    }
}