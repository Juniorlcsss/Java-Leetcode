class Solution {
    public boolean isCircularSentence(String sentence) {
        char[] carr = sentence.toCharArray();
        char temp = ' ';
        boolean nextSent = false;

        if(carr[0] != carr[carr.length-1]){
            return false;
        }

        for(int i=0; i<carr.length; i++){
            if(nextSent == true){
                if(temp != carr[i]){
                    return false;
                }
                else{
                    nextSent = false;
                }
            }
            if(carr[i] == ' ' && nextSent == false){
                temp = carr[i-1];
                nextSent = true;
            }
        }
        return true;
    }
}