class Solution {
    public int strStr(String haystack, String needle) {
        char nStart = needle.charAt(0);

        if(haystack.length()==1){
            if(haystack.charAt(0) == needle.charAt(0)){
                return 0;
            }
            else{
                return -1;
            }
        }
        else{
            for(int i=0; i<(haystack.length()-needle.length()+1); i++){
                if(haystack.charAt(i) == nStart){
                    //check
                    int temp = i;
                    boolean checker = true;
                    for(int j=0; j<needle.length(); j++){
                        if(haystack.charAt(temp) == needle.charAt(j)){
                            checker = true;
                            temp++;
                        }
                        else{
                            checker = false;
                            break;
                        }
                    }
                    if(checker == true){
                        return i;
                    }
                    else{
                        //break;
                    }
                }
                else{
                    //loop again
                }
            }
            //default return if needle not found
            return -1;
        }
    }
}